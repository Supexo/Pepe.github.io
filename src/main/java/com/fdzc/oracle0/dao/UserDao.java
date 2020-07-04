package com.fdzc.oracle0.dao;

import com.fdzc.oracle0.bean.Game;
import com.fdzc.oracle0.bean.User;
import com.fdzc.oracle0.bean.UserType;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDao implements IUserDao{
    private List<User> users;
    private void setTestUser(){
        users = new ArrayList<>();
        users.add(new User(1001, UserType.DEFAULT ,"TypeAlpha","123456aa","",10000));
        users.add(new User(1002, UserType.DEFAULT ,"Komachi","123456aa","",10000));
        users.add(new User(1003, UserType.DEFAULT ,"Kirin","123456aa","",10000));
    }

    @Override
    public List<Game> getUserGames(int uid) {
        return null;
    }

    @Override
    public void addUser(User user) {

    }

    @Override
    public void changePass(int uid) {

    }

    @Override
    public void banUser(int uid, int level) {

    }

    @Override
    public List<User> getUsers(int page) {
        return null;
    }

    @Override
    public User getUser(int uid) {
        setTestUser();
        for(User u:users){
            if(uid==u.getUid()){
                return u;
            }
        }
        return null;
    }

    @Override
    public User getUser(String name) {
        // 设置测试用代码
        setTestUser();
        for(User u:users){
            if(name.equals(u.getName())){
                return u;
            }
        }
        return null;
    }

    @Override
    public void setBalance(int uid) {

    }
}
