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
    public boolean checkUserLogin(String username,String password) {
        boolean result;
        User u = userDao.getUser(username);

        if(u==null){
            result = false;
        }else if(u.getPassword().equals(password)){
            result = true;
        }else{
            result = false;
        }
        return result;
    }
}
