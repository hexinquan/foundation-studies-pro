/**
 * Copyright (C), 2018-2018, 深圳市莫思餐飲有限公司
 * FileName: Magic
 * Author:   IT002
 * Date:     2018/8/29 18:18
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.learn.decoration.role;

/**
 *法师
 * @author IT002
 * @create 2018/8/29
 * @since 1.0.0
 */
public class Magic implements RoleDescription{

    @Override
    public String describe() {
        return "法师";
    }
}
