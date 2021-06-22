package com.demo.Designpatterns.Singleton;

/**
 * @author Zhang
 * @date 6/22/2021 10:01 AM
 * @description
 *
 * 懒汉式
 * 当程序第一次访问单件模式实例时才进行创建
 */
public class B {
    private B() {
        System.out.println("B的构造函数");
    }

    private static B b;

    public static B getInstance() {
        if (b == null) {
            return new B();
        }
        System.out.println("bbbbbbbb");
        return b;



    }


}
