package com.hdu.blog.controller;

import com.hdu.blog.core.domain.ResultVO;
import com.hdu.blog.entity.Category;
import com.hdu.blog.service.CategoryService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categorys")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;


    @GetMapping
    @ApiOperation(value = "查看所有分类的基本信息")
    public ResultVO getAllCategorys(){
        List<Category> allCategorys = categoryService.getAllCategorys();
        return ResultVO.ok(allCategorys);
    }

    @GetMapping("/detail")
    @ApiOperation(value = "查看所有分类")
    public ResultVO listCategory(){
        List<Category> categories = categoryService.listCategory();
        return ResultVO.ok(categories);
    }

    @GetMapping("/detail/{id}")
    @ApiOperation(value = "查看指定分类")
    public ResultVO getCategory(@PathVariable("id") int id){
        Category cateogory = categoryService.getCategory(id);
        return ResultVO.ok(cateogory);
    }
}
