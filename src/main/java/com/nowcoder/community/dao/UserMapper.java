package com.nowcoder.community.dao;

import com.nowcoder.community.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2022/08/01/22:38
 * @Description:
 */
@Mapper
public interface UserMapper {
    User selectById(int id);

    User selectedByName(String username);

    User selectedByEmail(String email);

    int insertUser(User user);

    // 接口里的方法如果有多个参数时，需要加上@Param注解，这样mybatis在xml文件解析时才能把这些参数都动态的添加到
    // 查询/增加/更新语句中！
    // 不加@Param注解会报解决异常-nested exception is org.apache.ibatis.binding.BindingException: Parameter 'XXX' not found
    int updateStatus(@Param("id") int id,@Param("status") int status);

    int updateHeader(@Param("id") int id,@Param("headerUrl") String headerUrl);

    int updatePassword(@Param("id") int id,@Param("password") String password);


}
