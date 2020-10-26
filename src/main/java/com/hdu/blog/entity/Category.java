package com.hdu.blog.entity;


import lombok.Data;
import lombok.ToString;
import java.util.Date;


//        category_id	        类别id	        bigint unsigned
//        category_name	        类别名称	        varchar(64)
//        category_description	类别简介	        varchar(64)
//        user_id	            用户id	        bigint unsigned
//        create_time	        创建时间	        datetime
//        update_time	        更新时间	        datetime

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
