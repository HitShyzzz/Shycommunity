package com.nowcoder.community.entity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2022/07/30/18:49
 * @Description:
 */
// 配置类
@Configuration
public class AlphaConfig {
    @Bean// bean的名字默认是simpleDateFormat
    public SimpleDateFormat simpleDateFormat(){
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    }
}
