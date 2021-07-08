package com.java;

/**
 * @author Zhang
 * @date 6/30/2021 1:25 PM
 * @description
 *
 * 跳出多重循环
 *
 */
public class breakmultfor {
    public static void main(String[] args) {
        ok:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("i=" + i + ",j=" + j);
                if (j == 5) {
                    break ok;
                }

            }
        }
    }
}
