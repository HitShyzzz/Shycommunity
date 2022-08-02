package com.nowcoder.community;

import com.nowcoder.community.dao.DiscussPostMapper;
import com.nowcoder.community.dao.UserMapper;
import com.nowcoder.community.entity.DiscussPost;
import com.nowcoder.community.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2022/08/01/23:00
 * @Description:
 */
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class MapperTests {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private DiscussPostMapper discussPostMapper;

    @Test
    public void testSelectUser(){
        User user = userMapper.selectById(102);
        System.out.println(user);
        user=userMapper.selectedByName("zhangfei");
        System.out.println(user);
        user=userMapper.selectedByEmail("nowcoder23@sina.com");
        System.out.println(user);
    }

    @Test
    public void testInsertUser(){
        User user = new User();
        user.setUsername("shy");
        user.setPassword("123");
        user.setSalt("abc");
        user.setEmail("shy@qq.com");
        user.setType(1);
        user.setStatus(1);
        user.setActivationCode(null);
        user.setHeaderUrl("http://www.shy.com/shy.png");
        user.setCreateTime(new Date());
        int rows = userMapper.insertUser(user);
        System.out.println(rows);
        System.out.println(user.getId());
    }
    @Test
    public void testUpdateUser(){
        int rows = userMapper.updateStatus(150, 0);
        System.out.println(rows);
        rows=userMapper.updateHeader(150,"http://www.shy.com/101.png");
        System.out.println(rows);
        rows=userMapper.updatePassword(150,"root");
        System.out.println(rows);
    }
    @Test
    public void testSelectPosts(){
        List<DiscussPost> list = discussPostMapper.selectDiscussPosts(0, 0, 10);
        for(DiscussPost post:list){
            System.out.println(post);
        }
        int rows = discussPostMapper.selectDiscussPostRows(149);
        System.out.println(rows);
    }

}
