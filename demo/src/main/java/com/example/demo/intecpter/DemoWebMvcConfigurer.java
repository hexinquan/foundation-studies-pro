/**
 * Copyright (C), 2018-2018, 深圳市莫思餐飲有限公司
 * FileName: DemoIntecpter
 * Author:   IT002
 * Date:     2018/8/21 11:24
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.demo.intecpter;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author IT002
 * @create 2018/8/21
 * @since 1.0.0
 */
@Configuration
public class DemoWebMvcConfigurer implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new DemoIntecpter()).addPathPatterns("/api/*/**");//拦截指定路径指定方法 /*代表文件夹  /**代表方法
        // registry.addInterceptor(new DemoIntecpter()).addPathPatterns("/api/*/**").excludePathPatterns("/api/sayhellofilter");//拦截指定径指定方法(某些方法不需拦截excludePathPatterns)
    }
}
