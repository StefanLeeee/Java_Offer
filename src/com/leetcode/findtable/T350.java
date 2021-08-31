package com.leetcode.findtable;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Zhang
 * @date 8/9/2021 11:03 AM
 * @description
 */
public class T350 {

    public int[] intersect(int[] nums1, int[] nums2) {
        int[] resArray = new int[10];

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int i : nums1) {
            set1.add(i);
        }
        for (int i : nums2) {
            set2.add(i);
        }

        return resArray;
    }
    public int[] getIntersection(Set<Integer> set1, Set<Integer> set2) {


        if (set1.size() > set2.size()) {
            return getIntersection(set2, set1);
        }
        HashSet<Integer> intersectionset = new HashSet<>();
        for (Integer integer : set1) {
            while (set2.contains(integer)) {
                intersectionset.add(integer);
            }
        }
        int[] Intersection = new int[intersectionset.size()];

        int index = 0;
        for (int num : intersectionset) {
            Intersection[index++] = num;
        }

        return Intersection;
    }
}
