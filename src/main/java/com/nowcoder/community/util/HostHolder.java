package com.nowcoder.community.util;

import com.nowcoder.community.entity.User;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 *持有用户信息，用于代替session对象
 * @Author: shy
 * @Date: 2022/08/08/11:25
 * @Description:
 */
@Component
public class HostHolder {
    private ThreadLocal<User> users=new ThreadLocal<>();
    public void setUser(User user){
        users.set(user);
    }

    public User getUser(){
        return users.get();
    }
    public void clear(){
        users.remove();
    }

}
