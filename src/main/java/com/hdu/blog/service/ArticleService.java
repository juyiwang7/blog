package com.hdu.blog.service;

import com.hdu.blog.entity.Article;

import java.util.List;

public interface ArticleService {
    List<Article> listArticle();
    Article getArticle(int id);
    List<Article> getArticleByCategory(int id);
    List<Article> getArticleByTag(int id);
}
