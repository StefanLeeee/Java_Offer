package com.test.Arrays;

/**
 * @author Zhang
 * @date 4/21/2021 5:46 PM
 * @description
 */
public class Demo {



    public static void main(String[] args) {
        int[] nums111 = new int[10];
//        int[] nums = {1, 2, 3, 5, 6};

        nums111[0] = 1;
        nums111[1] = 2;
        nums111[5] = 5;
        System.out.println(nums111.toString());
        for (int i : nums111) {
            System.out.println(i);

        }

        System.out.println(nums111.length);
    }

}
