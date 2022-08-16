package com.nowcoder.community.util;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2022/08/04/22:05
 * @Description:
 */
public interface CommunityConstant {

    // 激活成功
    int ACTIVATION_SUCCESS = 0;
    // 重复激活
    int ACTIVATION_REPEAT = 1;
    // 激活失败
    int ACTIVATION_FAILURE = 2;
    // 默认状态的登录凭证的超时时间
    int DEFAULT_EXPIRED_SECONDS = 3600 * 12;
    // 记住我状态下的登录凭证超时时间
    int REMEMBERME_EXPIRED_SECONDS = 3600 * 24 * 100;
    // 实体类型:帖子
    int ENTITY_TYPE_POST = 1;
    // 实体类型：评论
    int ENTITY_TYPE_COMMENT = 2;
    // 实体类型：用户
    int ENTITY_TYPE_USER = 3;
    // 事件主题：评论
    String TOPIC_COMMIT="comment";
    // 主题：点赞
    String TOPIC_LIKE="like";
    // 主题：关注
    String TOPIC_FOLLOW="follow";
    // 系统用户
    int SYSTEM_USER_ID=1;
}

