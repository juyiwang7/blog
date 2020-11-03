package com.hdu.blog.mapper;


import com.hdu.blog.entity.Article;
import com.hdu.blog.entity.Tag;

import java.util.List;

public interface TagMapper {
    List<Tag> listTag();
    Tag getTag(int id);
    List<Tag> getAllTags();//得到基本tag的基本信

    void addArticleTags(Article article);
}
