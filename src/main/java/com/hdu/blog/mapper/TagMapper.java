package com.hdu.blog.mapper;


import com.hdu.blog.entity.Article;
import com.hdu.blog.entity.Tag;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface TagMapper {
    List<Tag> listTag();
    Tag getTag(int id);
    List<Tag> getAllTags();//得到基本tag的基本信

    void addArticleTags(Article article);
}
