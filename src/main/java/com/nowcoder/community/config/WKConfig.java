package com.nowcoder.community.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.io.File;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2022/08/18/22:47
 * @Description:
 */
@Configuration
public class WKConfig {
    private static final Logger logger= LoggerFactory.getLogger(WKConfig.class);
    @Value("${wk.image.storage}")
    private String wkImageStorage;
    @PostConstruct
    public void init(){
        // 创建WK图片目录
        File file=new File(wkImageStorage);
        if (!file.exists()){
            file.mkdir();
            logger.info("创建wk图片目录："+wkImageStorage);
        }
    }
}
