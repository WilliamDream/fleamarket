package com.william.market.market.controller;

import com.william.common.bean.ResultVo;
import com.william.market.model.vo.UserInfoVo;
import com.william.market.service.UserServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: WilliamDream
 * @Description:
 * @Date: 2019/7/13 23:06
 */

@RestController("/user")
public class MarketUserController {

    @Autowired
    private UserServiceFeign userService;

    @GetMapping("/{userId}")
    public ResultVo getUserById(@PathVariable int userId){
        return userService.getUserById(userId);
    }

}
