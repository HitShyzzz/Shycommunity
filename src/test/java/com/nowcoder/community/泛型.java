package com.nowcoder.community;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/03/17/9:28
 * @Description:
 */
public class 泛型 {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();
        // 直接报错，因为泛型擦除
//        if (list instanceof ArrayList<Integer>){
//        }

    }
}
