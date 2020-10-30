package com.hdu.blog.controller;

import com.hdu.blog.core.domain.ResultVO;
import com.hdu.blog.entity.ArticleTag;
import com.hdu.blog.entity.Comment;
import com.hdu.blog.service.ArticleTagService;
import com.hdu.blog.service.CommentService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author cellphone
 * @create 2020-10-30 17:55
 */
@RestController
@RequestMapping("/article_tag")
public class ArticleTagController {

    @Autowired
    ArticleTagService articleTagService;

    @CrossOrigin
    @ApiOperation(value = "获取所有 文章—标签 信息")
    @GetMapping
    public ResultVO listArticleTag(){
        List<ArticleTag> listArticleTag = articleTagService.listArticleTag();

        return ResultVO.ok(listArticleTag);
    }
}