package com.hdu.blog.entity;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
public class Category {
    private int category_id;
    private String category_name;
    private String category_description;
    private User user;
    private Date create_time;
    private Date update_time;
}
