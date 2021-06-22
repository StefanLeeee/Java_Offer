package com.leetcode;

import com.sun.jmx.snmp.SnmpUnknownMsgProcModelException;

import java.util.ArrayList;
import java.util.EnumSet;

/**
 * @author Zhang
 * @date 6/21/2021 3:59 PM
 * @description
 * 给定一个已按照 升序排列  的整数数组 numbers ，请你从数组中找出两个数满足相加之和等于目标数 target 。
 * 函数应该以长度为 2 的整数数组的形式返回这两个数的下标值。numbers 的下标 从 1 开始计数 ，所以答案数组应当满足 1 <= answer[0] < answer[1] <= numbers.length 。
 * 你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素。
 *
 */
public class T167 {

    //暴力解法，多个符合条件的值，只打印
    static class T167_1{
        public static int[] twoSum(int[] numbers, int target) {

            ArrayList<? extends Integer> ts = new ArrayList();
            int[] a = new int[2];

            for (int i = 0; i < numbers.length; i++) {
                for (int j = 1; j < numbers.length; j++) {
                    if (target == numbers[i] + numbers[j]) {
                        a[0] = i;
                        a[1] = j;
                    }
                }
            }
            System.out.println(a.toString());
            return a;

        }

        public static void main(String[] args) throws ClassNotFoundException {
            int[] numbers = new int[]{3, 7, 9, 6};
            int target = 9;
            Class.forName("T167_1").isInstance("obj_for_class");

            int[] a = twoSum(numbers, target);
            for (int i : a) {
                System.out.println(i);

            }
        }
    }


}
