package com.java.mutiThread;

/**
 * @author Zhang
 * @date 7/6/2021 12:16 PM
 * @description
 */
public class Thread_Runnable implements Runnable{

    int ticket = 10;
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(ticket--);
        }

    }

}

