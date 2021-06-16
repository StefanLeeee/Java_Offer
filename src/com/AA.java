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


        Integer k = new Integer(300);
        Integer j = 300;


        ArrayList<Integer> ts = new ArrayList<Integer>();
        ts.add(12);
        ts.add(123);
//        System.out.println(ts.toArray());

//        System.out.printf(k == j); //false

        Date date = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        System.out.println("键盘充电完成时间： "+sdf.format(date));;

    }
}
