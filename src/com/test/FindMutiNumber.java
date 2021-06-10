package com.test;

/**
 * @author Zhang
 * @date 2021/3/18 15:46
 * @description
 */
public class FindMutiNumber {
    public int findRepeatNumber(int[] nums) {
        for (int i = 0, n = nums.length; i < n; ++i) {
            while (nums[i] != i) {
                if (nums[i] == nums[nums[i]]) return nums[i];
                swap(nums, i, nums[i]);
            }
        }
        return -1;
    }

    private void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }


    public static void main(String[] args) {
        FindMutiNumber findMutiNumber = new FindMutiNumber();
        int nums[]={2,3,4,2,1};




        int a=findMutiNumber.findRepeatNumber(nums);
        System.out.println(a);

    }
}

