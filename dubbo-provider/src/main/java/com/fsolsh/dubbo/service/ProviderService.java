package com.fsolsh.dubbo.service;

import org.apache.dubbo.config.annotation.DubboService;

/**
 * @program: atccs
 * @description: DubboServiceImpl
 * @author: fsolsh@qq.com
 * @create: 2021-02-03 11:44
 **/

@DubboService
public class ProviderService implements HelloService {

    @Override
    public String sayHello(String name) {
        return "hello, " + name;
    }
}
