package com.leyou.Facade;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author 李浩东
 * @description
 * @date 2020/9/21 22:43
 **/
@FeignClient(value = "leyou-goods")
public interface FeiginClientTest {

    @GetMapping(value = "/hello")
    String hello();
}
