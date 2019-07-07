/**
 * Copyright (C), 2018-2018, 深圳市莫思餐飲有限公司
 * FileName: JacketDecoration
 * Author:   IT002
 * Date:     2018/8/29 19:07
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.learn.decoration.decorate.jacket;

import com.learn.decoration.decorate.AbstractDecorate;
import com.learn.decoration.role.RoleDescription;

/**
 * 上衣装饰类
 * @author IT002
 * @create 2018/8/29
 * @since 1.0.0
 */
public class JacketDecoration extends AbstractDecorate {
    private  RoleDescription rdI;
    public  JacketDecoration(RoleDescription rdI){
        super(rdI);
        this.rdI=rdI;
    }
    @Override
    public  String describe(){
        return rdI.describe()+"穿上了新衣";
    }
}
