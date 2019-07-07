/**
 * Copyright (C), 2018-2018, 深圳市莫思餐飲有限公司
 * FileName: DemoOneFilter
 * Author:   IT002
 * Date:     2018/8/20 18:05
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.demo.filter;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author IT002
 * @create 2018/8/20
 * @since 1.0.0
 */
@WebFilter(urlPatterns = "/api/", filterName = "demoFilter")
public class DemoOneFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("====================================filter intit 初始化====================================");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("==================doFilter==================");
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        String name = request.getParameter("name");
        System.out.println("name=" + name);
        if ("hexinquan".equals(name)) {
            filterChain.doFilter(servletRequest, servletResponse);
        }
        System.out.println("==================end doFilter==================");
        return;

    }

    @Override
    public void destroy() {
        System.out.println("================ Filter destroy====================");
    }
}
