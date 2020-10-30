package com.hdu.blog.controller;

import com.hdu.blog.core.domain.ResultVO;
import com.hdu.blog.entity.Article;
import com.hdu.blog.service.ArticleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.MapBindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

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


    @GetMapping("/view/{article_id}")
    @ApiOperation("查看指定文章")
    public ResultVO getArticle(@PathVariable("article_id") int id){
        Article article = articleService.getArticle(id);
        return ResultVO.ok(article);
    }

    @GetMapping("/category/{id}")
    @ApiOperation("查看指定分类下的文章")
    public ResultVO getArticlesByCategory(@PathVariable("id") int id){
        List<Article> articles = articleService.getArticleByCategory(id);
        return ResultVO.ok(articles);
    }
}
