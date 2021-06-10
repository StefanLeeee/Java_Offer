package com.rex.test.Arrays;

import org.junit.Test;

import javax.swing.plaf.ColorUIResource;
import java.util.Date;

/**
 * @author Zhang
 * @date 2021/4/1 14:00
 * @description
 */
public class BinarySearch {

    private BinarySearch(){};

    public static int BinarySearch(Comparable[] Arr, int n, Comparable target) {
        int l = 0, r = n - 1;   // 在[1,r]中查找target
        while (l <= r)   //当l=r时，[l,r]是有效的
        {
            int mid = l + (r - l) / 2;
            if (Arr[mid].compareTo(target) == 0) return mid;
            if (Arr[mid].compareTo(target) > 0) r = mid - 1;
            else l = mid + 1;
        }


        return -1;
    }


    public static void main(String[] args) {
        int n = (int) Math.pow(10, 7);

        Integer[] integers = Util.generateOrderedArray(n);
        long Current_Time = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            if (i != BinarySearch(integers, n, i))
                throw new IllegalStateException("find i failed");
        }

        long End_Time = System.currentTimeMillis();

        System.out.println("程序运行时间："+(End_Time - Current_Time)+"ms");

    }
}
