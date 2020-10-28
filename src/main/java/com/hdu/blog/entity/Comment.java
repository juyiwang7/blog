package com.hdu.blog.entity;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * @author cellphone
 * @create 2020-10-28 18:47
 */
@Data
@ToString
public class Comment {
    private int comment_id;
    private String comment_content;
    private Date comment_date;
    private int article_id;
    private int user_id;
    private Date create_time;
    private Date update_time;
}