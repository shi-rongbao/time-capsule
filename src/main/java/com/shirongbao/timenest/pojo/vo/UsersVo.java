package com.shirongbao.timenest.pojo.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * @author: ShiRongbao
 * @date: 2025-05-16
 * @description: 用户vo类
 */
@Data
public class UsersVo {

    // 主键id
    private Long id;

    // 唯一不重复用户名
    private String userAccount;

    // 用户昵称
    private String nickName;

    // 手机号(解密后的)
    private String phone;

    // 邮箱
    private String email;

    // 用户头像url
    private String avatarUrl;

    // 用户简介
    private String introduce;

    // 创建时间
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date createdAt;

}
