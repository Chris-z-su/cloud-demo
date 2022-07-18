package com.shubao.feign.clients;

import com.shubao.feign.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * feign远程调用客户端
 */
@FeignClient("userserver")
public interface UserClient {

    @GetMapping("/user/{id}")
    User findById(@PathVariable("id")Long id);
}
