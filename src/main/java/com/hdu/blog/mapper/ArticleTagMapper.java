package com.hdu.blog.mapper;

import com.hdu.blog.entity.Article;
import com.hdu.blog.entity.ArticleTag;

import java.util.List;

/**
 * @author cellphone
 * @create 2020-10-28 19:43
 */
public interface ArticleTagMapper {
    List<ArticleTag> listArticleTag();
    List<Article> getArticleByTag(int tagID);
}
