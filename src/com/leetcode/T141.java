package com.leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 返回给定数组中第三大的数
 */
public class T141 {
//    public static int thirdMax(int[] nums) {
//        Arrays.sort(nums);
//        reverse(nums);
//        for (int i = 1, diff = 1; i < nums.length; ++i) {
//            if (nums[i] != nums[i - 1] && ++diff == 3) { // 此时 nums[i] 就是第三大的数
//                return nums[i];
//            }
//        }
//        return nums[0];
//    }
//
//    public static void reverse(int[] nums) {
//        int left = 0, right = nums.length - 1;
//        while (left < right) {
//            int temp = nums[left];
//            nums[left] = nums[right];
//            nums[right] = temp;
//            left++;
//            right--;
//        }
//
//    }



//public static int thirdMax(int[] nums) {
//    Arrays.sort(nums);
//    reverse(nums);
//    for (int i = 1, diff = 1; i < nums.length; ++i) {
//        System.out.println(i+"========="+nums[i]);
//        if (nums[i] != nums[i - 1] && ++diff == 3) { // 此时 nums[i] 就是第三大的数
//            return nums[i];
//        }
//    }
//    return nums[0];
//}
//
//    public static void reverse(int[] nums) {
//        int left = 0, right = nums.length - 1;
//        while (left < right) {
//            int temp = nums[left];
//            nums[left] = nums[right];
//            nums[right] = temp;
//            left++;
//            right--;
//        }
//    }

    public static int thirdMax(int[] nums) {
        Integer[] IntegerArr = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(IntegerArr, Collections.reverseOrder());
        for (int i = 1, diff = 1; i < IntegerArr.length; ++i) {
            System.out.println(i+"========="+IntegerArr[i]);
            if (IntegerArr[i].compareTo(IntegerArr[i-1])!=0 && ++diff == 3) { // 此时 nums[i] 就是第三大的数
                return IntegerArr[i];
            }
        }
        return IntegerArr[0];

    }

    public static void main(String[] args) {
        int[] nums = {-2147483648,-2147483648,-2147483648,-2147483648,1,1,1};

        int thirdNum = thirdMax(nums);
        System.out.println(thirdNum);
    }
}
