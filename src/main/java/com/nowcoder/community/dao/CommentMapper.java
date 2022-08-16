package com.nowcoder.community.dao;

import com.nowcoder.community.entity.Comment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2022/08/09/20:56
 * @Description:
 */
@Mapper
public interface CommentMapper {
    List<Comment> selectCommentByEntity(@Param("entityType") int entityType,@Param("entityId") int entityId,
                                        @Param("offset") int offset,@Param("limit") int limit);
    int selectCountByEntity(@Param("entityType") int entityType,@Param("entityId") int entityId);
    int insertComment(Comment comment);
    Comment selectCommentById(int id);


}
