package com.demo;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class insert_nonrepeat {
    public static void main(String[] args) {
        List list = new LinkedList();
        Random r= new Random();
        boolean[] flag=new boolean[10];
        for (int i=0;i<10;){
            int a=r.nextInt(10);
            if (!flag[a]){
                list.add(a);
                flag[a]=true;
                i++;
            }
            System.out.println(list.toString());
        }


    }
}
