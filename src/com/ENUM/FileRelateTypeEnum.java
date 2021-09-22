package com.ENUM;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 文件业务类型
 * @author owen
 */
public enum FileRelateTypeEnum {

    HTML_IMAGE(10000, "HTML图片", "/html/"),

    HTML_VIDEO(10003, "HTML视频", "/htmlVideo/"),

    GOODS_IMAGE(10001, "商品图片", "/goods/"),

    GOODS_IMAGE_VIDEO(10002, "商品视频", "/goodsvideo/"),

    PERSON(10101, "个人头象", "/person/"),

    NEWS(10102, "新闻主图片", "/news/"),

    FORUM(10203, "论坛帖子", "/forum/"),

    ATTACHMENT(10204, "产品附件", "/attachment/"),

    VIDEOCOVER(10205,"视频封面图片","/videoCover/"),

    PERSONALITYPICTURE(10206,"个性图片","/personalityPicture/"),

    EMAILATTACHMENT(10207,"邮箱附件","/emailAttachment/"),

    HRATTACHMENT(10208,"人事附件","/hrAttachment/"),

    FORUMREPLY(10209,"论坛回复图片","/forumReply/"),

    EXCELIMPORT(10210,"excel文件导入","/excelImport/"),

    RECRUITMENTREQUIREMENTSATTACHMENT (10211,"招聘需求附件","/recruitmentRequirementsAttachment/"),

    WORKORDERATTACHMENT (10212,"工单附件","/workorderAttachment/"),

    NOTICEATTACHMENT (10213,"通知公告附件","/noticeAttachment/"),

    BUSINESSREPORT (10214,"业务报告","/businessReport/"),


    ;


    private int id;
    private String name;
    private String directory;

    FileRelateTypeEnum(int id, String name, String directory) {
        this.id = id;
        this.name = name;
        this.directory = directory;
    }

    public static List<Map<String, Object>> toList(){
        return Arrays.asList(values())
                .stream()
                .map(fileRelateTypeEnum -> {
                    Map<String, Object> map = new HashMap<>();
                    map.put("id", fileRelateTypeEnum.getId());
                    map.put("name", fileRelateTypeEnum.getName());
                    map.put("type", fileRelateTypeEnum.name());
                    return map;
                })
                .collect(Collectors.toList());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }
}
