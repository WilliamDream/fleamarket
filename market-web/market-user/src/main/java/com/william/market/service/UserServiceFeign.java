package com.william.market.service;

import com.william.common.bean.ResultVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author: WilliamDream
 * @Description:
 * @Date: 2019/7/13 23:02
 */

@FeignClient(value = "Market-Provider-User")
public interface UserServiceFeign {

    @GetMapping("/{userId}")
    ResultVo getUserById(@PathVariable int userId);


}
