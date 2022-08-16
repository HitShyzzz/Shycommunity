package com.nowcoder.community;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class CommunityApplication {
//    @PostConstruct
//    public void init(){
//        // 解决netty启动冲突的问题
//        // see Netty4Utils.setAvailableProcessors()
//        System.setProperty("es.set.netty.runtime.available.processors","false");
//    }
    public static void main(String[] args) {
        //System.setProperty("es.set.netty.runtime.available.processors","false");
        SpringApplication.run(CommunityApplication.class, args);
    }
}
