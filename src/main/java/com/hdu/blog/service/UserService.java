package com.hdu.blog.service;

import com.hdu.blog.entity.User;

import java.util.List;

/**
 * Create By weisan on 2020/10/19.
 */
public interface UserService {
    List<User> listUser();

    User getUser(int id);
}
