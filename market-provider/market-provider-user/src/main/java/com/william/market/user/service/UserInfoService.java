package com.william.market.user.service;

import com.william.market.user.model.dto.UserInfoDto;
import com.william.market.user.model.vo.UserInfoVo;
import com.william.user.model.dto.UserInfoDto;
import com.william.user.model.po.UserInfo;
import com.william.user.model.vo.UserInfoVo;

import java.util.List;

/**
 * @Author: WilliamDream
 * @Description:
 * @Date: 2019/6/23 17:05
 */
public interface UserInfoService {

    UserInfoVo getUserByUserId(Integer userId);

    UserInfoVo getUserByUserName(UserInfoDto userInfoDto);

    List<UserInfoVo> getUserList(UserInfoDto userInfo);

    void addUserInfo(UserInfoDto userInfoDto);

    void updateUserInfo(UserInfoDto userInfoDto);



}
