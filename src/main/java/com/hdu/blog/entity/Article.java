package com.hdu.blog.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.util.List;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Article {
    private int article_id;
    private String article_title;
    private String article_content;
    private Date create_time;
    private Date update_time;
    private Date article_time;
    private int article_viewcount;
    private int article_commentcount;

    private Category category;
    private List<Tag> tag;
    private User user;

}
