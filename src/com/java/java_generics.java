package com.java;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Zhang
 * @date 6/15/2021 1:25 PM
 * @description  Java 泛型
 */
public class java_generics {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        List<Integer> list = new ArrayList<>();
        list.add(12);
//        list.add("asdf");   这里直接添加会报错
        Class<? extends List> clazz = list.getClass();
        Method add = clazz.getDeclaredMethod("add", Object.class);
    // 通过反射添加，是可以的
        add.invoke(list, "adsda");
        System.out.println(list);

    }

    class Generic<T>{

    }

}
