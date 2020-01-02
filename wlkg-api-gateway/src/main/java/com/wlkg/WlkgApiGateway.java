package com.wlkg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author 飞鸟
 * @create 2019-11-29 11:45
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class WlkgApiGateway {
    public static void main(String[] args) {
        SpringApplication.run(WlkgApiGateway.class, args);
    }
}
