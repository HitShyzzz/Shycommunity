package com.nowcoder.community;

import com.github.benmanes.caffeine.cache.Caffeine;
import com.github.benmanes.caffeine.cache.LoadingCache;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2022/08/30/23:09
 * @Description:
 */
public class CaffeineTest {
    @Test
    public void testLoadingCache(){
        //此时的类型是 LoadingCache 不是 Cache
        LoadingCache<String, Integer> cache = Caffeine.newBuilder().build(key -> {
            System.out.println("自动填充:" + key);
            return 18;
        });

        Integer age1 = cache.getIfPresent("张三");
        System.out.println(age1);

        // key 不存在时 会根据给定的CacheLoader自动装载进去
        Integer age2 = cache.get("张三");
        System.out.println(age2);
    }
}
