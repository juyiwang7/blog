package com.hdu.blog.entity;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

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
    private int category_id;
    private int user_id;
}
