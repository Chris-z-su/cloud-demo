package com.shubao.feign.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;

/**
 * @version 1.0
 * @program: cloud-demo
 * @description: 自定义Feign配置类
 * @author: chris
 * @create: 2022-06-29 00:05
 * @since JDK1.8
 **/
public class DefaultFeignConfiguration {

    @Bean
    public Logger.Level feignLoggerLevel(){
        return Logger.Level.BASIC;
    }
}
