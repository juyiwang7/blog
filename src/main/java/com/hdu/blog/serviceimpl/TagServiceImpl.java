package com.hdu.blog.serviceimpl;

import com.hdu.blog.entity.Article;
import com.hdu.blog.entity.Tag;
import com.hdu.blog.mapper.TagMapper;
import com.hdu.blog.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagServiceImpl implements TagService {
    @Autowired
    private TagMapper tagMapper;

    @Override
    public List<Tag> listTag() {
        return tagMapper.listTag();
    }

    @Override
    public Tag getTag(int id) {
        return tagMapper.getTag(id);
    }

    @Override
    public List<Tag> getAllTags() {
        return tagMapper.getAllTags();
    }

    @Override
    public void addArtcleTags(Article article) {
        tagMapper.addArticleTags(article);
    }
}
