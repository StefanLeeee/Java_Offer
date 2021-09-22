package com.ENUM;

/**
 * @author ：Aimine
 * @date ：2021/2/20 9:29
 * @description：
 */
public enum ConditionEnum {

    JAN("jan","1"),
    NOT_EQUALS("NOT_EQUALS","不等于"),
    GREATER_THAN("GREATER_THAN","大于"),
    LESS_THAN("LESS_THAN","小于"),
    STARTS_WITH("STARTS_WITH","开头为"),
    ENDS_WITH("ENDS_WITH","结尾为"),
    CONTAINS("CONTAINS","包含"),
    NOT_CONTAINS("NOT_CONTAINS","不包含");


    /**
     * 枚举名称
     */
    private final String name;

    /**
     * 枚举标题
     */
    private final String title;

    ConditionEnum(String name, String title) {
        this.name = name;
        this.title = title;
    }
    public String getName() {
        return this.name;
    }

    public String getTitle() {
        return title;
    }

}
