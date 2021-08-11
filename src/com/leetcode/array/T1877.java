package com.leetcode.array;



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

    public static int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int res = 0;
        for (int i = 0; i < nums.length/2; ++i) {
            res = Math.max(res, nums[i]+nums[n-i-1]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {3, 5, 4, 2, 4, 6};
        System.out.println(minPairSum(nums));
    }

}
