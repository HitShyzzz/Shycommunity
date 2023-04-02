package com.nowcoder.community;

import org.apache.kafka.common.utils.CopyOnWriteMap;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/04/02/19:43
 * @Description:
 */
public class Test {
    public volatile static int a = 1;

    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newCachedThreadPool();
        threadPool.execute(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    a++;
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        System.out.println(a);
    }
}
