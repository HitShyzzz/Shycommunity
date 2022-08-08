package com.nowcoder.community.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Repository;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2022/07/30/18:13
 * @Description:
 */
@Repository
@Primary
public class AlphaMyBatisImpl implements AlphaDao{
    @Override
    public String select() {
        return "MyBatis";
    }
}
