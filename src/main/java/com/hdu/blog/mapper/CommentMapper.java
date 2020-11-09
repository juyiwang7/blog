package com.hdu.blog.mapper;

import com.hdu.blog.entity.Comment;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author cellphone
 * @create 2020-10-28 19:43
 */
@Mapper
public interface CommentMapper {
    List<Comment> getCommentByArticle(int articleId);
    void publishComment(Comment comment);
}
