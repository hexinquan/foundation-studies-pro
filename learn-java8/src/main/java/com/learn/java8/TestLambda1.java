/**
 * Copyright (C), 2018-2018, 深圳市莫思餐飲有限公司
 * FileName: TestLambda
 * Author:   IT002
 * Date:     2018/8/31 11:46
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.learn.java8;

import com.learn.java8.entity.Employee;
import com.learn.java8.service.FilterEmployess;
import com.learn.java8.service.impl.FilterEmployessByAge;
import com.learn.java8.service.impl.FilterEmployessBySalary;

import java.util.*;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author IT002
 * @create 2018/8/31
 * @since 1.0.0
 */
public class TestLambda1 {
    /**
     * 原来JDK1.7 匿名内部类
     * 比较两个int类型大小
     * @throws Exception
     */
    public void test1()throws Exception{
        Comparator<Integer> com= new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }
        };
        TreeSet<Integer> ts =new TreeSet<Integer>(com);
    }

    /**
     * JDK1.8 Lambda 匿名内部类
     * 比较两个int类型大小
     */
    public void test2(){
        Comparator<Integer> com = (x,y) -> Integer.compare(x,y);
        TreeSet<Integer> ts =new TreeSet<>(com);
    }

    static List<Employee> employees=Arrays.asList(
            new Employee("张三",18,9999.99),
            new Employee("李四",38,5555.99),
            new Employee("王五",50,6666.66),
            new Employee("赵六",16,3333.33),
            new Employee("田七",10,7777.77)
            );
    //需求1过滤年龄大于等于30的员工信息
    //需求2过滤工资大于等于5000的员工信息
    /**
     * 一般的过滤方法采用for循环
     */
    public static void filterEmployessByAge(){
        for (Employee employee:employees){
            if(employee.getAge()>=30){
                System.out.println(employee);
            }
        }
    }
    /**
     * 一般过滤方法采用for循环
     */
    public static void filterEmployessBySalary() {
        for (Employee employee:employees){
            if(employee.getSalary()>=5000){
                System.out.println(employee);
            }
        }
    }

    /**
     * 优化方案一 策略设计模式
     * @param employees
     * @param mp
     * @return
     */
    public static  void filterEmployess(List<Employee> employees, FilterEmployess<Employee> mp){
        for (Employee employee:employees){
            if(mp.filter(employee)){
                System.out.println(employee);
            }
        }

    }

   /* public static  List<Employee> filterEmployessList(List<Employee> employees, FilterEmployess<Employee> mp){
        List<Employee> employeeList= new ArrayList<>();
        for (Employee employee:employees){
            if(mp.filter(employee)){
                System.out.println(employee);
                employeeList.add(employee);
            }
        }
        return employeeList;
    }*/

    /**
     * 优化方案二 匿名内部类
     */
    public static void filterEmployess(){
        filterEmployess(employees, new FilterEmployess<Employee>() {
            @Override
            public boolean filter(Employee employee) {
                return employee.getAge()>=30;
            }
        });
        System.out.println("-----------------------");
        filterEmployess(employees, new FilterEmployess<Employee>() {
            @Override
            public boolean filter(Employee employee) {
                return employee.getSalary()>=5000;
            }
        });
    }

    public static  List<Employee> filterEmployessLambda(List<Employee> employees, FilterEmployess<Employee> mp){
        List<Employee> employeeList=new ArrayList<>();
        for (Employee employee:employees){
            if(mp.filter(employee)){
                employeeList.add(employee);
            }
        }
        return employeeList;
    }

    public static void main(String[] args) {
        System.out.println("----------一般的方法过滤");
        filterEmployessByAge();
        System.out.println("-----------------------");
        filterEmployessBySalary();
        System.out.println("-----------------------");
        System.out.println("----------优化方案一(策略设计模式)");
        filterEmployess(employees,new FilterEmployessByAge());
        System.out.println("-----------------------");
        filterEmployess(employees,new FilterEmployessBySalary());
        System.out.println("-----------------------");

        System.out.println("----------优化方案二(匿名内部类)");
        filterEmployess();

        System.out.println("----------优化方案三Lambda表达式");
        List<Employee> lambdaList= filterEmployessLambda(employees,(e)->e.getAge()>=30);
        lambdaList.forEach(System.out::println);
        System.out.println("----------优化方案四Lambda表达式 stream");
        employees.stream()
                .filter((e)-> e.getAge()>=30) //过滤list里面的对象的年龄》=30
                .forEach(System.out::println); //过滤之后 再循环打印每个对象信息

        employees.stream()
                    .map(Employee::getName)
                   // .limit(1)
                   // .sorted()
                    .forEach(System.out::println);

    }
}
