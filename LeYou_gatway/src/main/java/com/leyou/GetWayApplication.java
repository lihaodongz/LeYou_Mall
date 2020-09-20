package com.leyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


/**
 * @author 李浩东
 * @description
 * @date 2020/9/19 20:59
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class GetWayApplication {

    public static void main(String[] args) {

        SpringApplication.run(GetWayApplication.class,args);
    }
}
