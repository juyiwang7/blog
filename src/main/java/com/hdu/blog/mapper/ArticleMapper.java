package com.hdu.blog.mapper;

import com.hdu.blog.entity.Article;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ArticleMapper {
    List<Article> listArticle();
    List<Article> listHotArticle();
    Article getArticle(int id);
    List<Article> getArticleByCategory(int id);
    List<Article> getArticleByTag(int id);
    void publishArticle(Article article);
    void deleteArticleCategory(int category_id);
    void addCommentCountAndViewCount(int articleId);
}