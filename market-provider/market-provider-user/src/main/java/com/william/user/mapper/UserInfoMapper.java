package com.william.user.mapper;

import com.william.user.model.po.UserInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: WilliamDream
 * @Description:
 * @Date: 2019/6/23 17:09
 */

@Mapper
public interface UserInfoMapper {


    UserInfo getUserByUserId(Integer userId);

    UserInfo getUser(String userName, String passWord);

    List<UserInfo> getUserList(UserInfo userInfo);


}
