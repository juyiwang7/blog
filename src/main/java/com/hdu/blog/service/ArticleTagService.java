package com.hdu.blog.service;

import com.hdu.blog.entity.Article;
import com.hdu.blog.entity.ArticleTag;
import com.hdu.blog.entity.Comment;

import java.util.List;

/**
 * @author cellphone
 * @create 2020-10-28 19:47
 */
public interface ArticleTagService {
    List<ArticleTag> listArticleTag();
    List<Article> getArticleByTag(int tagID);
}
