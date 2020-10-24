package com.hdu.blog.controller;

import com.hdu.blog.core.domain.ResultVO;
import com.hdu.blog.entity.Article;
import com.hdu.blog.service.ArticleService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/articles")
public class ArticleController {

    @Autowired
    ArticleService articleService;

    @CrossOrigin
    @ApiOperation(value = "获取所有文章")
    @GetMapping
    public ResultVO listArticle(){
        List<Article> listArticle = articleService.listArticle();//要有类别标签的名称，而不是直接差Article表
        return ResultVO.ok(listArticle);
    }

    @CrossOrigin
    @ApiOperation(value = "获取最新文章")
    @GetMapping("/new")
    public ResultVO listNewArticle(){
        return listArticle();
    }
}
