package com.william.user.service;

import com.william.user.model.po.UserInfo;

import java.util.List;

/**
 * @Author: WilliamDream
 * @Description:
 * @Date: 2019/6/23 17:05
 */
public interface UserInfoService {

    public UserInfo getUserByUserId(Integer userId);

    public UserInfo getUser(String userName,String passWord);

    public List<UserInfo> getUserList(UserInfo userInfo);

}
