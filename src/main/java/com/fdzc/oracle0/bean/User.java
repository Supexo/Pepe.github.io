package com.fdzc.oracle0.bean;


public class User {
    private Integer uid;
    private UserType type;
    private String name;
    private String avatar;
    private Integer balance;

    public User() {
    }

    public User(Integer uid, UserType type, String name, String avatar, Integer balance) {
        this.uid = uid;
        this.type = type;
        this.name = name;
        this.avatar = avatar;
        this.balance = balance;
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

    public void setType(UserType type) {
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
