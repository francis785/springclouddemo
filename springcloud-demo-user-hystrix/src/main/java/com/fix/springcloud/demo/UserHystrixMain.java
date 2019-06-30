package com.fix.springcloud.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
public class UserHystrixMain {
    public static void main(String[] args) {
        SpringApplication.run(UserHystrixMain.class, args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate initRestTemplate() {
        return new RestTemplate();
    }
}
