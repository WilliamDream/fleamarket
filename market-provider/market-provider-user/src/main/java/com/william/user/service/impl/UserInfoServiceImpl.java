package com.william.user.service.impl;

import com.william.common.bean.ResultVo;
import com.william.user.mapper.UserInfoMapper;
import com.william.user.model.dto.UserInfoDto;
import com.william.user.model.po.UserInfo;
import com.william.user.model.vo.UserInfoVo;
import com.william.user.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.transform.Result;
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
    public UserInfoVo getUserByUserId(Integer userId) {
        return mapper.getUserByUserId(userId);
    }

    @Override
    public UserInfoVo getUserByUserName(UserInfoDto userInfoDto) {

        if(!userInfoDto.getMsgCode().equals("")){   //验证码错误

        }
        UserInfoVo userInfoVo = mapper.getUserByUserName(userInfoDto.getUserName());
        if(userInfoVo==null){   //账号不存在

        }

        return userInfoVo;
    }

    @Override
    public List<UserInfoVo> getUserList(UserInfoDto userInfo) {
        return mapper.getUserList(userInfo);
    }
}
