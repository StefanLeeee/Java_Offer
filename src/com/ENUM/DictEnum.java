package com.ENUM;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Author owen
 * @Date 2021/5/11 12:35
 * @Version 1.0
 */
public enum DictEnum {
    /**
     * 婚姻
     */
    MARRIAGE(1L, "婚姻"),
    /**
     * 岗位
     */
    POST(2L, "岗位"),
    /**
     * 政治面貌
     */
    POLITICCOUNTENANCE(3L, "政治面貌"),
    /**
     * 学历
     */
    EDUCATION(4L, "学历"),
    /**
     * 民族
     */
    NATION(5L, "民族"),
    /**
     * 兴趣特长
     */
    INTERESTANDSPECIALTY(6L, "兴趣特长"),
    /**
     * 外语
     */
    FOREIGNLANGUAGES(7L, "外语"),
    /**
     * 外语水平
     */
    FOREIGNLANGUAGEPROFICIENCY(8L, "外语水平"),
    /**
     * 工衣尺码
     */
    GARMENTSIZE(9L, "工衣尺码"),
    /**
     * 员工状态
     */
    EMPLOYEESTATUS(10L, "员工状态"),
    /**
     * 学历类型
     */
    EDUCATIONTYPE(11L, "学历类型"),
    /**
     * 家庭关系/称谓
     */
    FAMILYRELATIONSHIP(12L, "家庭关系/称谓"),
    /**
     * 员工关系类型
     */
    EMPLOYEERELATIONSHIPTYPE(13L, "员工关系类型"),
    /**
     * 岗位类型
     */
    POSTTYPE(14L, "岗位类型"),
    /**
     * 不接受邀约原因
     */
    REASONSFORREFUSINGANINVITATION(15L, "不接受邀约原因"),
    /**
     * 面试结果
     */
    INTERVIEWRESULT(16L, "面试结果"),
    /**
     * 面试状态
     */
    INTERVIEWSTATUS(23L,"面试状态"),
    /**
     * 颜色
     */
    COLOR(24L,"颜色"),
    /**
     * 重量单位
     */
    SUTTLEUNIT(25L,"重量单位"),
    /**
     * 材质
     */
    MATERIAL(26L,"材质"),
    /**
     * 品牌
     */
    BRAND(28L,"品牌"),
    /**
     * 计量单位
     */
    PRODUCTUNIT(29L,"计量单位"),
    /**
     * 合同类别
     */
    CONTRACTCATEGORY(30L,"合同类别"),
    /**
     * 增补类型
     */
    SUPPLEMENTARYTYPE(31L,"增补类型"),
    /**
     * 招聘状态
     */
    RECRUITMENTSTATUS(32L,"招聘状态"),
    /**
     * 工单状态
     */
    WORKORDERSTATUS(33L,"工单状态"),
    /**
     * 离职原因
     */
    REASONSFORLEAVING(34L,"离职原因"),
    ;


    private Long id;
    private String name;

    public static List<Map<String, Object>> toList() {
        return Arrays.asList(values())
                .stream()
                .map(e -> {
                    Map<String, Object> map = new HashMap<>();
                    map.put("id", e.getId());
                    map.put("name", e.getName());
                    return map;
                })
                .collect(Collectors.toList());
    }

    public static boolean anyMatch(int type) {
        for (DictEnum value : values()) {
            if (value.getId() == type) {
                return true;
            }
        }
        return false;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    DictEnum(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
