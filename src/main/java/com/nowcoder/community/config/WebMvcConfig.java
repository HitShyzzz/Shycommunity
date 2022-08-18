package com.nowcoder.community.config;

import com.nowcoder.community.controller.interceptor.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2022/08/08/10:05
 * @Description:
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Autowired
    private  AlphaInterceptor alphaInterceptor;
    @Autowired
    private  LoginTicketInterceptor loginTicketInterceptor;
//    @Autowired
//    private  LoginRequiredInterceptor loginRequiredInterceptor;
    @Autowired
    private MessageInterceptor messageInterceptor;
    @Autowired
    private DataInterceptor dataInterceptor;

//    public WebMvcConfig(AlphaInterceptor alphaInterceptor, LoginTicketInterceptor loginTicketInterceptor, LoginRequiredInterceptor loginRequiredInterceptor) {
//        this.alphaInterceptor = alphaInterceptor;
//        this.loginTicketInterceptor = loginTicketInterceptor;
//        this.loginRequiredInterceptor = loginRequiredInterceptor;
//    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
       registry.addInterceptor(alphaInterceptor)
               .excludePathPatterns("/**/*.css","/**/*.js","/**/*.png","/**/*.jpg","/**/*.jpeg")
               .addPathPatterns("/register","/login");
       registry.addInterceptor(loginTicketInterceptor)
               .excludePathPatterns("/**/*.css","/**/*.js","/**/*.png","/**/*.jpg","/**/*.jpeg");
//        registry.addInterceptor(loginRequiredInterceptor)
//                .excludePathPatterns("/**/*.css","/**/*.js","/**/*.png","/**/*.jpg","/**/*.jpeg");
        registry.addInterceptor(messageInterceptor)
                .excludePathPatterns("/**/*.css","/**/*.js","/**/*.png","/**/*.jpg","/**/*.jpeg");
        registry.addInterceptor(dataInterceptor)
                .excludePathPatterns("/**/*.css","/**/*.js","/**/*.png","/**/*.jpg","/**/*.jpeg");
    }
}
