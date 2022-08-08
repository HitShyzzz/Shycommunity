package com.nowcoder.community.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2022/08/08/20:38
 * @Description:
 */
@Target(ElementType.METHOD)// 生效的地方
// 生效时间
@Retention(RetentionPolicy.RUNTIME)
public @interface LoginRequired {

}
