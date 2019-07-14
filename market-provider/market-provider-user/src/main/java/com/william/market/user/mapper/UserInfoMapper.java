package com.william.market.user.mapper;

import com.william.market.user.model.dto.UserInfoDto;
import com.william.market.user.model.vo.UserInfoVo;
import com.william.user.model.dto.UserInfoDto;
import com.william.user.model.po.UserInfo;
import com.william.user.model.vo.UserInfoVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author: WilliamDream
 * @Description:
 * @Date: 2019/6/23 17:09
 */

@Mapper
public interface UserInfoMapper {


    UserInfoVo getUserByUserId(Integer userId);

    UserInfoVo getUserByUserName(String userName);

    List<UserInfoVo> getUserList(UserInfoDto userInfo);

    void addUserInfo(UserInfoDto userInfo);

    void updateUserInfo(UserInfoDto userInfoDto);


}
