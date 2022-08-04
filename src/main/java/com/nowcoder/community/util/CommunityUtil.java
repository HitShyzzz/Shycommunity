package com.nowcoder.community.util;

import org.apache.commons.lang3.StringUtils;
import org.springframework.util.DigestUtils;

import java.util.UUID;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2022/08/04/19:48
 * @Description:
 */
public class CommunityUtil {
    // 生成随机字符串，
    public static String generateUUID(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }
    // MD5加密,只能加密，不能解密
    // hello->abc123def456
    // hello+3e4a8->abc123def56abc
    public static String md5(String key){
        if(StringUtils.isBlank(key)){// 处理key为空的情况，
            return null;
        }
        return DigestUtils.md5DigestAsHex(key.getBytes());
    }

}
