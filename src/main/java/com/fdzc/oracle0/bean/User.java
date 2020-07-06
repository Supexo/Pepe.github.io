package com.fdzc.oracle0.bean;


public class User {
    private Integer uid;
    private UserType type;
    private String name;
    private String password;
    private String avatar;
    private Integer balance;
    private String cookie;

    public User() {
    }

    public User(Integer uid, UserType type, String name, String password, String avatar, Integer balance, String cookie) {
        this.uid = uid;
        this.type = type;
        this.name = name;
        this.password = password;
        this.avatar = avatar;
        this.balance = balance;
        this.cookie = cookie;
    }

    public String getCookie() {
        return cookie;
    }

    public void setCookie(String cookie) {
        this.cookie = cookie;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public UserType getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }
}
