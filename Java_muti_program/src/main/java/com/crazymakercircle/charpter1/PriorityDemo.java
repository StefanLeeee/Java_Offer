package com.crazymakercircle.charpter1;

/**
 * @author Zhang
 * @date 8/10/2021 4:57 PM
 * @description
 * 两个线程优先级实例方法的使用
 */
public class PriorityDemo {

    public static final int SLEEP_GAP = 1000;

    static class PrioritySetThread extends Thread {
        static int threadNo = 1;
        public PrioritySetThread() {
            super("thread- " + threadNo);
            threadNo++;
        }

        public long opportunities = 0;
        public void run() {
            for (int i = 0; ; i++) {
                opportunities++;
            }
        }
    }


    public static void main(String[] args) {
        PrioritySetThread[] threads = new PrioritySetThread[10];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new PrioritySetThread();
            //System.out.println(threads.toString());
        }
    }

}
