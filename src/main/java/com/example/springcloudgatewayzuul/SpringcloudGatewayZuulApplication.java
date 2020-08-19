package com.example.springcloudgatewayzuul;

import com.example.springcloudgatewayzuul.filter.MyFilter;
import com.fasterxml.jackson.core.filter.TokenFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class SpringcloudGatewayZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudGatewayZuulApplication.class, args);
    }


    @Bean
    public MyFilter myFilter() {
        return new MyFilter();
    }

}
