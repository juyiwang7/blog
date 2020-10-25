package com.hdu.blog.mapper;

import com.hdu.blog.entity.Article;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ArticleMapper {
    List<Article> listArticle();
}
