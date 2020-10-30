package com.hdu.blog.serviceimpl;

import com.hdu.blog.entity.ArticleTag;
import com.hdu.blog.mapper.ArticleTagMapper;
import com.hdu.blog.mapper.CommentMapper;
import com.hdu.blog.service.ArticleTagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author cellphone
 * @create 2020-10-30 17:53
 */
@Service
public class ArticleTagServiceImpl implements ArticleTagService {

    @Autowired
    ArticleTagMapper articleTagMapper;
    @Override
    public List<ArticleTag> listArticleTag() {
        return articleTagMapper.listArticleTag();
    }
}
