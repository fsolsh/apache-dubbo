package com.fsolsh.dubbo;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

/**
 * @program: atccs
 * @description: 服务启动类
 * @author: fsolsh@qq.com
 * @create: 2021-02-04 17:19
 **/
@Configuration
@EnableDubbo
@SpringBootApplication
public class AppStarter {
    public static void main(String[] args) {
        try {
            SpringApplication.run(AppStarter.class, args);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
