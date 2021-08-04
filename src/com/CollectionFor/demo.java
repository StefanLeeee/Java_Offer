package com.CollectionFor;

import org.omg.CosNaming.IstringHelper;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/**
 * @author Zhang
 * @date 7/27/2021 9:10 AM
 * @description
 */
public class demo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("ben");
        list.add("ben1");
        list.add("ben2");
        list.add("ben2");
        Iterator<String> it = list.iterator();

        HashSet<String> strings = new HashSet<>();

        System.out.println(list.toString());
    }
}
