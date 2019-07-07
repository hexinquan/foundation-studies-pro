/**
 * Copyright (C), 2018-2018, 深圳市莫思餐飲有限公司
 * FileName: DemoListener
 * Author:   IT002
 * Date:     2018/8/21 11:01
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.demo.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * 〈一句话功能简述〉<br>
 *
 * @author IT002
 * @create 2018/8/21
 * @since 1.0.0
 */
@WebListener
public class DemoListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("==============contextInitialized 容器启动初始化 listener ================");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("==============contextDestroyed 容器销毁 listener ================");
    }
}
