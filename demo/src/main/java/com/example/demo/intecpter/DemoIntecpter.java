/**
 * Copyright (C), 2018-2018, 深圳市莫思餐飲有限公司
 * FileName: DemoIntecpter
 * Author:   IT002
 * Date:     2018/8/21 11:35
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.demo.intecpter;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author IT002
 * @create 2018/8/21
 * @since 1.0.0
 */
public class DemoIntecpter implements HandlerInterceptor {
    /**
     * 调用具体方法之前
     *
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("======================DemoIntecpter  preHandle");
        String token = request.getParameter("access_token");
        //response.getWriter().print("hello prehandle");
        return HandlerInterceptor.super.preHandle(request, response, handler);
    }

    /**
     * 调用具体方法之后(视图渲染之前)
     *
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("======================DemoIntecpter 视图渲染之前 postHandle");
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }

    /**
     * 整个完成之后,通常利用于资源清理
     *
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("======================DemoIntecpter  afterCompletion");
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    }
}
