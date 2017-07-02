package com.qiang.blog.entity;

/**
 * Created by xiaoqiang on 2017/7/2.
 */
public class User {

    private int userId;

    private String userAccount;

    private String password;

    private String userName;

    private int userType;

    private String userDescribe;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    public String getUserDescribe() {
        return userDescribe;
    }

    public void setUserDescribe(String userDescribe) {
        this.userDescribe = userDescribe;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userAccount='" + userAccount + '\'' +
                ", password='" + password + '\'' +
                ", userName='" + userName + '\'' +
                ", userType=" + userType +
                ", userDescribe='" + userDescribe + '\'' +
                '}';
    }
}
