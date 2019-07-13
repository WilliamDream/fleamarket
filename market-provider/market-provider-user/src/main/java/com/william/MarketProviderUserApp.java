package com.william;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 商城会员服务提供者
 */

@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class MarketProviderUserApp
{
    public static void main( String[] args ){
        SpringApplication.run(MarketProviderUserApp.class,args);
    }
}
