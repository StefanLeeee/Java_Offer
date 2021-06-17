package com.demo.sort;

import com.sun.xml.internal.bind.v2.model.annotation.Quick;

/**
 * @author Zhang
 * @date 6/17/2021 4:06 PM
 * @description
 */
public class quickSort {
    public static void QuickSort(int nums[], int begin, int end) {

        if (begin < end) {
            int temp = nums[begin];
            int i = begin;
            int j = end;
            while (i < j) {
                //当右边的数大于基准数时，略过，继续向左查找
                while (i < j && nums[j] > temp)
                    j--;
                //将右边的数小于基准元素的数填入右边相应位置
                nums[i] = nums[j];
                while (i < j && nums[i] <= temp)
                    i++;
                //将左边大于基准元素的数填入左边相应位置
                nums[j] = nums[i];
            }
            //将基准元素填入相应位置
            nums[i] = temp;
            //此时的i即为基准元素的位置
            //对 基准元素的左边子区间进行相似的快速排序
            QuickSort(nums, begin, i - 1);
            QuickSort(nums, i + 1, end);
        } else {
            return;
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
