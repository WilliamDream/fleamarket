package com.william.market.market.service;

import com.william.market.hystrix.UserServiceHystrix;
import com.william.market.market.hystrix.UserServiceHystrix;
import com.william.market.market.model.vo.UserInfo;
import com.william.market.model.vo.UserInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author: WilliamDream
 * @Description:
 * @Date: 2019/7/13 23:02
 */

@FeignClient(value = "Market-Provider-UserInfo",fallback = UserServiceHystrix.class)
public interface UserServiceFeign {

    @GetMapping("/api/user/byid/{userId}")
    UserInfo getUserById(@PathVariable int userId);



}
