package com;

import java.util.function.Consumer;

/**
 * @author Zhang
 * @date 6/3/2021 5:59 PM
 * @description
 */
public class AA {
    public static void main(String[] args) {

        int num = 10;
        Consumer<String> consumer = ele -> {
            System.out.println(num);
            System.out.println(ele.getClass());
        };
        consumer.accept("hhel");

    }
}
