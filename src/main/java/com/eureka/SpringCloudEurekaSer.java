package com.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/**
 * Created by zww on 2019-03-07.
 * 注册中心服务server 启动类
 */
@SpringBootApplication
@EnableEurekaServer
public class SpringCloudEurekaSer {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaSer.class, args);
    }
}
