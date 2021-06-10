package com.demo;

public class Starprint {

    public static void main(String[] args) {
        // *
        // **
        // ***
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("--------------------------------------");
        // ***
        // **
        // *
        for (int i = 0; i < 3; i++) {
            for (int j = 3; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------");
        // 00*
        // 0**
        // ***
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                if (j > 3 - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("-------------------------------------");

        // ***
        // 0**
        // 00*

    }
}