package com.hdu.blog.serviceimpl;

import com.hdu.blog.entity.Article;
import com.hdu.blog.entity.Comment;
import com.hdu.blog.mapper.ArticleMapper;
import com.hdu.blog.mapper.CommentMapper;
import com.hdu.blog.service.ArticleService;
import com.hdu.blog.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author cellphone
 * @create 2020-10-30 17:40
 */
@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    CommentMapper commentMapper;


    @Override
    public List<Comment> listComment() {
        return commentMapper.listComment();
    }

    @Override
    public Comment getComment(int commentId) {
        return commentMapper.getComment(commentId);
    }
}
