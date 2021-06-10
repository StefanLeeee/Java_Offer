package com.rex.test.Arrays;

import org.junit.Test;

import java.util.ArrayList;

/**
 * @author Zhang
 * @date 2021/4/6 10:12
 * @description move zero to make
 */
public class MoveZeros {
    public void Move_zeros(int[] nums) {
        ArrayList<Integer> nonZeroElements = new ArrayList<Integer>();

        // 将vec中所有非0元素放入nonZeroElements中
        for (int i = 0; i < nums.length; i++)
            if (nums[i] != 0)
                nonZeroElements.add(nums[i]);

        // 将nonZeroElements中的所有元素依次放入到nums开始的位置
        for (int i = 0; i < nonZeroElements.size(); i++)
            nums[i] = nonZeroElements.get(i);

        // 将nums剩余的位置放置为0
        for (int i = nonZeroElements.size(); i < nums.length; i++)
            nums[i] = 0;
    }

    public void Move_zero_two(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=0)
                nums[k++]=nums[i];
        }

        for (int i=k;i<nums.length;i++)
        {
            nums[i]=0;
        }

    }

    public void Move_zero_three(int[] nums){
        int k = 0;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i]!=0) {
                swap(nums,i,k++);

            }
        }
    }

    public void Move_zero_four(int[] nums){
        int k=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=0){
                if (k!=i)
                    swap(nums,i,k++);
                else
                    k++;
            }

        }
    }
    private void swap(int[] nums,int a ,int b){
        int t = nums[a];
        nums[a] = nums[b];
        nums[b] = t;

    }

    public static void main(String args[]) {

        int[] arr = {0, 1, 0, 3, 12};

        //1
//        (new MoveZeros()).Move_zeros(arr);

        //2
//        MoveZeros moveZeros = new MoveZeros();
//        moveZeros.Move_zero_two(arr);
        //3

        MoveZeros moveZeros = new MoveZeros();
        moveZeros.Move_zero_four(arr);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
