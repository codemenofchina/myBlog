package com.qiang.blog.vo;

import java.sql.Timestamp;

/**
 * Created by chenqiang on 2017/9/12.
 */
public class BlogVO {
    private String id;
    private String title;
    private String transshipUrl;
    private String content;
    private Timestamp addTime;
    private String userId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTransshipUrl() {
        return transshipUrl;
    }

    public void setTransshipUrl(String transshipUrl) {
        this.transshipUrl = transshipUrl;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getAddTime() {
        return addTime;
    }

    public void setAddTime(Timestamp addTime) {
        this.addTime = addTime;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
