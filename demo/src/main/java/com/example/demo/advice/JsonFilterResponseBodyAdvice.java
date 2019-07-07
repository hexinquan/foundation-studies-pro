/**
 * Copyright (C), 2018-2018, 深圳市莫思餐飲有限公司
 * FileName: JsonFilterResponseBodyAdvice
 * Author:   IT002
 * Date:     2018/8/23 17:47
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.demo.advice;

import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * @author IT002
 * @create 2018/8/23
 * @since 1.0.0
 */
public class JsonFilterResponseBodyAdvice implements ResponseBodyAdvice {

    @Override
    public boolean supports(MethodParameter methodParameter, Class aClass) {
        return true;
    }

    @Override
    public Object beforeBodyWrite(Object o, MethodParameter methodParameter, MediaType mediaType, Class aClass, ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {
        System.out.println("==========================JsonFilterResponseBodyAdvice begin ");
        System.out.println(o.toString());
        System.out.println("==========================JsonFilterResponseBodyAdvice end");
        return null;
    }
}
