package com.crazymakercircle.charpter1;

import com.crazymakercircle.util.Print;
import com.crazymakercircle.util.ThreadUtil;

public class CreateDemo2 {
    public static final int MAX_TURN = 5;
    static int threadNo = 1;
    public static String getCurThreadName() {
        return Thread.currentThread().getName();
    }
    static class RunTarget implements Runnable {
        @Override
        public void run() {
            for (int j = 0; j < MAX_TURN; j++) {
                Print.cfo(ThreadUtil.getCurThread() + "，轮次：" + j);
            }
            Print.cfo(getCurThreadName() + "运行结束。");
        }
    }

    public static void main(String[] args) {
        Thread thread = null;
        for (int i = 0; i < 2; i++) {
            Runnable target = new RunTarget();
            //通过Thread类创建线程对象，将Runnable实例作为实例参数传入
            thread = new Thread(target, "RunnableThread " + threadNo++);
            thread.start();
        }
    }
}
