package com.leetcode.array;

/**
 * @author Zhang
 * @date 6/24/2021 11:05 AM
 * @description
 *  字符串反转
 */
public class T344 {
    public void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}
