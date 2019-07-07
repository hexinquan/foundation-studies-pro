/**
 * Copyright (C), 2018-2018, 深圳市莫思餐飲有限公司
 * FileName: RedisService
 * Author:   IT002
 * Date:     2018/9/18 14:21
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.learn.distributedsession.common.redis;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author IT002
 * @create 2018/9/18
 * @since 1.0.0
 */
public interface RedisService {
    boolean set(String key,String value);
    String get(String key);
    boolean expire(String key,long time);
}
