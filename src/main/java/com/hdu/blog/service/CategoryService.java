package com.hdu.blog.service;

import com.hdu.blog.entity.Category;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CategoryService {
    List<Category> listCategory();
//    Category getCategory(int id);
    Category getCategory(int id);
    List<Category> getAllCategorys();
    void addCategory(Category category);
    void updateCategory(Category category);
    void deleteCategory(int id);

}
