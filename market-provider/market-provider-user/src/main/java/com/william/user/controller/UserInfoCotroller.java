package com.william.user.controller;

import com.william.common.bean.ResultVo;
import com.william.user.model.dto.UserInfoDto;
import com.william.user.model.po.UserInfo;
import com.william.user.model.vo.UserInfoVo;
import com.william.user.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
        UserInfoVo userInfo = service.getUserByUserId(userId);
        return ResultVo.success(userInfo);
    }

    @PostMapping("/login")
    public ResultVo userLogin(@RequestBody UserInfoDto userInfoDto){
        UserInfoVo userInfo = service.getUserByUserName(userInfoDto);
        return ResultVo.success(userInfo);
    }

}
