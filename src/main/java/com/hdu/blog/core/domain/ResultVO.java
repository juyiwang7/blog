package com.hdu.blog.core.domain;

import java.io.Serializable;

public class ResultVO implements Serializable {
    private static final long serialVersionUID = 1L;

    private static final Integer CODE = 0;

    private Integer code;

    private String msg;

    private Object data;

    public ResultVO() {

    }

    public ResultVO(Integer code) {
        this.code = code;
    }

    public ResultVO(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ResultVO(Integer code, Object data) {
        this.code = code;
        this.data = data;
    }

    public ResultVO(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public ResultVO(Object data) {
        this.data = data;
    }

    public static ResultVO error() {
        return error(500, "未知异常，请联系管理员");
    }

    public static ResultVO error(String msg) {
        return error(500, msg);
    }

    public static ResultVO error(Integer code, String msg) {
        return new ResultVO(code, msg);
    }

    public static ResultVO ok(String msg) {
        return new ResultVO(CODE, msg);
    }

    public static ResultVO ok(Object data) {
        return new ResultVO(CODE, data);
    }
    public static ResultVO ok(String msg, Object data) {
        return new ResultVO(CODE, msg, data);
    }
    public static ResultVO ok() {
        return new ResultVO(CODE);
    }


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        // Create a copy, don't share the array
        return "code:"+this.getCode()+"msg:"+this.getMsg()+"data:"+this.getData();
    }
}
