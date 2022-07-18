package com.shubao.order.service;

import com.shubao.feign.clients.UserClient;
import com.shubao.feign.pojo.User;
import com.shubao.order.mapper.OrderMapper;
import com.shubao.order.pojo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderMapper orderMapper;

    // @Autowired
    // private RestTemplate restTemplate;
    //
    // public Order queryOrderById(Long orderId) {
    //     // 1.查询订单
    //     Order order = orderMapper.findById(orderId);
    //     // 2.利用RestTemplate发起Http请求，根据userID查询用户信息
    //     // String url = "http://127.0.0.1:8081/user/" + order.getUserId();
    //
    //     // eureka服务发现/服务拉取
    //     String url = "http://userserver/user/" + order.getUserId();
    //
    //     User user = restTemplate.getForObject(url, User.class);
    //     // 3.分装user到Order中
    //     order.setUser(user);
    //     // 4.返回
    //     return order;
    // }

    @Autowired
    private UserClient userClient;

    public Order queryOrderById(Long orderId) {
        // 1.查询订单
        Order order = orderMapper.findById(orderId);
        // 2.feign实现远程调用
        User user = userClient.findById(order.getUserId());
        // 3.分装user到Order中
        order.setUser(user);
        // 4.返回
        return order;
    }

}
