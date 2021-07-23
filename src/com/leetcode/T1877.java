package com.leetcode;

import com.test.Arrays.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Map;

/**
 * @author Zhang
 * @date 7/20/2021 11:15 AM
 * @description
 */
public class T1877 {

    public int minPairSum(int[] nums) {



        Arrays.stream(nums).sorted();

        int left = 0;
        int right = nums.length - 1;
        ArrayList<Integer> new_arr = new ArrayList<>();
        while (left <= right) {
            int count = nums[left] + nums[right];
            new_arr.add(count);
        }


    }

    public static void main(String[] args) {
        int[] nums = {3, 5, 4, 2, 4, 6};

    }

}
