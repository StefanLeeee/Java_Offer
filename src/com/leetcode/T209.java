package com.leetcode;

import java.util.Arrays;
import java.util.HashSet;

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
    class Solution {
        public int minSubArrayLen(int s, int[] nums) {
            int n = nums.length;
            if (n == 0) {
                return 0;
            }
            int ans = Integer.MAX_VALUE;
            int[] sums = new int[n + 1];
            // 为了方便计算，令 size = n + 1
            // sums[0] = 0 意味着前 0 个元素的前缀和为 0
            // sums[1] = A[0] 前 1 个元素的前缀和为 A[0]
            // 以此类推
            for (int i = 1; i <= n; i++) {
                sums[i] = sums[i - 1] + nums[i - 1];
            }
            for (int i = 1; i <= n; i++) {
                int target = s + sums[i - 1];
                int bound = Arrays.binarySearch(sums, target);
                if (bound < 0) {
                    bound = -bound - 1;
                }
                if (bound <= n) {
                    ans = Math.min(ans, bound - (i - 1));
                }
            }
            return ans == Integer.MAX_VALUE ? 0 : ans;
        }
    }


    class Solution1 {
        public int minSubArrayLen(int s, int[] nums) {
            int n = nums.length;
            if (n == 0) {
                return 0;
            }
            int ans = Integer.MAX_VALUE;
            int start = 0, end = 0;
            int sum = 0;
            while (end < n) {
                sum += nums[end];
                while (sum >= s) {
                    ans = Math.min(ans, end - start + 1);
                    sum -= nums[start];
                    start++;
                }
                end++;
            }
            return ans == Integer.MAX_VALUE ? 0 : ans;
        }
    }


    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder stringBuilder = new StringBuilder();
        int[] nums = new int[]{1, 4, 4};
        int i = minSubArrayLen(4, nums);
        System.out.print(i);
        HashSet<?> hashSet = new HashSet<>();

    }

}

