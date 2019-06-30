package com.william.user.model.dto;

import com.william.user.model.po.UserInfo;
import lombok.Data;

/**
 * @Author: WilliamDream
 * @Description:
 * @Date: 2019/6/24 22:28
 */
@Data
public class UserInfoDto extends UserInfo {

    private Integer userId;

    //用户账号
    private String userName;

    private String password;

    private String msgCode;
}
