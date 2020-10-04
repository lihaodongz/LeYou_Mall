package com.leyou.Facade;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 李浩东
 * @description
 * @date 2020/9/21 22:30
 **/
@RestController
public class TestController {

    @Resource
    private FeiginClientTest FeiginClientTest;

    @RequestMapping("/index")
    public String get(){
        return FeiginClientTest.hello();
    }
}
