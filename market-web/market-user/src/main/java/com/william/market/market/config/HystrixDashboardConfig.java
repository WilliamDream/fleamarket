package com.william.market.market.config;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: WilliamDream
 * @Description:
 * @Date: 2019/7/14 11:02
 */
@Configuration
public class HystrixDashboardConfig {

    @Bean
    public ServletRegistrationBean getServletBean(){
        HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(streamServlet);
        registrationBean.setLoadOnStartup(1);
        registrationBean.setName("HystrixMetricsStreamServlet");
        registrationBean.addUrlMappings("/hystrix.stream");
        return registrationBean;
    }

}
