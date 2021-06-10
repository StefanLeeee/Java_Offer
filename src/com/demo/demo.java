package com.demo;

import javax.swing.*;
import java.util.*;

public class demo {
    public static void main(String[] args) {

        List list =new LinkedList();
        Random r=new Random();
        for (int i=0;i<10;i++){
            System.out.println(r.nextInt());
            int index=r.nextInt(list.size()+1);
            list.add(index,i);
            System.out.println(list.toString());
        }

        System.out.println(list.toString());

//        List list = new LinkedList();
//        Random r= new Random();
//        boolean[] flag=new boolean[10];
//        for(int i=0;i<10;){
//            int a=r.nextInt(10);
//            if (!flag[a]){
//                list.add(a);
//                flag[a]=true;
//                i++;
//            }
//        }
//        System.out.println(list.toString());


    }



}
