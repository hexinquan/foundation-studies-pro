/**
 * Copyright (C), 2018-2018, 深圳市莫思餐飲有限公司
 * FileName: TestDecoration
 * Author:   IT002
 * Date:     2018/8/30 10:34
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.learn.decoration.test;

import com.learn.decoration.decorate.jacket.JacketDecoration;
import com.learn.decoration.decorate.plant.PlantDecoration;
import com.learn.decoration.decorate.shoe.ShoeDecoration;
import com.learn.decoration.role.Hounter;
import com.learn.decoration.role.Magic;
import com.learn.decoration.role.RoleDescription;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author IT002
 * @create 2018/8/30
 * @since 1.0.0
 */
public class TestDecoration {
    public static void main(String[] args) {
        //创建裸体的法师
        RoleDescription magic=new Magic();
        System.out.println(magic.describe());
        //法师穿上衣服
        JacketDecoration jacket=new JacketDecoration(magic);
        System.out.println(jacket.describe());
        //法师穿上了鞋子
        ShoeDecoration shoeDecoration =new ShoeDecoration(jacket);
        System.out.println(shoeDecoration.describe());

        PlantDecoration palntDecoration= new PlantDecoration(shoeDecoration);
        System.out.println(palntDecoration.describe());

        //猎人
        RoleDescription target= new ShoeDecoration(new JacketDecoration(new Hounter()));
        System.out.println(target.describe());

    }
}
