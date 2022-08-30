package com.nowcoder.community;

import com.nowcoder.community.entity.DiscussPost;
import com.nowcoder.community.service.DiscussPostService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2022/08/19/16:01
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class CaffeineTests {
    @Autowired
    private DiscussPostService postService;
    @Test
    public void initDataForTest(){
        for (int i=0;i<300000;i++){
            DiscussPost post=new DiscussPost();
            post.setUserId(111);
            post.setTitle("互联网求职暖春计划");
            post.setContent("今年就业形式不容乐观，整个讨论区哀鸿遍野！");
            post.setCreateTime(new Date());
            post.setScore(Math.random()*2000);
            postService.addDiscussPost(post);
        }
    }
    @Test
    public void testCache(){
        System.out.println(postService.findDiscussPosts(0,0,10,1));
        System.out.println(postService.findDiscussPosts(0,0,10,1));
        System.out.println(postService.findDiscussPosts(0,0,10,1));
        System.out.println(postService.findDiscussPosts(0,0,10,0));
    }
}
