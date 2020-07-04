package com.fdzc.oracle0.service;

import com.fdzc.oracle0.bean.User;

public interface IUserService {
    public User checkUserLogin(String username, String password);
    public User getUserByCookie(String cookie);
}
