package com.william.market;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 *  注册中心
 */
//@EnableAutoConfiguration
@EnableEurekaServer
@SpringBootApplication
public class MarketRegisterEurekaApp
{
    public static void main( String[] args ){
        SpringApplication.run(MarketRegisterEurekaApp.class,args);
    }
}
