package com.fdzc.oracle0.service;

import com.fdzc.oracle0.bean.Game;
import com.fdzc.oracle0.bean.User;
import com.fdzc.oracle0.bean.UserType;
import com.fdzc.oracle0.dao.IUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService{
    @Autowired
    IUserDao userDao;

    @Override
    public User checkUserLogin(String username,String password) {
        User u = userDao.getUser(username);
        if(u==null){
            return null;
        }
        if(u.getType()== UserType.BANNED||u.getType()==UserType.DEACTIVATED){
            return null;
        }else if(password.equals(u.getPassword())){
            return u;
        }
        return null;
    }

    @Override
    public User getUserByCookie(String cookie) {
        return userDao.getUserByCookie(cookie);
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
        return null;
    }
}
