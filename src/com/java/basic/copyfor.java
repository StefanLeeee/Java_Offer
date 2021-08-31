package com.java.basic;

/**
 * @author Zhang
 * @date 6/18/2021 10:01 AM
 * @description java 浅拷贝和深拷贝的区别
 * <p>
 * java拷贝的分类
 * 1、引用拷贝
 * 创建一个指向对象的引用变量的拷贝
 */
public class copyfor {
    static class Teacher {
        String name;
        int age;

        public Teacher(String name, int age) {
            this.name = name;
            this.age = age;

        }
    }


    public static void main(String[] args) {
        Teacher teacher = new Teacher("Rex", 22);
        Teacher otherteacher = teacher;
        System.out.println(teacher);
        System.out.println(otherteacher);
    }



    }
