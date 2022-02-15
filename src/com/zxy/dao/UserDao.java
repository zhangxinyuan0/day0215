package com.zxy.dao;

import org.hibernate.SessionFactory;

/**
 * @Author 张新远
 * @date 2022/2/15 11:48
 * @Version 1.0
 */
public class UserDao {
    private SessionFactory sessionFactory;


    /////////////////////////////

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}

