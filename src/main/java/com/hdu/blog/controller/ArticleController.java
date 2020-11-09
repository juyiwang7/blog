package com.hdu.blog.controller;

import com.hdu.blog.core.domain.ResultVO;
import com.hdu.blog.entity.Article;
import com.hdu.blog.entity.User;
import com.hdu.blog.service.ArticleService;
import com.hdu.blog.service.TagService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.MapBindingResult;
import org.springframework.validation.support.BindingAwareModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/articles")
public class ArticleController {

    @Autowired
    ArticleService articleService;
    @Autowired
    TagService tagService;

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
        List<Article> listArticle = articleService.listArticle();
        int size = listArticle.size();
        if(size >= 5)
            size = 5;
        listArticle = listArticle.subList(0,size);
        return ResultVO.ok(listArticle);
    }

    @CrossOrigin
    @ApiOperation(value = "获取点击量最高文章")
    @GetMapping("/hot")
    public ResultVO listHotArticle(){
        List<Article> articles = articleService.listHotArticle();
        int size = articles.size();
        if(size >= 5)
            size = 5;
        articles = articles.subList(0,size);
        return ResultVO.ok(articles);
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

    @GetMapping("/tag/{id}")
    @ApiOperation("查看指定tag下的文章")
    public ResultVO getArticlesByTag(@PathVariable("id") int id){
        List<Article> articles = articleService.getArticleByTag(id);
        return ResultVO.ok(articles);
    }

    @PostMapping("/publish")
    @ApiOperation("新增文章")
    public ResultVO publishArticle(@RequestBody Article article){
        User user = new User();
        user.setUser_id(1);
        article.setUser(user);
        articleService.publishArticle(article);

        Integer id = article.getArticle_id();
        article.setArticle_id(id);
        tagService.addArtcleTags(article);
        return ResultVO.ok(article);
    }


}
