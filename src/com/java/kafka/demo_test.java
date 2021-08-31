//package com.java.kafka;
//
//import org.junit.Test;
//
///**
// * @author Zhang
// * @date 8/27/2021 2:20 PM
// * @description
// */
//public class demo_test {
//
//    public class DmsProducerTest {
//        @Test
//        public void testProducer() throws Exception {
//            DmsProducer<String, String> producer = new DmsProducer<String, String>();
//            int partiton = 0;
//            try {
//                for (int i = 0; i < 10; i++) {
//                    String key = null;
//                    String data = "The msg is " + i;
//                    // 注意填写您创建的topic名称。另外，生产消息的API有多个，具体参见Kafka官网或者下文的生产消息代码。
//                    producer.produce("topic-0", partiton, key, data, new Callback() {
//                        public void onCompletion(RecordMetadata metadata,
//                                                 Exception exception) {
//                            if (exception != null) {
//                                exception.printStackTrace();
//                                return;
//                            }
//                            System.out.println("produce msg completed");
//                        }
//                    });
//                    System.out.println("produce msg:" + data);
//                }
//            } catch (Exception e) {
//                // TODO: 异常处理
//                e.printStackTrace();
//            } finally {
//                producer.close();
//            }
//        }
//    }
//
//}
