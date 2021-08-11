package com.leetcode.findtable;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author Zhang
 * @date 8/10/2021 6:14 PM
 * @description
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 * 注意：若s 和 t中每个字符出现的次数都相同，则称s 和 t互为字母异位词。
 * 输入: s = "anagram", t = "nagaram"
 * 输出: true
 * 示例 2:
 * 输入: s = "rat", t = "car"
 * 输出: false
 */
public class T242 {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        return Arrays.equals(s1, s2);
    }

    public static void main(String[] args) {
        String s = "adajn";
        String t = "ajnad";
        System.out.println(isAnagram(s, t));
    }
}
