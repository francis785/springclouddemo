package com.fix.springcloud.demo.controller;

import com.fix.springcloud.demo.pojo.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    /**
     * 通过订单id查询订单信息
     *
     * @param id 订单id
     * @return 订单详情
     */
    @GetMapping("/order/{id}")
    public String findOrderById(@PathVariable String id) {
        Order order = new Order();
        order.setId("123");
        order.setPrice(200.50);
        order.setReceiverName("张三");
        order.setReceiverAddress("陕西西安");
        order.setReceiverPhone("123456799");
        return order.toString();
    }
}
