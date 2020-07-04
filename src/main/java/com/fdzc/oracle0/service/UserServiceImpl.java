package com.fdzc.oracle0.service;

import com.fdzc.oracle0.bean.User;
import com.fdzc.oracle0.dao.IUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService{
    @Autowired
    IUserDao userDao;

    @Override
    public User checkUserLogin(String username,String password) {
        User u = userDao.getUser(username);
        if(password.equals(u.getPassword())){
            return u;
        }
        return null;
    }

    @Override
    public User getUserByCookie(String cookie) {
        return userDao.getUserByCookie(cookie);
    }
}
