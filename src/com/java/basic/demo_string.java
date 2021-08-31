package com.java.basic;

import com.alibaba.fastjson.JSONObject;

import java.util.LinkedHashMap;

/**
 * @author Zhang
 * @date 8/31/2021 9:55 AM
 * @description
 */
public class demo_string {

    public static void main(String[] args) {
        String regexp = "\'";
        String dbuscard = new String("\'DD3078\',\'DD1111\',\'DD2222\',\'DD2122\',\'DD1222\',\'DD2232\',\'DD2922\'");
        System.out.println(dbuscard);
        String[] dbuscard_split = dbuscard.replace("\'","").split(",");
        JSONObject dbuscard_jsonaobj = new JSONObject(new LinkedHashMap<>());
        for (int i = 0; i < dbuscard_split.length; i++) {
            dbuscard_jsonaobj.put("carnumber" + i, dbuscard_split[i]);
        }
        System.out.println(dbuscard_jsonaobj.toJSONString());


    }
}
