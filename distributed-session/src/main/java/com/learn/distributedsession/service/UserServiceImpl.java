/**
 * Copyright (C), 2018-2018, 深圳市莫思餐飲有限公司
 * FileName: UserServiceImpl
 * Author:   IT002
 * Date:     2018/9/18 14:32
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.learn.distributedsession.service;

import com.alibaba.fastjson.JSON;
import com.learn.distributedsession.common.redis.SystemConstant;
import com.learn.distributedsession.common.redis.RedisService;
import com.learn.distributedsession.domain.UserInfo;
import com.learn.distributedsession.util.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.Cookie;
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
public class UserServiceImpl implements UserService {

    @Autowired
    RedisService redisService;

    @Override
    public UserInfo login(HttpServletResponse response, UserInfo user) {
        if("123".equals(user.getUserName())&& "123".equals(user.getPassword())){
            //生成一个会话ID
            String sessionId= UUIDUtil.getUUID();
            //生成的sessionId存储redis对应user对象
            redisService.set(sessionId,JSON.toJSONString(user));
            redisService.expire(sessionId,SystemConstant.SESSION_TIME_OUT); //设置有效期

            Cookie cookie=new Cookie(SystemConstant.COOKIE_NAME,sessionId);
            //需设置cookie的访问域,访问路径,有效时间
            //cookie.setDomain("www.demo.com");
            cookie.setPath("/");
            cookie.setMaxAge(SystemConstant.SESSION_TIME_OUT);
            response.addCookie(cookie);
        }
        return null;
    }

    @Override
    public UserInfo getTokenByUser(HttpServletRequest request, String token) {
        return null;
    }
}
