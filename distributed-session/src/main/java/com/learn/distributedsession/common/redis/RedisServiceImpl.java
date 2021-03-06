/**
 * Copyright (C), 2018-2018, 深圳市莫思餐飲有限公司
 * FileName: RedisServiceImpl
 * Author:   IT002
 * Date:     2018/9/18 14:22
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.learn.distributedsession.common.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;

import java.util.concurrent.TimeUnit;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author IT002
 * @create 2018/9/18
 * @since 1.0.0
 */
public class RedisServiceImpl implements RedisService {

    @Autowired
    private RedisTemplate<String,?> redisTemplate;

    @Override
    public boolean set(String key, String value) {

        return redisTemplate.execute(new RedisCallback<Boolean>() {
            @Override
            public Boolean doInRedis(RedisConnection redisConnection) throws DataAccessException {
                RedisSerializer<String> serializer=redisTemplate.getStringSerializer();
                return redisConnection.set(serializer.serialize(key),serializer.serialize(value));
            }
        });
    }

    @Override
    public String get(String key) {
        return redisTemplate.execute(new RedisCallback<String>() {
            @Override
            public String doInRedis(RedisConnection redisConnection) throws DataAccessException {
                RedisSerializer<String> serializer =redisTemplate.getStringSerializer();
                byte[] bytes=redisConnection.get(serializer.serialize(key));
                return serializer.deserialize(bytes);
            }
        });
    }

    @Override
    public boolean expire(String key, long time) {
        return redisTemplate.expire(key,time,TimeUnit.SECONDS);
    }
}
