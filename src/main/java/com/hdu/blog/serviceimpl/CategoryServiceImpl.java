package com.hdu.blog.serviceimpl;

import com.hdu.blog.entity.Category;
import com.hdu.blog.mapper.CategoryMapper;
import com.hdu.blog.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryMapper categoryMapper;

    @Override
    public List<Category> listCategory() {
        return categoryMapper.listCategory();
    }

    @Override
    public Category getCategory(int id) {
        return categoryMapper.getCategory(id);
    }

    @Override
    public List<Category> getAllCategorys() {
        return categoryMapper.getAllCategorys();
    }

}
