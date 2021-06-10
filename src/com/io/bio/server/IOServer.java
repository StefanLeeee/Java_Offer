package com.io.bio.server;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Zhang
 * @date 6/10/2021 11:25 AM
 * @description 服务端
 */
public class IOServer {
    public static void main(String[] args) throws IOException {
        //服务端处理客户端连接请求
        ServerSocket serverSocket = new ServerSocket(3333);
        //获取客户端连接之后为每个连接创建线程进行链路处理
        new Thread(() -> {
            while (true) {
                try {
                    //阻塞方法获取新的连接
                    Socket socket = serverSocket.accept();
                    //每一个新的连接都创建一个线程，负责读取数据
                    new Thread(() -> {
                        try {
                            int len;
                            byte[] data = new byte[1024];
                            InputStream inputStream = socket.getInputStream();
                            //按字节流方式读取数据
                            while ((len = inputStream.read(data)) != -1) {
                                System.out.println(new String(data, 0, len));
                            }
                        } catch (IOException e) {
                        }
                    }).start();

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }
}
