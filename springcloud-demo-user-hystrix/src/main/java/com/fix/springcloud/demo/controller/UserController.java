package com.fix.springcloud.demo.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {
    @Autowired
    private RestTemplate restTemplate;

    /**
     * 按照用户id查询订单信息
     *
     * @param id 用户id
     * @return 用户订单信息
     */
    @GetMapping("/findOrderByUser/{id}")
    @HystrixCommand(fallbackMethod = "fallBackMethod")
    public String findOrderByUser(@PathVariable String id) {
        int orderId = 123;
        return this.restTemplate.getForObject("http://SPRINGCLOUD-DEMO-ORDER/order/" + orderId, String.class);
    }

    /**
     * 调用订单查询接口失败后的返回信息
     *
     * @param id
     * @return
     */
    public String fallBackMethod(@PathVariable String id) {
        return "服务不可用，当前查询id=" + id;
    }
}
