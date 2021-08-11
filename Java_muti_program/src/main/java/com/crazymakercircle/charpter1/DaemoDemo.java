package com.crazymakercircle.charpter1;

import com.crazymakercircle.util.Print;

import static com.crazymakercircle.util.ThreadUtil.getCurThread;
import static com.crazymakercircle.util.ThreadUtil.sleepMilliSeconds;

/**
 * @author RenbingZhang
 * @Description 守护线程使用方法
 * @create 2021-08-11 8:58 PM
 */
public class DaemoDemo {
    public static final int SLEEP_GAP = 500; //每一轮的睡眠时长
    public static final int MAX_TURN = 4;// 用户线程执行轮次

    //守护线程实现类
    static class DaemoThread extends Thread {
        public DaemoThread() {
            super("daemoThread");

        }

        public void run() {
            Print.synTco("--daemo 线程开始");
            for (int i = 0; ; i++) {
                Print.synTco("--轮次" + i);
                Print.synTco("--守护状态为:" + isDaemon());
                //线程睡眠一会，500毫秒
                sleepMilliSeconds(SLEEP_GAP);

            }
        }
    }

    public static void main(String[] args) {
        Thread daemoThread = new DaemoThread();
        daemoThread.setDaemon(true);
        daemoThread.start();
        //创建一条用户线程，执行4轮
        Thread userThread = new Thread(() -> {
            Print.synTco(">>用户线程开始。");
            for (int i = 0; i < MAX_TURN; i++) {
                Print.synTco(">>轮次：" + i);
                Print.synTco(">>守护状态为：" + getCurThread().isDaemon());
                sleepMilliSeconds(SLEEP_GAP);

            }
            Print.synTco(">>用户线程结束");

        }, "userThread"
        );
        //启动用户线程
        userThread.start();
        Print.synTco("守护状态为：" + getCurThread().isDaemon());
        Print.synTco("运行结束");

    }


}
