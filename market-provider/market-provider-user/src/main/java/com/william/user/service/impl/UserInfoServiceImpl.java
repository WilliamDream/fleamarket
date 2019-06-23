package com.william.user.service.impl;

import com.william.user.mapper.UserInfoMapper;
import com.william.user.model.po.UserInfo;
import com.william.user.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: WilliamDream
 * @Description:
 * @Date: 2019/6/23 17:08
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper mapper;


    @Override
    public UserInfo getUserByUserId(Integer userId) {
        return mapper.getUserByUserId(userId);
    }

    @Override
    public UserInfo getUser(String userName, String passWord) {
        return mapper.getUser(userName,passWord);
    }

    @Override
    public List<UserInfo> getUserList(UserInfo userInfo) {
        return mapper.getUserList(userInfo);
    }
}
