/**
 * Copyright (C), 2018-2018, 深圳市莫思餐飲有限公司
 * FileName: CustomerController
 * Author:   IT002
 * Date:     2018/9/13 18:34
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.demo.controller;

import com.example.demo.dao.entity.Customer;
import com.example.demo.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author IT002
 * @create 2018/9/13
 * @since 1.0.0
 */
@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    ICustomerService customerService;

    @GetMapping("/insert")
    public void insert(){
        Customer customer=new Customer();
        customer.setId(1234567890L);
        customer.setCustomerMobile("13798543697");
        customerService.insertbean(customer);
    }
}
