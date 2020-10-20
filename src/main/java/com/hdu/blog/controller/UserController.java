package com.hdu.blog.controller;

import com.hdu.blog.core.domain.ResultVO;
import com.hdu.blog.entity.User;
import com.hdu.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Create By weisan on 2020/10/19.
 */
@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("list")
    public ResultVO listUser(){
        List<User> users = userService.listUser();
        return ResultVO.ok(users);

    }
}
