package com;

import javax.jnlp.IntegrationService;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.function.Consumer;

/**
 * @author Zhang
 * @date 6/3/2021 5:59 PM
 * @description
 */
public class AA {
    public static void main(String[] args) {

        int a = 1;
        int b = 1;
        if (a == 1 || (b += 2) > 0) {
            System.out.println("true");
            System.out.println(b);
        }
        System.out.println(b);
    }
}
