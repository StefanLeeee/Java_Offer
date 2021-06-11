package com.demo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Zhang
 * @date 2021/4/6 18:30
 * @description
 */
public class sss<T> {

    private T key;

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {





        List<Integer> list = new ArrayList<>();
        list.add(12);

//        list.add("a");

        Class<? extends List> clazz = list.getClass();
        Method add = clazz.getDeclaredMethod("add", Object.class);

        add.invoke(list, "kkk1");

        System.out.println(list);
    }
}
