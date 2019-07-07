/**
 * Copyright (C), 2018-2018, 深圳市莫思餐飲有限公司
 * FileName: TestLambda3
 * Author:   IT002
 * Date:     2018/8/31 18:45
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.learn.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Java 8 内置的四大核心函数式接口
 * Consumer<T> :消费型接口
 *          void accept(T t)
 * Supplier<T> : 供给型接口
 *          T get();
 * Function<T,R> :函数型接口
 *          R apply(T t)
 *Predicate<T> :断言型接口
 *          boolean test(T t);
 * @author IT002
 * @create 2018/8/31
 * @since 1.0.0
 */
public class TestLambda3 {

    public static void main(String[] args) {
        test1();
    }


    public static void test1(){
        happy(100,m -> System.out.println("消费了:"+m+"元"));
        List<Integer> list=getNumList(5, () ->  (int)(Math.random() * 100));
        for (Integer num:list
             ) {
            System.out.println(num);
        }

        String result=setHandler("  你好!函数型接口 ",(str) -> str.trim());
        System.out.println(result);

        List<String> paramList = Arrays.asList("ok","no","good","lambda","hello","word");
        List preList=filterStr(paramList,(s) -> s.length()>3);
        System.out.println(preList.toString());
    }

    //断言型接口
    public static List<String> filterStr(List<String> list, Predicate<String> pre){
        List<String> listResult=new ArrayList<>();
        for (String str:list
             ) {
            if(pre.test(str)){
                listResult.add(str);
            }
        }
        return listResult;
    }

    //Consumer 消费型接口:
    public static void happy(double money, Consumer<Double> con){
        con.accept(money);
    }
    //Function 函数型接口
    public static String setHandler(String str, Function<String,String> fun){
        return fun.apply(str);
    }

    //Sopplier 供给型接口
    //需求:产生指定个数的整数,并放入集合中
    public static List<Integer> getNumList(int num, Supplier<Integer> sup){
        List<Integer> list= new ArrayList<>();
        for (int i = 0; i < num; i++) {
            Integer n= sup.get();
            list.add(n);
        }
        return list;
    }
}
