package com.william.market.hystrix;

import com.william.common.bean.ResultVo;
import com.william.market.service.UserServiceFeign;
import org.springframework.stereotype.Component;

/**
 * @Author: WilliamDream
 * @Description:
 * @Date: 2019/7/14 10:44
 */

@Component
public class UserServiceHystrix implements UserServiceFeign {

    @Override
    public ResultVo getUserById(int userId) {
        return null;
    }
}
