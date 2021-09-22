package com.ENUM;

/**
 * @author Zhang
 * @date 9/16/2021 10:17 AM
 * @description
 */
public enum MONTH_ENMU {
    jan("01"),fen("02"), mar("03");




    private String value;

    MONTH_ENMU(String value) {
        this.value = value;
    }


    public String getValue() {
        return value;
    }
}
