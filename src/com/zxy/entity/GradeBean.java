package com.zxy.entity;


import java.util.HashSet;
import java.util.Set;

/**
 * @Author 张新远
 * @date 2022/2/16 8:34
 * @Version 1.0
 */
public class GradeBean {
    private int gid;
    private String gname;
    private String gdesc;
    private Set<UserBean> users = new HashSet<>();

    public Set<UserBean> getUsers() {
        return users;
    }

    public void setUsers(Set<UserBean> users) {
        this.users = users;
    }

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public String getGdesc() {
        return gdesc;
    }

    public void setGdesc(String gdesc) {
        this.gdesc = gdesc;
    }
}

