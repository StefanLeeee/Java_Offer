package com.java.basic;

/**
 * @author Zhang
 * @date 6/18/2021 1:35 PM
 * @description
 */
public class value_to {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        swap(num1, num2);

        System.out.println("num1 = "+num1);
        System.out.println("num2 = "+num2);
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = "+a );
        System.out.println("b = "+b );
    }

}

