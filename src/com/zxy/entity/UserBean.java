package com.zxy.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author 张新远
 * @date 2022/2/15 11:36
 * @Version 1.0
 */
public class UserBean {
    private Integer id;
    private String uname;
    private String pwd;
    private String age;
    private Date birthday;
    private GradeBean gb;
    private Set<CourseBean> courses = new HashSet<>();

    public GradeBean getGb() {
        return gb;
    }

    public void setGb(GradeBean gb) {
        this.gb = gb;
    }

    public Set<CourseBean> getCourses() {
        return courses;
    }

    public void setCourses(Set<CourseBean> courses) {
        this.courses = courses;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}

