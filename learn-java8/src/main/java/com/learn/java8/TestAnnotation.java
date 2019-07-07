/**
 * Copyright (C), 2018-2018, 深圳市莫思餐飲有限公司
 * FileName: TestAnnotation
 * Author:   IT002
 * Date:     2018/9/12 15:45
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.learn.java8;

import java.lang.reflect.Method;

/**
 *  Java 8 重复注解与类型注解
 * 〈〉
 *  重复注解注意事项：MyAnnotation 重复注解需添加 @Repeatable 元注解 指定注解容器 MyAnnotation
 *  类型注解
 * @author IT002
 * @create 2018/9/12
 * @since 1.0.0
 */
public class TestAnnotation {

    public static void main(String[] args) throws Exception{
        Class<TestAnnotation> clazz= TestAnnotation.class;
        Method m1=clazz.getMethod("show");
        MyAnnotation [] mys= m1.getAnnotationsByType(MyAnnotation.class);
        for (MyAnnotation my:mys
             ) {
            System.out.println(my.value());
        }
    }

    @MyAnnotation("hello")
    @MyAnnotation("word")
    public static void show(@MyAnnotation("aaa") String str){

    }
}
