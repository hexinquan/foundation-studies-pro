/**
 * Copyright (C), 2018-2018, 深圳市莫思餐飲有限公司
 * FileName: TestProxy
 * Author:   IT002
 * Date:     2018/8/30 15:33
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.learn.proxy;

import com.learn.proxy.proxytarget.MathMaker;
import com.learn.proxy.target.Owner;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author IT002
 * @create 2018/8/30
 * @since 1.0.0
 */
public class TestProxy {
    public static void main(String[] args) {
        FunctionService owner =new Owner();
        owner.findGirlFriend();
        //红娘代理找对象
        MathMaker mathMaker=new MathMaker(owner);
        mathMaker.findGirlFriend();
    }
}
