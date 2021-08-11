package com.leetcode.findtable;

/**
 * @author Zhang
 * @date 8/11/2021 12:43 PM
 * @description
 */
public class T242_a {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] table = new int[26];
        for (int i = 0; i < s.length(); i++) {
            table[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            System.out.print(t.charAt(i) + "-----");
            System.out.println(t.charAt(i)-'a');
            table[t.charAt(i) - 'a']--;
            if (table[t.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "adajn";
        String t = "ajnad";
        System.out.println(isAnagram(s, t));
    }
}
