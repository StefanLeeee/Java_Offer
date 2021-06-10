package com.rex.test.Arrays;

/**
 * @author Zhang
 * @date 4/23/2021 8:25 PM
 * @description
 */
public class Merge2Arrays {
    public void merge(int[] nums1,int m,int[] nums2,int n) {
        int p1=0, p2 = 0;
        int[] sorted = new int[m + n];
        int cur;
        while (p1 < m || p2 < n) {
            if (p1 == m) {
                cur = nums2[p2++];
            }
        }


    }

}
