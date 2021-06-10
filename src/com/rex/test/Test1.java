package com.rex.test;

public class Test1 {

    public static void main(String[] args) {
        String str = "报警天下网吧JAVA时间";

        byte[] srtbyte = str.getBytes();

        System.out.println(srtbyte);

        String res = new String(srtbyte);

        System.out.println(res);

    }



}
