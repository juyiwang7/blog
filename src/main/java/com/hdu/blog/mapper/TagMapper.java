package com.hdu.blog.mapper;


import com.hdu.blog.entity.Article;
import com.hdu.blog.entity.Tag;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TagMapper {
    List<Tag> listTag();
    Tag getTag(int id);
    List<Tag> getAllTags();//得到基本tag的基本信

    void addArticleTags(Article article);//在article_tag表中增加文章的标签信息

    void addTag(Tag tag);
    void updateTag(Tag tag);
    void deleteTaginTag(int id);
    void deleteTaginArticle_Tag(int id);

}
