/**
 * Copyright (C), 2018-2018, 深圳市莫思餐飲有限公司
 * FileName: CustomerServiceImpl
 * Author:   IT002
 * Date:     2018/9/13 18:37
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.demo.service.impl;

import com.example.demo.dao.entity.Customer;
import com.example.demo.dao.mapper.CustomerMapper;
import com.example.demo.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author IT002
 * @create 2018/9/13
 * @since 1.0.0
 */
@Service
public class CustomerServiceImpl implements ICustomerService {

    @Autowired
    CustomerMapper customerMapper;

    @Override
    public void insertbean(Customer customer) {
        try {
            customerMapper.insertbean(customer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
