package com.william.market.user.controller;

import com.william.common.bean.ResultVo;
import com.william.market.user.common.constants.Constants;
import com.william.user.common.constants.Constants;
import com.william.user.model.dto.UserInfoDto;
import com.william.user.model.po.UserInfo;
import com.william.user.model.vo.UserInfoVo;
import com.william.user.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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

    @GetMapping("/loginout")
    public ResultVo userLoginOut(){
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = requestAttributes.getRequest();
        HttpSession session = request.getSession();
        session.removeAttribute(Constants.SESSION_LOGIN_USER);
        return ResultVo.success();
    }

    /**
       * @Description 编辑用户信息
       * @param
       * @return com.william.common.bean.ResultVo
       * @Date 2019/6/30 15:21
       */
    @PostMapping("/useredit")
    public ResultVo getUserInfo(@RequestBody UserInfoDto userInfoDto){


        return ResultVo.success();
    }

}
