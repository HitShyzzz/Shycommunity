package com.nowcoder.community.dao;

import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.security.core.parameters.P;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2022/08/02/16:11
 * @Description:
 */
@Mapper
public interface DiscussPostMapper {
    /**
     * 动态sql,userId=0时就不要加入userId;
     * @param userId 用户ID
     * @param offset 每页的起始行号
     * @param limit  每页最多显示的数据
     * @return
     */
    List<DiscussPost>selectDiscussPosts(@Param("userId") int userId,@Param("offset") int offset,
                                        @Param("limit") int limit,@Param("orderMode") int orderMode);
    int selectDiscussPostRows(@Param("userId")int userId);

    int insertDiscussPost(DiscussPost discussPost);

    DiscussPost selectDiscussPostById(int id);

    int updateCommentCount(@Param("id") int id,@Param("commentCount") int commentCount);
    int updateType(@Param("id") int id,@Param("type") int type);
    int updateStatus(@Param("id") int id,@Param("status") int status);
    int updateScore(@Param("id") int id,@Param("score") double score);
}
