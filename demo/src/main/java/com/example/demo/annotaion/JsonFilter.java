package com.example.demo.annotaion;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface JsonFilter {
    Class clazz();

    /**
     * 需要返回的字段
     *
     * @return
     */
    String[] includes() default {};

    /**
     * 需要去除的字段
     *
     * @return
     */
    String[] excludes() default {};
}
