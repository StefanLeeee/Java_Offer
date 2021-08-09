package com.leetcode.findtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author RenbingZhang
 * @Description
 * @create 2021-08-09 10:15 PM
 */
public class T350 {
    static class Solution {
        public int[] intersect(int[] nums1, int[] nums2) {
//            if (nums1.length < nums2.length) {
//                return intersect(nums2, nums1);
//            }
            HashMap<Integer, Integer> record = new HashMap<>();
            for (int i = 0; i < nums1.length; i++) {
                int count = record.getOrDefault(nums1[i], 0)+1;
                record.put(nums1[i], count);
            }
            ArrayList<Integer> result = new ArrayList<Integer>();
            for (int i = 0; i < nums2.length; i++) {
                if (record.containsKey(nums1[i]) && record.get(nums2[i]) > 0) {
                    result.add(nums2[i]);
                    record.put(nums2[i], record.get(nums2[i] - 1));
                }
                
            }
            int[] ret = new int[result.size()];
            int index = 0;
            for (Integer num : result) {
                ret[index++] = num;
            }
            return ret;
        }

    }

    private static void printArr(int[] arr){
        for(int e: arr)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] res = (new Solution()).intersect(nums1, nums2);
        printArr(res);
    }
}
