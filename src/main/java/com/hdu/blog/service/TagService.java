package com.hdu.blog.service;

import com.hdu.blog.entity.Tag;

import java.util.List;

public interface TagService {
    public List<Tag> listTag();
    public Tag getTag(int id);
}
