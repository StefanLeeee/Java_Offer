package com.demo.sort;

/**
 * @author Zhang
 * @date 6/17/2021 4:06 PM
 * @description
 */
public class quickSort2 {
    public static void QuickSort(int nums[], int begin, int end) {

        if (begin < end) {
            int base = nums[begin];  //选定基准值
            int temp;
            int i = begin, j = end;
            do {
                while (nums[i] < base && i < end)
                    i++;
                while (nums[j] > base && i < end)
                    j--;
                if (i <= j) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    i++;
                    j--;

                }
            } while (i <= j);
            if (begin < j) {
                QuickSort(nums, begin, j);
            }
            if (end > j) {
                QuickSort(nums, i,end);
            }
        }


    }

    public static void main(String[] args) {

        int[] nums = new int[]{23, 45, 17, 11, 13, 89, 72, 26, 3, 17, 11, 13};
//        int num[ 12] = [23, 45, 17, 11, 13, 89, 72, 26, 3, 17, 11, 13]
        QuickSort(nums, 0, nums.length - 1);
        for (int x : nums) {
            System.out.println(x);
        }



    }
}
