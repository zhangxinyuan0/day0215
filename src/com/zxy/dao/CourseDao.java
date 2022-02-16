package com.zxy.dao;

import com.zxy.entity.CourseBean;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * @Author 张新远
 * @date 2022/2/16 14:39
 * @Version 1.0
 */
public class CourseDao {
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

    public List<CourseBean> findAllCourse() {
        List<CourseBean> courseBeanList = this.getSession().createQuery("from CourseBean where 1=1 ").list();
        return courseBeanList;
    }
}

