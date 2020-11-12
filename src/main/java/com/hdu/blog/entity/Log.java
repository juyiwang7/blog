package com.hdu.blog.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Log {
    private int id;
    private String ip;
    private String methodName;
    private String requestParams;
    private String responseParams;
    private String url;
    private String operationModule;
    private String operationDescription;
    private String operationType;
    private Date createDate;
    private long timeTotal;

}
