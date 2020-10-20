package com.hdu.blog.serviceimpl;

import com.hdu.blog.entity.User;
import com.hdu.blog.mapper.UserMapper;
import com.hdu.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Create By weisan on 2020/10/19.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> listUser() {
        return userMapper.listUser();
    }
}
