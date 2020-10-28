package com.hdu.blog.service;

import com.hdu.blog.entity.Article;
import com.hdu.blog.entity.Comment;

import java.util.List;

/**
 * @author cellphone
 * @create 2020-10-28 19:47
 */
public interface CommentService {
    List<Comment> listComment();
    Comment getComment(int CommentId);
}
