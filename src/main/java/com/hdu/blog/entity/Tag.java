package com.hdu.blog.entity;


import lombok.Data;
import lombok.ToString;

import java.util.Date;

//        tag_id
//        tag_name
//        user_id
//        create_time
//        update_time
@Data
@ToString
public class Tag {
    private int tag_id;
    private String tag_name;
    private int user_id;
    private Date create_time;
    private Date update_time;
}
