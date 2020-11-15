package com.hdu.blog.serviceimpl;

import com.hdu.blog.entity.Article;
import com.hdu.blog.entity.Tag;
import com.hdu.blog.mapper.ArticleMapper;
import com.hdu.blog.mapper.TagMapper;
import com.hdu.blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    ArticleMapper articleMapper;
    @Autowired
    TagMapper tagMapper;

    @Override
    public List<Article> listArticle() {
        return articleMapper.listArticle();
    }

    @Override
    public List<Article> listHotArticle() {
        return articleMapper.listHotArticle();
    }

    public Article getArticle(int id){return articleMapper.getArticle(id);}

    //根据指定的分类获取其下的文章
    public List<Article> getArticleByCategory(int id){return articleMapper.getArticleByCategory(id);}

    //根据指定的tag获取其下的文章
    public List<Article> getArticleByTag(int id){return articleMapper.getArticleByTag(id);}

    @Override
    @Transactional //事务
    public void publishArticle(Article article) {
        articleMapper.publishArticle(article);
        Integer id = article.getArticle_id();
        article.setArticle_id(id);
        tagMapper.addArticleTags(article);
    }

}
