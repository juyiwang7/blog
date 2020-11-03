package com.hdu.blog.service;

import com.hdu.blog.entity.Article;
import com.hdu.blog.entity.Tag;

import java.util.List;

public interface TagService {
    public List<Tag> listTag();
    public Tag getTag(int id);
    public List<Tag> getAllTags();
    public void addArtcleTags(Article article);
}
