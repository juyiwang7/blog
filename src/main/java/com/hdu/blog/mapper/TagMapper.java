package com.hdu.blog.mapper;


import com.hdu.blog.entity.Tag;

import java.util.List;

public interface TagMapper {
    List<Tag> listTag();
    Tag getTag(int id);
}
