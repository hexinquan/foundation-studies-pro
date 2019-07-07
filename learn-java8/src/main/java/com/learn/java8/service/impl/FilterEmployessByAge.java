/**
 * Copyright (C), 2018-2018, 深圳市莫思餐飲有限公司
 * FileName: FilterEmployessByAge
 * Author:   IT002
 * Date:     2018/8/31 12:57
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.learn.java8.service.impl;

import com.learn.java8.entity.Employee;
import com.learn.java8.service.FilterEmployess;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author IT002
 * @create 2018/8/31
 * @since 1.0.0
 */
public class FilterEmployessByAge implements FilterEmployess<Employee>{

    @Override
    public boolean filter(Employee employee) {
        return employee.getAge()>=30;
    }
}
