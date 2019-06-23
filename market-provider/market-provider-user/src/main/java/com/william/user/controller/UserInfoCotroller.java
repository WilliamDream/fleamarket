package com.william.user.controller;

import com.william.common.bean.ResultVo;
import com.william.user.model.po.UserInfo;
import com.william.user.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: WilliamDream
 * @Description:
 * @Date: 2019/6/23 21:41
 */

@RestController
@RequestMapping("/user")
public class UserInfoCotroller {

    @Autowired
    private UserInfoService service;

    @GetMapping("/{userId}")
    public ResultVo getUserById(@PathVariable int userId){
        UserInfo user = service.getUserByUserId(userId);
        return ResultVo.success(user);
    }

}
