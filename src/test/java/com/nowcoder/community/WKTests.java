package com.nowcoder.community;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2022/08/18/22:37
 * @Description:
 */
public class WKTests {
    public static void main(String[] args) {
        String cmd="D:/tool/wkhtmltopdf/bin/wkhtmltoimage --quality 75 https://www.nowcoder.com D:/tool/source/data/wk-images/3.png";
        try {
            Runtime.getRuntime().exec(cmd);
            System.out.println("ok!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
