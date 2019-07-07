/**
 * Copyright (C), 2018-2018, 深圳市莫思餐飲有限公司
 * FileName: TestMethodRef
 * Author:   IT002
 * Date:     2018/9/1 14:27
 * Description: Lambda方法引用
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.learn.java8;

import com.learn.java8.entity.Employee;
import java.io.PrintStream;
import java.util.Comparator;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * 〈Lambda方法引用〉
 *     方法引用: 若Lambda 体中的内容有方法已经实现了,我们可以使用 “方法引用”
 *                        (可以理解为方法引用是Lamda表达式的另外一种表现形式)
 *
 * @author IT002
 * @create 2018/9/1
 * @since 1.0.0
 *
 * 主要有三种语法格式
 *
 * 对象::实例方法名
 * 类::静态方法名
 * 类::实例方法名
 *
 * 注意:
 *     Lambda 体中调用方法的参数列表与返回值类型，要与函数接口种抽象方法的函数列表和返回值类型保持一至！》》类::静态方法名
 * @若Lambda 参数列表种的第一参数是实例方法的调用这,而第二参数是实例方法的参数时,可以使用》ClassNmae::method
 */
public class TestMethodRef {

    /**类::静态方法名
     * 体中调用方法的参数列表与返回值类型，要与函数接口种抽象方法的函数列表和返回值类型保持一至
     */
    public static void test1(){
        Comparator<Integer> com= (x,y) -> Integer.compare(x,y);
        Comparator<Integer> comF=Integer::compare;
        System.out.println(comF.compare(1, 10));
    }

    /**
     * 类::实例方法名
     * 参数列表种的第一参数是实例方法的调用这,而第二参数是实例方法的参数时,可以使用
     * */
    public static void test2(){
        BiPredicate<String,String> bp =String::equals;
    }

    /**
     * 对象::实例方法名
     */
    public static void test3(){
        PrintStream ps= System.out;
        Consumer<String> con=ps::println;
        con.accept("hello word");
        Employee emp=new Employee();
        Supplier<String> sup=() -> emp.getName();
        String str = sup.get();
        System.out.println(str);
        Supplier<Integer> sup2= emp::getAge;
        System.out.println(sup2.get());
    }

    public static void main(String[] args) {
        test1();
    }
}
