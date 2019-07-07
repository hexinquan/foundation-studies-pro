/**
 * Copyright (C), 2018-2018, 深圳市莫思餐飲有限公司
 * FileName: MathMaker
 * Author:   IT002
 * Date:     2018/8/30 15:28
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.learn.proxy.proxytarget;

import com.learn.proxy.FunctionService;
import com.learn.proxy.target.Owner;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author IT002
 * @create 2018/8/30
 * @since 1.0.0
 */
public class MathMaker implements FunctionService {

    private FunctionService functionService;

    public  MathMaker(FunctionService functionService ) {
        this.functionService =functionService;
    }

    public void findGirlFriend() {
        System.out.println("============代理人红娘==========");
        System.out.println("完美小哥哥,已经帮你找到了一个女朋友，她叫完美小姐姐");
    }
}
