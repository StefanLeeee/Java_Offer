package com.leetcode;

public class T53 {

public static int missNumber(int[] nums) {
    int i = 0, j = nums.length - 1;
    while(i <= j) {
        int m = (i + j) / 2;
        if(nums[m] == m) i = m + 1;
        else j = m - 1;
    }
    return i;
}

    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4,5,7};
        int res = missNumber(nums);
        System.out.println(res);
    }
}
