package com.hdu.blog.core.util;

public class StringUtils {
    //string为null或 “”时，为空
    public static boolean isEmpty(String value) {
        if (null == value)
            return true;
        return value.isEmpty();
    }
}
