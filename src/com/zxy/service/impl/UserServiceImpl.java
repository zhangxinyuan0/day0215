package com.zxy.service.impl;

import com.zxy.dao.UserDao;

/**
 * @Author 张新远
 * @date 2022/2/15 11:48
 * @Version 1.0
 */
public class UserServiceImpl {
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}

