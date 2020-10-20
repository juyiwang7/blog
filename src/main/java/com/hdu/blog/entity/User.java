package com.hdu.blog.entity;

import lombok.Data;
import lombok.ToString;

/**
 * Create By weisan on 2020/10/19.
 */
@Data
@ToString
public class User {
        private String id;
        private String username;
        private String password;
        private String realname;
}
