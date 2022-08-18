package com.nowcoder.community.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2022/08/18/10:35
 * @Description:
 */
@Configuration
@EnableScheduling
@EnableAsync
public class ThreadPoolConfig {
}
