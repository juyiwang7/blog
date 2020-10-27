package com.hdu.blog.entity;

import lombok.Data;
import lombok.ToString;

import java.util.Date;
import java.util.List;

@Data
@ToString
public class Article {
    private int article_id;
    private String article_title;
    private String article_content;
    private Date create_time;
    private Date update_time;
    private Date article_time;
    private int article_viewcount;
    private int article_commentcount;
//    private int category_id;//用对象
//    private int user_id;//用对象

    private Category category;
    private List<Tag> tag;
    private User user;
//    private List<Tag> tag;
}
