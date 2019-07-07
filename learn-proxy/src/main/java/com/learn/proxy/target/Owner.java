/**
 * Copyright (C), 2018-2018, 深圳市莫思餐飲有限公司
 * FileName: owner
 * Author:   IT002
 * Date:     2018/8/30 15:25
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.learn.proxy.target;

import com.learn.proxy.FunctionService;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author IT002
 * @create 2018/8/30
 * @since 1.0.0
 */
public class Owner implements FunctionService {
    public void findGirlFriend() {
        System.out.println("========目标被代理对象======");
        System.out.println("我是完美小哥哥,我要找个女朋友");
    }
}
