package com.leyou.Facade;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 李浩东
 * @description
 * @date 2020/9/21 22:42
 **/
@RestController
public class FeiginTest {

    @GetMapping("/hello")
    private String hello(){
        return "hello";
    }
}
