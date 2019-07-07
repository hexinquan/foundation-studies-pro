/**
 * Copyright (C), 2018-2018, 深圳市莫思餐飲有限公司
 * FileName: UUIDUtil
 * Author:   IT002
 * Date:     2018/9/18 14:35
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.learn.distributedsession.util;

import java.util.UUID;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author IT002
 * @create 2018/9/18
 * @since 1.0.0
 */
public class UUIDUtil {
    public static String getUUID(){
        return UUID.randomUUID().toString().replace("-","").toUpperCase();
    }
}
