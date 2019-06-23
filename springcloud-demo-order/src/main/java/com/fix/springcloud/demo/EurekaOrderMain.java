package com.fix.springcloud.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaOrderMain {
    public static void main(String[] args) {
        SpringApplication.run(EurekaOrderMain.class, args);
    }
}
