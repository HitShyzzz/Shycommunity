package com.nowcoder.community.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2022/08/05/19:58
 * @Description:
 */
@Getter
@Setter
@ToString
public class LoginTicket {
    private int id;
    private int userId;
    private String ticket;
    private int status;
    private Date expired;
}
