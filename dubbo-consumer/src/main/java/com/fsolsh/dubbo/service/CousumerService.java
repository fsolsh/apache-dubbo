package com.fsolsh.dubbo.service;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @program: dubbo
 * @description: DubboService
 * @author: fsolsh@qq.com
 * @create: 2021-02-03 11:53
 **/
@Component
public class CousumerService {

    @DubboReference
    private HelloService helloService;

    public String sayHello(String name) {
        return helloService.sayHello(name);
    }

    @PostConstruct
    private void rpcCall() {
        System.out.println(sayHello("dubbo"));
    }
}
