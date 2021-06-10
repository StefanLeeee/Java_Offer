package com.rex.test.Arrays;

/**
 * @author Zhang
 * @date 2021/4/13 19:15
 * @description
 */
public class Remove_Double_Element {

    public static int removeDuplicates(int[] nums) {
        int count=0;
        int k=0,j=0;
        for(int i=1;i<nums.length;i++){

            if(nums[k++]==nums[i]){
                count++;
                }

        }
        return k+1;

    }

    public static void main(String[] args) {
        int[] nums={1,1,1,2,2,3};
        int sum = removeDuplicates(nums);
//        System.out.println(nums.toString());
        for (int num : nums) {
            System.out.println(num);

        }
        System.out.println(sum);

    }
}
