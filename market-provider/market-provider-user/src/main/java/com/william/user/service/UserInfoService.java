package com.william.user.service;

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

    public UserInfoVo getUserByUserId(Integer userId);

    public UserInfoVo getUserByUserName(UserInfoDto userInfoDto);

    public List<UserInfoVo> getUserList(UserInfoDto userInfo);

}
