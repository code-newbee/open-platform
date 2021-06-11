package com.goku.gateway.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * 功能描述：
 *
 * @Author: XKK
 * @Date: 2021/6/2 11:04
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "whitelist")
public class WhiteListConfig {

    private List<String> urls;

}
