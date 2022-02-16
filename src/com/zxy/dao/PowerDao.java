package com.zxy.dao;

import com.zxy.entity.PowerBean;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * @Author 张新远
 * @date 2022/2/16 11:27
 * @Version 1.0
 */
public class PowerDao {
    private SessionFactory sessionFactory;
    public Session getSession(){
        return sessionFactory.getCurrentSession();
    }
    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    ///////////////////////////////////
    public List<PowerBean> getPowerList() {
        List list = getSession().createQuery("from PowerBean").list();
        return list;
    }
}

