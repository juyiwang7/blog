package com.hdu.blog.controller;

import com.hdu.blog.core.domain.ResultVO;
import com.hdu.blog.entity.Article;
import com.hdu.blog.entity.Comment;
import com.hdu.blog.service.ArticleService;
import com.hdu.blog.service.CommentService;
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
    @ApiOperation(value = "获取所有评论")
    @GetMapping
    public ResultVO listComment(){
        List<Comment> listComment = commentService.listComment();

        return ResultVO.ok(listComment);
    }

    @CrossOrigin
    @ApiOperation(value = "获取最新评论")
    @GetMapping("/new")
    public ResultVO listNewComment(){
        return listComment();
    }


    @GetMapping("/view/{comment_id}")
    @ApiOperation("查看指定评论")
    public ResultVO getComment(@PathVariable("comment_id") int id){
        Comment comment= commentService.getComment(id);
        return ResultVO.ok(comment);
    }
}