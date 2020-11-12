package com.hdu.blog.core.annotation;


import java.lang.annotation.*;


//日志注解
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LogAnnotation {

    String module() default "";
    String type() default "";
    String description() default "";

}
