package com.leetcode;

/**
 * @author Zhang
 * @date 6/15/2021 8:17 PM
 * @description
 * 符合下列属性的数组 arr 称为 山脉数组 ：
 * arr.length >= 3
 * 存在 i（0 < i < arr.length - 1）使得：
 * arr[0] < arr[1] < ... arr[i-1] < arr[i]
 * arr[i] > arr[i+1] > ... > arr[arr.length - 1]
 * 给你由整数组成的山脉数组 arr ，返回任何满足 arr[0] < arr[1] < ... arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1] 的下标 i 。
 */
public class T852 {
    public int peakIndexInMountainArray(int[] arr) {
        int num = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > arr[j + 1]) {
                num = j;
                break;
            }
        }
        return num;
    }
    //二分查找法
    class Solution {
        public int peakIndexInMountainArray(int[] arr) {
            int n = arr.length;
            int left = 1, right = n - 2, ans = 0;
            while (left <= right) {
                int mid = (left + right) / 2;
                if (arr[mid] > arr[mid + 1]) {
                    ans = mid;
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            return ans;
        }
    }
}





