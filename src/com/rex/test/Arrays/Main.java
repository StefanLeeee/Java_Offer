package com.rex.test.Arrays;

/**
 * @author Zhang
 * @date 2021/3/31 16:05
 * @description
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0;i<arr.length;i++)
                arr[i]=i;
        System.out.println(arr);
        int[] scores= new int[]{100,99,66};
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }

        for (int score :scores) {
            System.out.println(score);

        }
    }
}
