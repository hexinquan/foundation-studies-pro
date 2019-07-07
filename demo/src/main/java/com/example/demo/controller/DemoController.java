/**
 * Copyright (C), 2018-2018, 深圳市莫思餐飲有限公司
 * FileName: DemoController
 * Author:   IT002
 * Date:     2018/8/16 11:50
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.demo.controller;

import com.example.demo.annotaion.JsonFilter;
import com.example.demo.dao.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 〈一句话功能简述〉<br>
 *
 * @author IT002
 * @create 2018/8/16
 * @since 1.0.0
 */
@Controller
@RequestMapping("/api")
public class DemoController {

    @GetMapping("/filter")
    public String filter() {
        System.out.println("sayhellofilter controller 处理......");
        return "success";
    }

    @GetMapping("/listener")
    public String listener() {
        System.out.println("sayhellofilterlistener controller 处理......");
        return "success";
    }

    @GetMapping("/intecpter")
    public String intecpter() {
        System.out.println("sayHelloIntecpter controller 处理......");
        return "success";
    }

    @GetMapping("/intecptertwo")
    public String sayHelloTwoIntecpter() {
        System.out.println("sayHelloTwoIntecpter controller 处理......");
        return "success";
    }

    @GetMapping("/freemarke")
    public String sayHelloFreemarke(ModelMap modelMap) {
        User user = new User();
        user.setName("hexinquan");
        user.setEmail("630050024@qq.com");
        modelMap.addAttribute("user", user);
        return "fm/demo";
    }

    @GetMapping("/thymeleaf")
    public ModelAndView sayHellotyhmeleaf() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        User user = new User();
        user.setName("hexinquan");
        user.setEmail("630050024@qq.com");
        //modelMap.addAttribute("user",user);
        System.out.println("===================sayHellotyhmeleaf");
        return modelAndView;

    }

    @GetMapping("/jsonFilter")
    @JsonFilter(clazz = User.class, includes = {"", ""}, excludes = {"", ""})
    public User jsonFilter() {
        System.out.println("===================jsonFilter");
        User user = new User();
        user.setName("hexinquan");
        user.setEmail("email");
        System.out.println("===================jsonFilter end222");
        return user;
    }
}
