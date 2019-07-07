/**
 * Copyright (C), 2018-2018, 深圳市莫思餐飲有限公司
 * FileName: TestStreamApi
 * Author:   IT002
 * Date:     2018/9/5 16:14
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.learn.java8;

import com.learn.java8.entity.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Stream
 *
 * 1. 创建Stream
 *      创建Stream 四种方式:
 *      1.1  List<String> list=new ArrayList<>();  //1. 可以通过Conllection 系列集合提供的stream()  或者 parallelStream
 *           Stream<String> stream= list.stream();
 *      1.2  Stream<Employee> streamArrays= Arrays.stream(emps);   //2.通过Arrays 中的静态方法 stream()  获取数组流
 *      1.3  Stream<String> streamOf= Stream.of("aa","bb","cc");   //3.通过Stream 类中的静态方法 of ()
 *      1.4  Stream<Integer> streamIterate=Stream.iterate(0,(x) -> x+2); //4. 创建无限流
 * 2. 中间操作
 *     2.1筛选与切片
 *          filter -- 接收Lambda,从流中排除某些元素。
 *          limit--截断流，使其元素不超过指定数量
 *          skip(n) --跳过元素,返回一个扔掉了前N个元素的流。若流中元素不足n个,则返回一个空流。与LIMIT(n)互补
 *          distinct--筛选,通过流所生成元素的hashcode和equals 去除重复元素
 *     2.2映射
 *          map--接受lambda,将元素转换成其它形式或提取信息。接收一个函数作为参数,该函数会被应用到每个元素上,并将其映射成一个新的元素。
 *          flatMap--接收一个函数作为参数,将流中的每一个值都转换成另一个流,然后把所以流连接成一个流(类似与List的allList)
 *     3.1排序
 *
 * 3. 终止操作
 *        max
 *        min
 *        allMatch
 *        anyMatch
 *        noneMatch
 *        sorted
 *        forEach
 * @author IT002
 * @create 2018/9/5
 * @since 1.0.0
 */
public class TestStreamApi1 {
    static List<Employee> employees=Arrays.asList(
            new Employee("张三",18,9999.99),
            new Employee("李四",38,5555.99),
            new Employee("王五",50,6666.66),
            new Employee("赵六",16,3333.33),
            new Employee("田七",10,7777.77),
            new Employee("田七",10,7777.77),
            new Employee("田七",10,7777.77)
    );

    public static void main(String[] args) {
        testFilter();
        /*
        testLimit();
        testSkip();
        distinct();*/
        //testMap();
       // testflatMap();
    }

    //创建Stream 四种方式【创建stream】
    public static void createStream(){
        //1. 可以通过Conllection 系列集合提供的stream()  或者 parallelStream
        List<String> list=new ArrayList<>();
        Stream<String> stream= list.stream();
        //2.通过Arrays 中的静态方法 stream()  获取数组流
        Employee[] emps=new Employee[10];
        Stream<Employee> streamArrays= Arrays.stream(emps);
        //3.通过Stream 类中的静态方法 of ()
        Stream<String> streamOf= Stream.of("aa","bb","cc");
        //4. 创建无限流
        Stream<Integer> streamIterate=Stream.iterate(0,(x) -> x+2);
        streamIterate.limit(10).forEach(System.out::println);
        //生成
        System.out.println();
    }
    //【中间操作】
    //1.filter -- 接收Lambda,从流中排除某些元素。
    public static void  testFilter(){
        System.out.println("======================================testFilter");
        //中间操作:不会执行任何操作
        Stream<Employee> stream=employees.stream().filter((e)-> e.getAge() >35);
        //终止操作:一次性执行全部内容,即是"惰性求值"
        stream.forEach(System.out::println); //内部迭代
    }
    //2.limit操作
    public  static  void testLimit(){
        System.out.println("======================================testLimit");
        employees.stream().filter((e) -> {
                                System.out.println("短路!");
                                return e.getSalary()>5000;
                            })
                          .limit(2).forEach(System.out::println);
    }
    //3.skip 跳过元素,返回一个扔掉了前N个元素的流。若流中元素不足n个,则返回一个空流。与LIMIT(n)互补
    public  static  void testSkip(){
        System.out.println("======================================testSkip");
        employees.stream().filter((e) -> {
            System.out.println("短路!");
            return e.getSalary()>5000;
        }).skip(2).forEach(System.out::println);
    }
    //4.distinct--筛选,通过流所生成元素的hashcode和equals 去除重复元素
    public  static  void distinct(){
        System.out.println("======================================distinct");
        employees.stream().filter((e) -> {
            System.out.println("短路!");
            return e.getSalary()>5000;
        }).skip(2).distinct()
                ;
    }

    //map:接受lambda,将元素转换成其它形式或提取信息。接收一个函数作为参数,该函数会被应用到每个元素上,并将其映射成一个新的元素。
    public  static void testMap(){
        //利用map 循环转换成大写
        List<String> list =Arrays.asList("aaa","bbb","ccc","ddd","eee");
        list.stream().map((str) -> {
            //System.out.println(str);
            return  str.toUpperCase();
        })
        .forEach(System.out::println);
        //提取数组里面的每个name
        System.out.println("-----------------------------------------");
        employees.stream().map(Employee::getName).forEach(System.out::println);

    }
    //faltMap:接收一个函数作为参数,将流中的每一个值都转换成另一个流,然后把所以流连接成一个流
    public  static void testflatMap(){
        //利用map 循环转换成大写
        List<String> list =Arrays.asList("aaa","bbb","ccc","ddd","eee");
        Stream<Stream<Character>> chStream =list.stream().map(TestStreamApi1::filterCharacter);
        chStream.forEach((sm)->{
            sm.forEach(System.out::println);
        });
    }


    //stored 排序
    public  static void testflatStored(){
       employees.stream().sorted((s1,s2) ->{
           if (s1.getAge()==s2.getAge()){
               return s1.getName().compareTo(s2.getName());
           }
           else{
               return s1.getName().compareTo(s2.getName());
           }
       });
    }



    //就是一个简单的将一个字符转换成
    public static Stream<Character> filterCharacter(String str){
        List<Character> list = new ArrayList<>();
        for (Character ch:str.toCharArray()){
            list.add(ch);
        }
        return  list.stream();
    }
}
