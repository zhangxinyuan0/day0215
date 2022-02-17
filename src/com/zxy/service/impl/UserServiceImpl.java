package com.zxy.service.impl;

import com.zxy.dao.CourseDao;
import com.zxy.dao.GradeDao;
import com.zxy.dao.PowerDao;
import com.zxy.dao.UserDao;
import com.zxy.entity.CourseBean;
import com.zxy.entity.GradeBean;
import com.zxy.entity.PowerBean;
import com.zxy.entity.UserBean;
import com.zxy.service.UserService;

import java.util.List;
import java.util.Map;

/**
 * @Author 张新远
 * @date 2022/2/15 11:48
 * @Version 1.0
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;
    private PowerDao powerDao;
    private CourseDao courseDao;
    private GradeDao gradeDao;

    public CourseDao getCourseDao() {
        return courseDao;
    }

    public void setCourseDao(CourseDao courseDao) {
        this.courseDao = courseDao;
    }

    public GradeDao getGradeDao() {
        return gradeDao;
    }

    public void setGradeDao(GradeDao gradeDao) {
        this.gradeDao = gradeDao;
    }

    public PowerDao getPowerDao() {
        return powerDao;
    }

    public void setPowerDao(PowerDao powerDao) {
        this.powerDao = powerDao;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<UserBean> findAll() {
        List<UserBean> all = userDao.findAll();
        return all;
    }

    @Override
    public List<PowerBean> getPowerList() {
        List<PowerBean> list = powerDao.getPowerList();
        return list;
    }

    @Override
    public void deleteUser(UserBean userBean) {
        userDao.deleteUser(userBean);
    }

    @Override
    public Map<String, Object> findPage(String yema) {
        Map<String, Object> map = userDao.findPage(yema);
        return map;
    }

    @Override
    public UserBean findOneUser(String id) {
        int ids = Integer.parseInt(id);
        UserBean oneUser = userDao.findOneUser(ids);
        return oneUser;
    }

    @Override
    public void updateUser(UserBean userBean) {
        userDao.updateUser(userBean);
    }

    @Override
    public List<GradeBean> findAllGrade() {
        List<GradeBean> gList = gradeDao.findAllGrade();
        return gList;
    }

    @Override
    public void updateGrade(Integer id, int gid) {
        GradeBean gradeBean = gradeDao.findOneGrade(gid);
        UserBean userBean = userDao.findOneUser(id);
        userBean.setGb(gradeBean);
        userDao.updateUser(userBean);
    }

    @Override
    public List<CourseBean> findAllCourse() {

        return courseDao.findAllCourse();
    }

    @Override
    public void updateCourse(UserBean userBean, int[] courseshu) {
        userDao.updateCourse(userBean,courseshu);
    }
}

