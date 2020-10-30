package com.hdu.blog.entity;

import lombok.Data;
import lombok.ToString;

import java.util.Date;
import java.util.List;

/**
 * @author cellphone
 * @create 2020-10-28 18:46
 */
@Data
@ToString
public class ArticleTag {
    private int article_tag_id;
    private int article_id;
    private int tag_id;
    private int user_id;
    private Date create_time;
    private Date update_time;

}
