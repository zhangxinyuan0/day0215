package com.zxy.service;

import com.zxy.entity.CourseBean;
import com.zxy.entity.GradeBean;
import com.zxy.entity.PowerBean;
import com.zxy.entity.UserBean;

import java.util.List;
import java.util.Map;

public interface UserService {
    List<UserBean> findAll();

    List<PowerBean> getPowerList();

    void deleteUser(UserBean userBean);

    Map<String, Object> findPage(String yema);

    UserBean findOneUser(String id);

    void updateUser(UserBean userBean);

    List<GradeBean> findAllGrade();

    void updateGrade(Integer id, int gid);

    List<CourseBean> findAllCourse();
}
