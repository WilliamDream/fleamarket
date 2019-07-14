package com.william.market;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: WilliamDream
 * @Description: 商城会员服务提供者
 * @Date: 2019/6/24 21:44
 */
@EnableEurekaClient
@SpringBootApplication
public class MarketProviderUserApp
{
    public static void main( String[] args ){
        SpringApplication.run(MarketProviderUserApp.class,args);
    }
}
