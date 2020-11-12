package com.hdu.blog.entity;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * Create By weisan on 2020/10/19.
 */
@Data
@ToString
public class User {
        private int user_id;
        private String username;
        private String password;
        private String email;
        private String phone;
        private Date createTime;
        private Date updateTime;
}
