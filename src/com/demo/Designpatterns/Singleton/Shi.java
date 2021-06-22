package com.demo.Designpatterns.Singleton;

/**
 * @author Zhang
 * @date 6/21/2021 5:59 PM
 * @description
 */
public class Shi {
    public static void main(String[] args) {
        A instance = A.getInstance();
        System.out.println("--------------------");
        B b = B.getInstance();
    }
}
