package com.leetcode;

/**
 * @author Zhang
 * @date 6/24/2021 1:21 PM
 * @description
 *   反转字符串中的元音字母
 *
 */

public class T345 {
    public static String reverseVowels(String s) {

        char[] Char = s.toCharArray();

        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (!isVowel(Char[left])) {
                left++;
                continue;
            } else if (!isVowel(Char[right])) {
                right--;
                continue;
            } else {
                char temp = Char[left];
                Char[left] = Char[right];
                Char[right] = temp;
            }
            left++;
            right--;
        }
        return new String(Char);
    }

    @DemoRex
    private static boolean isVowel(char c) {

        return c == 'a' || c == 'o' || c == 'e' || c == 'i' || c == 'u' || c == 'A' ||
                c == 'O' || c == 'E' || c == 'I' || c == 'U';
    }

    public static void main(String[] args) {
        String s = "hellobdafjkbkdajfdsfoweoi";
        String a  = reverseVowels(s);
        System.out.println(a);
    }
}
