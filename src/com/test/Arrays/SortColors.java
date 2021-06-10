package com.test.Arrays;

/**
 * @author Zhang
 * @date 2021/4/14 14:59
 * @description
 */
public class SortColors {
    public void sort_Color1(int[] nums) {
        int[] count = {0, 0, 0};
        for (int i = 0; i < nums.length - 1; i++) {
            assert nums[i] >= 0 && nums[i] <= 2;
            count[nums[i]]++;
        }
        int index = 0;
        for (int i = 0; i < count[0]; i++) {
            nums[index++] = 0;
        }
        for (int i = 0; i < count[1]; i++) {
            nums[index++] = 1;

        }
        for (int i = 0; i < count[2]; i++) {
            nums[index++] = 2;
        }
    }

    public void sort_Color2(int[] nums) {
        int n = nums.length;
        int zero = -1;
        int two = n;
        for (int i = 0; i < two; ) {
            if (nums[i]==1)
                i++;
            else if(nums[i]<1)
                swap(nums,++zero, i++);
            else
                swap(nums, --two, i);
        }
    }


    private void swap(int[] nums, int i, int j){
        int t = nums[i];
        nums[i]= nums[j];
        nums[j] = t;
    }

    public static void main(String[] args) {
        int[] nums = {2, 1, 2, 1, 1, 0};
        (new SortColors()).sort_Color2(nums);
        for (int num : nums) {
            System.out.print(num);
        }
    }

}
