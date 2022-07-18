package com.shubao.user.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @version 1.0
 * @program: cloud-demo
 * @description: 格式化配置类
 * @author: chris
 * @create: 2022-06-28 15:45
 * @since JDK1.8
 **/
@Data
@Component
@ConfigurationProperties(prefix = "pattern")
public class PatternProperties {

    private String dateformat;

    private String envSharedValue;

}
