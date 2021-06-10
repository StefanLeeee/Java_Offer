package com.test.Arrays;

/**
 * @author Zhang
 * @date 2021/4/7 17:58
 * @description
 */
public class Remove_Duplicated {

        public static int remove(int[] nums) {
                int n=nums.length;
                if (n<=2)
                        return n;
                int slow=2,fast=2;
                while (fast<n){
                        if (nums[slow-2]!=nums[fast]){
                                nums[slow] = nums[fast];
                                ++slow;
                        }
                        ++fast;
                }

        return slow;
        }

        public static void main(String[] args) {

                int[] nums={1,1,1,2,2,3};
                int sum = remove(nums);
//        System.out.println(nums.toString());
                for (int num : nums) {
                        System.out.println(num);

                }
                System.out.println(sum);
        }

}
