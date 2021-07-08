package com.sssjd;

import java.sql.DriverManager;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/**
 * @author Zhang
 * @date 6/30/2021 9:37 AM
 * @description
 */

/*
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.UUID;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.clients.producer.ProducerConfig;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.ScanParams;
import redis.clients.jedis.ScanResult;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.sssjd.taxi.stream.overspeed.KafkaJavaConfigure;
import com.sssjd.taxi.stream.roadmatch.common.CommonUtil;
import com.sssjd.taxi.stream.roadmatch.common.RedisUtil;
import com.sssjd.taxi.stream.roadmatch.roadmatch.bean.FenceData;
import com.sssjd.taxi.stream.roadmatch.roadmatch.bean.LonLat;
import com.sssjd.taxi.stream.roadmatch.roadmatch.bean.TrailPoint;
import com.sssjd.taxi.stream.roadmatch.roadmatch.config.ConsumEventProperty;
import com.sssjd.taxi.stream.roadmatch.roadmatch.config.DbProperty;

/**
 * @author 秦松鄂
 * @date 2019年11月11日
 * @company sssjd
 * @description
 */
    /*
public class FenceEvent {
    private static final String HTable = "posState" ;
    private static final String HTable2 = "Area_Alarm" ;
    private static final String HTable3 = "fenceid" ;

    private static final int INSIDE = 0;
    private static final int OUTSIDE = 1;


    private static Connection conn = null;
    private static Statement state = null;
    private static Properties ConsumEventProps = ConsumEventProperty.getConsumEventProperties();
    private static Properties DbProps = DbProperty.getDbProperties();
    static{
        String url = DbProps.getProperty("url");
        String user = DbProps.getProperty("user");
        String pwd = DbProps.getProperty("pwd");
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(url, user, pwd);
            state = conn.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String fence_area_EventType = ConsumEventProps.getProperty("Fence_area_EventType");
        String fence_areatime_EventType = ConsumEventProps.getProperty("Fence_areatime_EventType");
        String fence_arealeve_EventType = ConsumEventProps.getProperty("Fence_arealeve_EventType");

        Jedis jedis = RedisUtil.pool.getResource();
        jedis.del(HTable);
        jedis.del(HTable3);
        //加载kafka.properties
        Properties kafkaProperties =  KafkaJavaConfigure.getKafkaProperties();

        Properties props = new Properties();
        //设置接入点，请通过控制台获取对应Topic的接入点
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,kafkaProperties.getProperty("bootstrap.servers"));//"cdh177:9092,cdh11:9092,cdh204:9092"
        props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG,"latest");

        //可更加实际拉去数据和客户的版本等设置此值，默认30s
        props.put(ConsumerConfig.SESSION_TIMEOUT_MS_CONFIG, 30000);
        //每次poll的最大数量
        //注意该值不要改得太大，如果poll太多数据，而不能在下次poll之前消费完，则会触发一次负载均衡，产生卡顿
        props.put(ConsumerConfig.MAX_POLL_RECORDS_CONFIG, 500);
        //消息的反序列化方式
        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringDeserializer");
        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringDeserializer");
        //当前消费实例所属的消费组，请在控制台申请之后填写
        //属于同一个组的消费实例，会负载消费消息
        props.put(ConsumerConfig.GROUP_ID_CONFIG, kafkaProperties.getProperty("group.id.fence"));
        //构造消息对象，也即生成一个消费实例
        KafkaConsumer<String, String> consumer = new KafkaConsumer<String, String>(props);
        //设置消费组订阅的Topic，可以订阅多个
        //如果GROUP_ID_CONFIG是一样，则订阅的Topic也建议设置成一样
        List<String> subscribedTopics =  new ArrayList<String>();
        //如果需要订阅多个Topic，则在这里add进去即可
        //每个Topic需要先在控制台进行创建
        subscribedTopics.add("vdp_roadmatch_cz_test");//kafkaProperties.getProperty("topic_gps")
        consumer.subscribe(subscribedTopics);

        while (true) {

            Set<String> keys = jedis.hkeys(HTable2);
            ArrayList<FenceData> boundarys = new ArrayList<FenceData>();
            for(String fenceid :keys){
                String[] fenceinfo = jedis.hget(HTable2,fenceid).split("#");
                boundarys.add(new FenceData(Integer.valueOf(fenceid), fenceinfo[0], fenceinfo[1].split("-")[0],fenceinfo[1].split("-")[1]));
            }

            try {
                String sql = "";
                //获取数据
                ConsumerRecords<String, String> records = consumer.poll(300);
                for (ConsumerRecord<String, String> osrecord : records) {


                    String[] s = osrecord.value().split(",");

                    String dbuscard=s[1];
                    String time = s[3];
                    long longTime = Long.valueOf(s[4]);
                    String speed = s[2];
                    String limit = s[12];
                    String usercode=s[13];
                    String llon = s[5];
                    String llat = s[6];
                    String orientation = s[7];
                    Double ALon=Double.valueOf(llon);
                    Double ALat=Double.valueOf(llat);

                    int status = Integer.valueOf(jedis.hget(HTable, dbuscard) == null ? OUTSIDE+"":jedis.hget(HTable, dbuscard));
                    String fenceHid = jedis.hget(HTable3, dbuscard);

                    int iSum, iCount, iIndex;
                    double dLon1 = 0, dLon2 = 0, dLat1 = 0, dLat2 = 0, dLon;
                    iSum = 0;
                    int fenceid = 0;
                    long slimit = 0L;
                    long elimit = 0L;

                    for(FenceData fd:boundarys){

                        fenceid = fd.getId();
                        String limitstartT = fd.getLimitstartT();
                        String limitstartE = fd.getLimitstartE();

                        slimit = sdf.parse(time.split(" ")[0] + " " + limitstartT).getTime();
                        elimit = sdf.parse(time.split(" ")[0] + " " + limitstartE).getTime();

                        if (fenceHid != null && Integer.valueOf(fenceHid) != fenceid) {
                            continue;
                        }

                        Object[] lls =fd.getFence();
                        iCount = lls.length;

                        for (iIndex = 0; iIndex<iCount;iIndex++) {
                            if (iIndex == iCount - 1) {
                                dLon1 = ((LonLat)lls[iIndex]).getLon();
                                dLat1 = ((LonLat)lls[iIndex]).getLat();
                                dLon2 = ((LonLat)lls[0]).getLon();
                                dLat2 = ((LonLat)lls[0]).getLat();
                            } else {
                                dLon1 = ((LonLat)lls[iIndex]).getLon();
                                dLat1 = ((LonLat)lls[iIndex]).getLat();
                                dLon2 = ((LonLat)lls[iIndex + 1]).getLon();
                                dLat2 = ((LonLat)lls[iIndex + 1]).getLat();
                            }
                            // 以下语句判断A点是否在边的两端点的水平平行线之间，在则可能有交点，开始判断交点是否在左射线上
                            if (((ALat >= dLat1) && (ALat < dLat2)) || ((ALat >= dLat2) && (ALat < dLat1))) {
                                if (Math.abs(dLat1 - dLat2) > 0) {
                                    //得到 A点向左射线与边的交点的x坐标：
                                    dLon = dLon1 - ((dLon1 - dLon2) * (dLat1 - ALat) ) / (dLat1 - dLat2);
                                    // 如果交点在A点左侧（说明是做射线与 边的交点），则射线与边的全部交点数加一：
                                    if (dLon < ALon) {
                                        iSum++;
                                    }
                                }
                            }
                        }

                        if ((iSum % 2) != 0 || fenceHid != null) {
                            break;
                        }


                    }


                    if ((iSum % 2) == 0) {//外

                        if (status == INSIDE) {//历史状态为栅栏内    出栅栏
                            UUID randomUUID = UUID.randomUUID();

                            sql += String.format("	insert into T_AlarmJ ([dguid],[dbuscard],[alarmtype],uid,starttime,updateTime,area_id) "
                                    + "values ('%s','%s','%s','%s',getdate(),getdate(),'%s')",usercode,dbuscard,fence_arealeve_EventType,randomUUID,fenceid);

                            jedis.hset(HTable, dbuscard, OUTSIDE+"");
                            jedis.hdel(HTable3,dbuscard);
                        }

                    }else {//内

                        if (status == OUTSIDE) {//历史无状态或者状态为栅栏外    进入栅栏
                            UUID randomUUID = UUID.randomUUID();

                            if (longTime > slimit && longTime < elimit) {
                                sql += String.format("	insert into T_AlarmJ ([dguid],[dbuscard],[alarmtype],uid,starttime,updateTime,area_id) "
                                        + "values ('%s','%s','%s','%s',getdate(),getdate(),'%s')",usercode,dbuscard,fence_areatime_EventType,randomUUID,fenceid);
                            }else {
                                sql += String.format("	insert into T_AlarmJ ([dguid],[dbuscard],[alarmtype],uid,starttime,updateTime,area_id) "
                                        + "values ('%s','%s','%s','%s',getdate(),getdate(),'%s')",usercode,dbuscard,fence_area_EventType,randomUUID,fenceid);
                            }

                            jedis.hset(HTable, dbuscard, INSIDE+"");
                            jedis.hset(HTable3, dbuscard, fenceid+"");
                        }
                    }




                }

                if (sql != "") {
                    int result = state.executeUpdate(sql);
                }

            } catch (Exception e) {
                e.printStackTrace();
                String url = DbProps.getProperty("url");
                String user = DbProps.getProperty("user");
                String pwd = DbProps.getProperty("pwd");
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                conn = DriverManager.getConnection(url, user, pwd);
                state = conn.createStatement();
                continue;
            }
        }

    }
}

*/
