package com.leyou.Facade;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author 李浩东
 * @description
 * @date 2020/9/21 22:31
 **/
@FeignClient("leyou-goods")
public interface GoodFacade {

    @GetMapping("/test")
    String testGet();
}
