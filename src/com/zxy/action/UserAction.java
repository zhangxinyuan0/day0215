package com.zxy.action;

import com.alibaba.fastjson.JSON;
import com.zxy.entity.CourseBean;
import com.zxy.entity.GradeBean;
import com.zxy.entity.PowerBean;
import com.zxy.entity.UserBean;
import com.zxy.service.UserService;
import com.zxy.utils.Page;

import java.util.List;
import java.util.Map;

/**
 * @Author 张新远
 * @date 2022/2/15 11:47
 * @Version 1.0
 */
public class UserAction {
    private UserService userService;
    private List<UserBean> userList;
    private String json;
    private String yema;
    private UserBean userBean;
    private Page page;
    private String id;
    private List<GradeBean> gradeBeanList;
    private GradeBean gradeBean;
    private List<CourseBean> courseBeanList;

    public List<CourseBean> getCourseBeanList() {
        return courseBeanList;
    }

    public void setCourseBeanList(List<CourseBean> courseBeanList) {
        this.courseBeanList = courseBeanList;
    }

    public GradeBean getGradeBean() {
        return gradeBean;
    }

    public void setGradeBean(GradeBean gradeBean) {
        this.gradeBean = gradeBean;
    }

    public List<GradeBean> getGradeBeanList() {
        return gradeBeanList;
    }

    public void setGradeBeanList(List<GradeBean> gradeBeanList) {
        this.gradeBeanList = gradeBeanList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    public String getYema() {
        return yema;
    }

    public void setYema(String yema) {
        this.yema = yema;
    }

    public UserBean getUserBean() {
        return userBean;
    }

    public void setUserBean(UserBean userBean) {
        this.userBean = userBean;
    }


    public String getJson() {
        return json;
    }

    public void setJson(String json) {
        this.json = json;
    }

    public void setUserList(List<UserBean> userList) {
        this.userList = userList;
    }

    public UserService getUserService() {
        return userService;
    }

    public List<UserBean> getUserList() {
        return userList;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    /////////////////////////////////////////
    public String findUserList(){
        userList = userService.findAll();
        return "user_list";
    }

    public String getLogin(){
        return "login_ok";
    }

    public String getPowerJson(){
        List<PowerBean> list = userService.getPowerList();
        json = JSON.toJSONString(list);
        return "left";
    }

    public String deleteUser(){
        userService.deleteUser(userBean);
        return "delete";
    }

    public String findPage(){
        Map<String,Object> map = userService.findPage(yema);
        Page mpage = (Page)map.get("page");
        List mlist = (List)map.get("list");
        page = mpage;
        userList = mlist;
        return "user_list";
    }

    public String findOneUser(){
        userBean = userService.findOneUser(id);
        return "update";
    }

    public String updateUser(){
        userService.updateUser(userBean);
        return "delete";
    }

    public String findAllGrade(){
        userBean = userService.findOneUser(id);
        gradeBeanList = userService.findAllGrade();
        System.out.println("1:"+gradeBeanList.size());
        return "user_grade";
    }

    public String updateGrade(){
        userService.updateGrade(userBean.getId(),gradeBean.getGid());
        return "delete";
    }

    public String findAllCourse(){
        userBean = userService.findOneUser(id);
        courseBeanList = userService.findAllCourse();
        return "user_course";
    }
}

