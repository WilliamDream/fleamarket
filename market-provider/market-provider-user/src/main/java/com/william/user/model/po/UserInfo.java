package com.william.user.model.po;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Auther: chaiz
 * @Date: 2019/6/11 19:45
 * @Description:
 */
@Data
@Table(name = "d_userinfo")
public class UserInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
