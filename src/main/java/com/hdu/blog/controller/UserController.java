package com.hdu.blog.controller;

import com.hdu.blog.core.domain.ResultVO;
import com.hdu.blog.entity.User;
import com.hdu.blog.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Create By weisan on 2020/10/19.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("list")
    public ResultVO listUser(){
        List<User> users = userService.listUser();
        return ResultVO.ok(users);

    }
    @CrossOrigin
    @GetMapping("/currentUser")
    @ApiOperation(value = "获取当前用户！")
    public ResultVO currentUser(HttpServletRequest servletRequest){
        System.out.println(servletRequest.getSession().getId());

        Object current_user = servletRequest.getSession().getAttribute("current_user");
        return ResultVO.ok("成功");
    }
}
