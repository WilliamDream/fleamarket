package com.william.market.market.model.vo;


import lombok.Data;

/**
 * @Author: WilliamDream
 * @Description:
 * @Date: 2019/6/24 22:31
 */

@Data
public class UserInfoVo {

    private Integer userId;

    //用户账号
    private String userName;

    //用户昵称
    private String nickName;

    private Integer gender;

    private String password;

    //个性签名
    private String introduction;

    private String email;

    private String phoneNum;

    private String level;

    private String birthday;

    private String createtime;

    //最后登录时间
    private String lasttime;

    //账号状态
    private int status;

}
