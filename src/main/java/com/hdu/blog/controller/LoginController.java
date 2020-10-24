package com.hdu.blog.controller;

import com.hdu.blog.core.domain.ResultVO;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
public class LoginController {
    /*account  password*/
    @PostMapping("/login")
    @ApiOperation(value = "登录接口！")
    @CrossOrigin
    public ResultVO userLogin(@RequestBody Map<String,String> map){
        Map<String,String> token = new HashMap<>();
        token.put("Oauth-Token","9c5b89bd-ecb0-4c2c-8aae-9653d0e15e04");
        return ResultVO.ok("成功",token);
    }

}
