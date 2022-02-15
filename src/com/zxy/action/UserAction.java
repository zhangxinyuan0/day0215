package com.zxy.action;

import com.zxy.service.UserService;

/**
 * @Author 张新远
 * @date 2022/2/15 11:47
 * @Version 1.0
 */
public class UserAction {
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}

