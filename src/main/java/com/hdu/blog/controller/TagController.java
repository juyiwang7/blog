package com.hdu.blog.controller;

import com.hdu.blog.core.domain.ResultVO;
import com.hdu.blog.entity.Category;
import com.hdu.blog.entity.Tag;
import com.hdu.blog.service.TagService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tags")
public class TagController {
    @Autowired
    private TagService tagService;

    @GetMapping
    @ApiOperation(value = "查看所有标签的基本信息")
    public ResultVO getAllCategorys(){
        List<Tag> allTags = tagService.getAllTags();
        return ResultVO.ok(allTags);
    }

    @GetMapping("/detail")
    @ApiOperation(value = "查看所有标签")
    public ResultVO listTag(){
        List<Tag> tags = tagService.listTag();
        return ResultVO.ok(tags);
    }

    @GetMapping("/detail/{id}")
    @ApiOperation(value = "查看指定标签")
    public ResultVO getTag(@PathVariable("id") int id){
        Tag tag = tagService.getTag(id);
        return ResultVO.ok(tag);
    }
}
