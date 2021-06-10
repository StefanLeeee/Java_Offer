package com.rex.test.Arrays;

import org.junit.Test;

/**
 * @author Zhang
 * @date 2021/4/6 18:00
 * @description :给定一个数组nums和一个数值val，将数组中所有等于val的元素删除，并返回剩余的元素个数
 * 如 nums=[3，2，2，3] ，val=3
 * 返回2，且nums中的前两个元素为2
 */
public class Remove_Element {
    public static int Remove_Value(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 3, 5, 3};

        System.out.println(Remove_Value(nums, 2));


        for (int num : nums) {
            System.out.println(num);

        }
    }


}

