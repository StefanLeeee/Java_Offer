package com.shangguigu.java.mutiThread;

/**
 * @author Zhang
 * @date 5/12/2021 6:52 PM
 * @description
 */
public class ThreadDemo {
    public static void main(String[] args) {
//        MyThread1 myThread1 = new MyThread1();
//        MyThread2 myThread2 = new MyThread2();
//        myThread1.start();
//        myThread2.start();

        //创建Thread类的匿名子类的方式
        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if (i%2==0)
                        System.out.println(Thread.currentThread().getName()+":"+i);
                }
            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if (i%2!=0)
                        System.out.println(Thread.currentThread().getName()+":"+i);
                }
            }
        }.start();

    }

}

class MyThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i%2==0)
                System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}class MyThread2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i%2!=0)
                System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}