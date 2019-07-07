/**
 * Copyright (C), 2018-2018, 深圳市莫思餐飲有限公司
 * FileName: DemoServiceImpl
 * Author:   IT002
 * Date:     2018/8/23 18:21
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.demo.service.impl;

import com.example.demo.dao.entity.User;
import com.example.demo.service.DemoService;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author IT002
 * @create 2018/8/23
 * @since 1.0.0
 */
public class DemoServiceImpl implements DemoService {

    @Override
    public void addDemo(User user) {
        System.out.println("DemoServiceImpl addDemo");
    }

    @Override
    public void delDemo(User user) {
        System.out.println("");
    }
}
