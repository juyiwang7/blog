package com.hdu.blog.mapper;

import com.hdu.blog.entity.Category;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryMapper {
    List<Category> listCategory();
    Category getCategory(int id);
}
