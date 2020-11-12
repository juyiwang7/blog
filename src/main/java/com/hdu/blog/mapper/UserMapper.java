package com.hdu.blog.mapper;

import com.hdu.blog.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Create By weisan on 2020/10/19.
 */
@Mapper
@Repository
public interface UserMapper {

    List<User> listUser();
    User getUser(int id);
}
