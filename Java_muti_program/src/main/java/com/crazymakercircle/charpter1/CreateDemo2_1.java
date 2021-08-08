package com.crazymakercircle.charpter1;

import com.crazymakercircle.util.Print;

/**
 * @author RenbingZhang
 * @Description
 * @create 2021-08-08 5:45 PM
 */
public class CreateDemo2_1 {
    public static final int MAX_TURN = 5;
    static int threadNo = 1;
    public static String getCurThreadName() {
        return Thread.currentThread().getName();
    }
    public static void main(String[] args) {
        Thread thread = null;
        //使用Runnable的匿名函数创建和启动线程
        for (int i = 0; i < 2; i++) {
            thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < MAX_TURN; j++) {
                        Print.cfo(getCurThreadName() + "，轮次：" + j);
                    }
                    Print.cfo(getCurThreadName() + "运行结束。");
                }
            }, "RunnableThread" + threadNo++);
            thread.start();
        }
        Print.cfo(getCurThreadName()+"运行结束！！");
    }

}
