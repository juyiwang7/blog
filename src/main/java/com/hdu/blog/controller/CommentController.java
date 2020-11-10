package com.hdu.blog.controller;

import com.hdu.blog.core.domain.ResultVO;
import com.hdu.blog.entity.Article;
import com.hdu.blog.entity.Comment;
import com.hdu.blog.entity.User;
import com.hdu.blog.service.ArticleService;
import com.hdu.blog.service.CommentService;
import com.hdu.blog.service.TagService;
import com.hdu.blog.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author cellphone
 * @create 2020-10-30 17:34
 */

@RestController
@RequestMapping("/comments")
public class CommentController {

    @Autowired
    CommentService commentService;

    @CrossOrigin
    @GetMapping("/article/{article_id}")
    @ApiOperation(value ="根据文章ID查看评论")
    public ResultVO getComment(@PathVariable("article_id") int id){
        List<Comment> comment= commentService.getCommentByArticle(id);
        return ResultVO.ok(comment);
    }

    @PostMapping("/create/change")
    @ApiOperation("新增评论")
    public ResultVO publishComment(@RequestBody Comment comment){
        User user = new User();
        user.setUser_id(1);
        comment.setUser(user);
        commentService.publishComment(comment);
        return ResultVO.ok(comment);
    }
}