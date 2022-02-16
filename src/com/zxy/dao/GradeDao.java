package com.zxy.dao;

import com.zxy.entity.GradeBean;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * @Author 张新远
 * @date 2022/2/16 14:39
 * @Version 1.0
 */
public class GradeDao {
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

    public List<GradeBean> findAllGrade() {
        List<GradeBean> gList = this.getSession().createQuery("from GradeBean where 1 = 1 ").list();
        return gList;
    }

    public GradeBean findOneGrade(int gid) {
        GradeBean o = (GradeBean)this.getSession().get(GradeBean.class, gid);
        return o;
    }
}

