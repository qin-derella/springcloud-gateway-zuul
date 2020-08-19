package com.example.springcloudgatewayzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class SpringcloudGatewayZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudGatewayZuulApplication.class, args);
    }

}
