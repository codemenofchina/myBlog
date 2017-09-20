package com.qiang.blog.dto;


/**
 * Created by chenqiang on 2017/9/12.
 */
public class BlogDTO {
    private String blogId;
    private String blogTitle;
    private String transshipUrl;
    private String blogContent;
    private String blogTime;
    private String blogUser;

    public String getBlogId() {
        return blogId;
    }

    public void setBlogId(String blogId) {
        this.blogId = blogId;
    }

    public String getBlogTitle() {
        return blogTitle;
    }

    public void setBlogTitle(String blogTitle) {
        this.blogTitle = blogTitle;
    }

    public String getTransshipUrl() {
        return transshipUrl;
    }

    public void setTransshipUrl(String transshipUrl) {
        this.transshipUrl = transshipUrl;
    }

    public String getBlogContent() {
        return blogContent;
    }

    public void setBlogContent(String blogContent) {
        this.blogContent = blogContent;
    }

    public String getBlogTime() {
        return blogTime;
    }

    public void setBlogTime(String blogTime) {
        this.blogTime = blogTime;
    }

    public String getBlogUser() {
        return blogUser;
    }

    public void setBlogUser(String blogUser) {
        this.blogUser = blogUser;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "blogId='" + blogId + '\'' +
                ", blogTitle='" + blogTitle + '\'' +
                ", transshipUrl='" + transshipUrl + '\'' +
                ", blogContent='" + blogContent + '\'' +
                ", blogTime=" + blogTime +
                ", blogUser='" + blogUser + '\'' +
                '}';
    }
}
