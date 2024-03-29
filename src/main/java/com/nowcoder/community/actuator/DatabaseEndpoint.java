package com.nowcoder.community.actuator;

import com.nowcoder.community.util.CommunityUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2022/08/19/21:10
 * @Description:
 */
@Component
@Endpoint(id="database")
public class DatabaseEndpoint {
    private static final Logger logger= LoggerFactory.getLogger(DatabaseEndpoint.class);
    @Autowired
    private DataSource dataSource;
    @ReadOperation // 只能通过get请求来访问
    public String checkConnection(){
        try(
                Connection conn= dataSource.getConnection();
        ) {
            return CommunityUtil.getJSONString(0,"获取连接成功！");
        } catch (SQLException e) {
            logger.info("获取连接失败："+e.getMessage());
            return CommunityUtil.getJSONString(1,"获取连接失败！");
        }
    }
}
