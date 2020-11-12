package com.hdu.blog.controller;

import com.hdu.blog.core.domain.ResultVO;
import com.hdu.blog.entity.Category;
import com.hdu.blog.entity.User;
import com.hdu.blog.service.ArticleService;
import com.hdu.blog.service.CategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorys")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private ArticleService articleService;


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

    @PostMapping("/add")
    @ApiOperation(value="增加分类")
    public ResultVO addCategory(@RequestBody Category category){
        User user = new User();
        user.setUser_id(1);
        category.setUser(user);
        categoryService.addCategory(category);
        return ResultVO.ok(category);
    }

    @GetMapping("/toUpdate/{id}")
    @ApiOperation(value="获取要修改的类别信息")
    public ResultVO toUpdateCategory(@PathVariable("id") int id){
        Category category = categoryService.getCategory(id);
        return ResultVO.ok(category);
    }

    @PostMapping("/update")
    @ApiOperation(value="修改分类")
    public ResultVO updateCategory(@RequestBody Category category){
        categoryService.updateCategory(category);
        return ResultVO.ok(category);
    }

    @PostMapping("/delete")
    @ApiOperation(value="删除分类")
    public ResultVO deleteCategory(int id){
        categoryService.deleteCategory(id);
//        articleService.deleteArticleCategory(id);
        return ResultVO.ok("删除类别："+id);
    }
}
