package com.io.bio.client;

import java.io.IOException;
import java.net.Socket;
import java.util.Date;

/**
 * @author Zhang
 * @date 6/10/2021 11:24 AM
 * @description: 客户端
 */
public class IOClient {
    public static void main(String[] args){
        //创建多个线程，模拟多个客户端连接服务器
        new Thread(() -> {
            try{
                Socket socket = new Socket("127.0.0.1",3333);
                while (true) {
                    try{
                        socket.getOutputStream().write((new Date()+":hello world").getBytes());
                        Thread.sleep(2000);
                    }catch(Exception e){
                        System.out.println(e);
                    }
                }
            }catch (IOException e){
                System.out.println(e);
            }
        }).start();

    }

}
