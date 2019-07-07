/**
 * Copyright (C), 2018-2018, 深圳市莫思餐飲有限公司
 * FileName: TestLambda2
 * Author:   IT002
 * Date:     2018/8/31 14:22
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.learn.java8;

import java.util.Comparator;
import java.util.function.Consumer;

/**
 * Lambda 表达式的基础语法: Java 8中引入了一个新的操作符 "->" 该操作符为箭头操作符或 Lambda操作符
 * "->" 箭头操作符 将lambda 表达式拆分为两成部分:
 *    左侧为:lambda表达式的参数列表
 *    右侧为:表达式中所需执行的功能,即Lambda体
 *一 基础语法
 * 语法格式一: 无参数，无返回值
 *            () -> System.out.println("Hello word!");
 * 语法格式二: 有一个参数,无返回值
 *            (x) -> System.out.println(x);
 *
 * 语法格式三: 若有一个参数,小括号可以不写
 *            x -> System.out.println(x);
 *
 * 语法格式四: 有两个以上的参数,有返回值,并且Lambda 体中有多条语句
 *             Comparator<Integer> con= (x,y) -> {
 *             System.out.println("函数式接口");
 *             return Integer.compare(x,y);
 *            };
 * 语法格式五:有两个以上参数,有返回值,且Lambda 体只有一条语句（return 跟大括号可以忽略不写）
 *            Comparator<Integer> con= (x,y) -> Integer.compare(x,y);
 *
 * 语法格式六:Lambda 表达式的参数列表的数据类型可以忽略不屑,因为JVM编译器通过上下文推断出,数据类型,即"类型推断"
 *              Comparator<Integer> con= (Integer x,Integer y) -> Integer.compare(x,y);
 *              Comparator<Integer> con= (x,y) -> Integer.compare(x,y); //如同上一句效果一样,根据 Comparator<Integer>推断出
 *
 * 二 Lambda 表达式需要函数式接口支持
 *    函数式接口：接口中只有一个抽象方法的接口,称之为函数式接口.
 *    可以使用注解@FunctionalInterface,来声明下函数式接口
 * 函数式接口
 * @author IT002
 * @create 2018/8/31
 * @since 1.0.0
 */
public class TestLambda2 {

    public static void main(String[] args) {
        test1();
        test2();
        test4();
    }
    public static  void test1(){
        //jdk 1.7之前内部类使用
        Runnable r=new Runnable() {
            final int i=0; //jdk1.7 内部类要调用同级别的内部变量，此变量必须为final声明
            @Override
            public void run() { //无参数无返回值方法
                System.out.println("Hello word!"+i);
            }
        };
        r.run();
        System.out.println("=====================无参数，无返回值========================");
        //jdk 1.8 lambda表达式调用内部类无参数无返回值方法
        Runnable r1= () -> System.out.println("Hello Lambda !");
        r1.run();

    }
    public static void test2(){
        System.out.println("===================== 有一个参数,无返回值========================");
        Consumer<String> con= (x) -> System.out.println(x);
        con.accept("我是完美哥哥");
    }
    public static void test3(){
        System.out.println("===================== 有两个以上的参数,有返回值,并且Lambda 体中有多条语句========================");
        Comparator<Integer> con= (x,y) -> {
            System.out.println("函数式接口");
            return Integer.compare(x,y);
        };
    }

    public static void test4(){
        System.out.println("===================== 有两个以上的参数,有返回值,并且Lambda 体中有多条语句========================");
        Comparator<Integer> con= (x,y) ->  Integer.compare(x,y);
        System.out.println(con.compare(10,11));

    }


}
