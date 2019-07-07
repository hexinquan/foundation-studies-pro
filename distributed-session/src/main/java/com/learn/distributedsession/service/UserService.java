/**
 * Copyright (C), 2018-2018, 深圳市莫思餐飲有限公司
 * FileName: UserService
 * Author:   IT002
 * Date:     2018/9/18 14:29
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.learn.distributedsession.service;

import com.learn.distributedsession.domain.UserInfo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author IT002
 * @create 2018/9/18
 * @since 1.0.0
 */
public interface UserService {
    /**
     * 登录
     * @param user
     * @return
     */
    UserInfo login(HttpServletResponse response,UserInfo user);

    /**
     * 根据token获取对应的用户对象
     * @param request
     * @param token
     * @return
     */
    UserInfo getTokenByUser(HttpServletRequest request,String token);
}
