package com.leetcode;

public class T209 {
    public static int minSubArrayLen(int s, int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                if (sum >= s) {
                    ans = Math.min(ans, j - i + 1);
                    break;
                }
            }
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }










    public static void main(String[] args) {
        int[] nums = new int[]{1, 4, 4};
        int i = minSubArrayLen(4, nums);
        System.out.print(i);

    }

}

