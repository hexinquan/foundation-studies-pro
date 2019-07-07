/**
 * Copyright (C), 2018-2018, 深圳市莫思餐飲有限公司
 * FileName: AbstractDecorate
 * Author:   IT002
 * Date:     2018/8/29 18:54
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.learn.decoration.decorate;

import com.learn.decoration.role.RoleDescription;

/**
 * 所有具体装饰类的父类
 * @author IT002
 * @create 2018/8/29
 * @since 1.0.0
 */
public abstract class AbstractDecorate implements RoleDescription {

    //持有被装饰者实现接口的引用
    private RoleDescription rdI;

    public  AbstractDecorate(){

    }
    public AbstractDecorate(RoleDescription rdI){
        this.rdI=rdI;
    }
    @Override
    public String describe(){
        return  rdI.describe();
    }


}
