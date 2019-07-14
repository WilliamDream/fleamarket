package com.william.market.market;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Author: WilliamDream
 * @Description: 服务网关
 * @Date: 2019/7/8 21:41
 */

@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class ZuulGateWayApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(ZuulGateWayApp.class,args);
    }
}
