package com.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author Zhang
 * @date 6/29/2021 2:51 PM
 * @description
 */
public class Scanner_Demo {
    public static void main(String[] args) throws IOException {
//        Scanner input = new Scanner(System.in);
//        String s = input.nextLine();
//        input.close();
//        System.out.println(s);

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String s = input.readLine();
        System.out.println(s);
    }
}
