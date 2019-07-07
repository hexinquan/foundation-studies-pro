/**
 * Copyright (C), 2018-2018, 深圳市莫思餐飲有限公司
 * FileName: PlantDecoration
 * Author:   IT002
 * Date:     2018/8/30 11:59
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.learn.decoration.decorate.plant;

import com.learn.decoration.decorate.AbstractDecorate;
import com.learn.decoration.role.RoleDescription;

/**
 * 裤子
 * @author IT002
 * @create 2018/8/30
 * @since 1.0.0
 */
public class PlantDecoration extends AbstractDecorate {

    private RoleDescription rdI;

    public PlantDecoration(){

    }
    public PlantDecoration(RoleDescription rdI){
        super(rdI);
        this.rdI=rdI;
    }

    @Override
    public String describe() {
        return rdI.describe()+"穿上了裤子";
    }
}
