/**
 * Copyright (C), 2018-2018, 深圳市莫思餐飲有限公司
 * FileName: JsonFilterController
 * Author:   IT002
 * Date:     2018/8/23 19:04
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.demo.controller;

import com.example.demo.annotaion.JsonFilter;
import com.example.demo.dao.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author IT002
 * @create 2018/8/23
 * @since 1.0.0
 */
@RestController
@RequestMapping("jsonFilter")
public class JsonFilterController {

    @GetMapping("/jsonFilter")
    @JsonFilter(clazz = User.class, includes = {"", ""}, excludes = {"", ""})
    public User jsonFilter() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        User user = new User();
        user.setName("hexinquan");
        user.setEmail("630050024@qq.com");
        System.out.println("===================sayHellotyhmeleaf");
        Class<User> auserClass = User.class;
        Field[] field = auserClass.getFields();
        return user;
    }

    public static void main(String[] args) throws Exception {
        getClassForFields();
        getClassMethodInfo();
        getClassForConstructor();
    }

    /**
     * 获取所有的构造函数
     */
    private static void getClassForConstructor() throws Exception {
        Class<User> clazz = User.class;
        //获取所有pblic的构造函数
        Constructor<?>[] constructors = clazz.getConstructors();
        for (Constructor constructor : constructors
                ) {
            System.out.println(constructor);
        }
        System.out.println("================================");
        //获取所有构造参数包含private
        constructors = clazz.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
            System.out.println("访问修饰符:" + Modifier.toString(constructor.getModifiers()));
            System.out.println("构造函数名称:" + constructor.getName());
            System.out.println("参数列表:" + Arrays.toString(constructor.getParameterTypes()));
            System.out.println("================================");
        }
        //调用构造函数
        Constructor<User> constructor = clazz.getDeclaredConstructor(String.class, String.class);
        constructor.setAccessible(true);
        User user = constructor.newInstance("hexinquan", "530050023@qq.com");
        System.out.println(user.toString());
    }

    private static void getClassMethodInfo() throws Exception {
        Class<User> clazz = User.class;
        //获取当前所有的public的修饰方法(private获取不到)
        Method[] methods = clazz.getMethods();
        for (Method method : methods
                ) {
            System.out.println(method);
        }
        System.out.println("=========================");
        //获取所有修饰符的所有方法
        methods = clazz.getDeclaredMethods();
        for (Method method : methods
                ) {
            System.out.println(method);
            System.out.println("访问修饰符:" + Modifier.toString(method.getModifiers()));
            System.out.println("返回类型名称:" + method.getReturnType().getSimpleName());
            System.out.println("方法名称:" + method.getName());
            System.out.println("参数名称:" + Arrays.toString(method.getParameterTypes()));
            System.out.println("参数个数:" + method.getParameterCount());
            System.out.println("=======================");
        }
        //通过反射实例化一个对象
        Object instance = clazz.newInstance();
        //获取getName单个方法
        Method method = clazz.getDeclaredMethod("setName", String.class);
        method.setAccessible(true);//设置私有方法为可调用
        method.invoke(instance, "hexinquan");//通过反射机制调用实例中的setName方法，并且传入值

        method = clazz.getDeclaredMethod("getName");
        method.setAccessible(true);
        Object value = method.invoke(instance);
        System.out.println(value);


    }

    /**
     * 获取类的所有属性信息
     */
    private static void getClassForFields() throws Exception {
        Class<User> uClazz = User.class;
        Field[] fields = uClazz.getFields(); //获取当前类的所以public属性
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("===================");
        fields = uClazz.getDeclaredFields(); //获取全部属性
        for (Field field : fields
                ) {
            System.out.println(field);
            System.out.println("访问修饰符:" + Modifier.toString(field.getModifiers()));
            System.out.println("类型名称:" + field.getType().getSimpleName());
            System.out.println("属性名称:" + field.getName());

        }
        Object instance = uClazz.newInstance();
        Field userNameField = uClazz.getDeclaredField("name");
        userNameField.setAccessible(true);
        userNameField.set(instance, "掉咋填");
        Object value = userNameField.get(instance);
        System.out.println(value);
    }

    private static void getClassInfo() {
        Class<User> uClazz = User.class;
        System.out.println("类的全名称:" + uClazz.getName());
        System.out.println("类的简单名称:" + uClazz.getSimpleName());
        System.out.println("访问修饰符:" + Modifier.toString(uClazz.getModifiers()));
    }
}
