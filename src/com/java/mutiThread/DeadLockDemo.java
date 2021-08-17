package com.java.mutiThread;

/**
 * @author Zhang
 * @date 8/11/2021 3:52 PM
 * @description 通过一个例子说明线程死锁（线程A持有资源2,线程B持有资源1，
 * 他们都想申请对方的资源，所以这个线程就会因为互相等待而进入死锁状态）
 */
public class DeadLockDemo {
    private static Object resource1 = new Object();
    private static Object resource2 = new Object();

    public static void main(String[] args) {
        new Thread(() -> {
            synchronized (resource1) {
                System.out.println(Thread.currentThread() + "get resource1");
                try {
                    Thread.sleep(1000);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread() + "waiting get resource2");
                synchronized (resource2) {
                    System.out.println(Thread.currentThread() + "get resource 2");
                }
            }

        }, "线程 1 "
        ).start();
        new Thread(() ->{
            synchronized (resource2) {
                System.out.println(Thread.currentThread() + "get resource2");
                try{
                    Thread.sleep(1000);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread() + "waiting get resource 1");
                synchronized (resource1){
                    System.out.println(Thread.currentThread()+"get resource1");
                }
            }
        },"线程2").start();

    }

}
