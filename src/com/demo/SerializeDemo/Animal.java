package com.demo.SerializeDemo;

import java.io.Serializable;

/**
 * @author Zhang
 * @date 2021/4/13 10:33
 * @description
 */
public class Animal implements Serializable {

    private String color;

    public Animal() {
//没有无参构造将会报错
        System.out.println("调用 Animal 无参构造");
    }

    public Animal(String color) {
        this.color = color;
        System.out.println("调用 Animal 有 color 参数的构造");
    }

    @Override
    public String toString() {
        return "Animal{" + "color='" + color + '\'' + '}';
    }

}
