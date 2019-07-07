/**
 * Copyright (C), 2018-2018, 深圳市莫思餐飲有限公司
 * FileName: TestLambda
 * Author:   IT002
 * Date:     2018/8/31 15:28
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.learn.java8;

import com.learn.java8.entity.Employee;
import com.learn.java8.service.LambdaGetValue;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author IT002
 * @create 2018/8/31
 * @since 1.0.0
 */
public class TestLambda {

    static List<Employee> employees=Arrays.asList(
            new Employee("张三",18,9999.99),
            new Employee("李四",38,5555.99),
            new Employee("王五",50,6666.66),
            new Employee("赵六",16,3333.33),
            new Employee("田七",10,7777.77)
    );

    public static void main(String[] args) {
        test1();
        test2();
    }

    /**
     * 调用Collections.sort 方法,通过定制排序比较两个Employee(先按年龄比较,年龄相同按姓名比),使用Lambda参数传递
     */
    public static void test1(){
        Collections.sort(employees,(e1,e2) ->{
            if (e1.getAge()== e2.getAge()){
                return e1.getName().compareTo(e2.getName());
            }else {
                return -Integer.compare(e1.getAge(),e2.getAge());
            }
        });
        for (Employee employee:employees){
            System.out.println(employee);
        }
    }

    public static void test2(){
        String outStr=strHandler("abcd",(e) -> e.toUpperCase());
        System.out.println(outStr);
    }

    public static String strHandler(String val, LambdaGetValue lambdaGetValue){
        return lambdaGetValue.getVlaue(val);
    }
}
