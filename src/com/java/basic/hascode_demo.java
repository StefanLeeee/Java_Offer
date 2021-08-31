package com.java.basic;

/**
 * @author Zhang
 * @date 7/14/2021 4:24 PM
 * @description
 */
public class hascode_demo {
    public static void main(String[] args) {

        String str1 = "通话";
        String str2 = "重地";
        System.out.println(String.format("str1：%d | str2：%d",str1.hashCode(),str2.hashCode()));

    }
}
