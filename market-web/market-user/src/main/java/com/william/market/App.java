package com.william.market;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Hello world!
 *
 */

@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
