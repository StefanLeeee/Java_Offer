package com.shangguigu.java.mutiThread;
/**
 * @author Zhang
 * @date 5/12/2021 1:27 PM
 * @description 多线程的创建，方式一：继承于Thread类
 * 1、创建一个继承于Thread类的子类
 * 2、重写Thread类的run() -->将此线程执行的操作声明在run()中
 * 3、创建Thread类的子类对象
 * 4、通过此对象调用start()
 * 例子：遍历100以内的偶数
 */
class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i < 100; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }
    }
}
public class ThreadTest {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        //通过此对象调用start()  @1启动当前线程 @2调用当前线程的run()
        t1.start();
        //问题一：不能直接使用 run() 的方式启动线程
//        t1.run();
        //问题二：再启动一个线程。遍历100以内的偶数。 不可以让已经start()的线程去执行，会报IllegalThreadStateException
//        t1.start();
        //需要重新创建一个线程的对象

        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0)
                System.out.println(i+"+++++++++++++++++++++++");
        }
    }
}
