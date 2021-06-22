package com.demo.Designpatterns.Singleton;

/**
 * @author Zhang
 * @date 6/21/2021 5:40 PM
 * @description
 *
 *   饿汉式
 *   饿汉式单例类， 在类初始化时，已经自行实例化
 *
 */

public class A {
    private A() {
        System.out.println("A的构造");
    }

    private static A a = new A();

    public static A getInstance() {
        System.out.println("aaaaa");
        return a;
    }
}

