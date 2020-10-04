package com.leyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author 李浩东
 * @description
 * @date 2020/9/21 22:15
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class GoodApplication {
    public static void main(String[] args) {
        SpringApplication.run(GoodApplication.class,args);
    }
}
