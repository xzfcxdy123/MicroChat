package com.web.microchat.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Integer userId;

    private String username;

    private String password;

    private String nickname;

    private String sex;

    private String avatar;

    private Date birthday;

    private String description;

    private Date createTime;
}
