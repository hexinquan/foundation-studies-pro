/**
 * Copyright (C), 2018-2018, 深圳市莫思餐飲有限公司
 * FileName: TestSteamApi3
 * Author:   IT002
 * Date:     2018/9/10 19:19
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.learn.java8;

import com.learn.java8.entity.Employee;

import java.util.*;
import java.util.stream.Collectors;

/**【终止操作】
 * 归约reduce
 * 收集 collect
 *
 * 1. reduce(T odentoty,BinaryOperator)/ reduce (BinaryOperator) --可以将流中元素反复结合起来,得到一个值.
 * 2. collect --将流转换为其它形式。接受一个Conllector 接口的实现,用于给Stream 中元素的做汇总的方法
 */
public class TestStreamApi3 {

    static List<Employee> employees=Arrays.asList(
            new Employee("张三",18,10000.00,Employee.Status.BUSY),
          /*  new Employee("李四",38,15000.00,Employee.Status.PREE),
            new Employee("李四",38,18000.00,Employee.Status.PREE),
            new Employee("李四",38,19000.00,Employee.Status.PREE),
            new Employee("李四",38,20000.00,Employee.Status.PREE),*/
            new Employee("李四",38,20000.00,Employee.Status.PREE),
            new Employee("王五",50,25000.00,Employee.Status.VOCATION),
            new Employee("赵六",16,30000.00,Employee.Status.BUSY),
            new Employee("田七",10,40000.00,Employee.Status.PREE),
            new Employee("田七",10,10000.00,Employee.Status.VOCATION),
            new Employee("田七",10,20000.00,Employee.Status.BUSY)
    );

    public static void main(String[] args) {
        //test1Reduce();
       // test1Collect();
       // testCollect(); //收集1
       // testCollectGroup(); //收集分组
      //  testCollectGroups(); //收集多层分组
      //  testCollectorespartitioningBy();//分区
      //  collectSummarizing();
        collectJoinStr();
    }
    //reduce(T odentoty,BinaryOperator)/ reduce (BinaryOperator) --可以将流中元素反复结合起来,得到一个值.
    public static void test1Reduce(){
        List<Integer> list =Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        //起始值为0,第一次循环取出元素0则为X,取出1则为y,相加等于1,第二次循环则把1当作X,取出2,相加等于3,第三次循环则把3当作X，取出3为y,相加等于6,以此类推
        Integer sum = list.stream().reduce(0,(x,y)-> x+y);
        System.out.println(sum);
        Optional<Double> sumSalary= employees.stream().map(Employee::getSalary).reduce(Double::sum);
        System.out.println(sumSalary.get());
    }
    //collect --将流转换为其它形式。接受一个Conllector 接口的实现,用于给Stream 中元素的做汇总的方法
    public static void test1Collect(){
        System.out.println("--------------------------------------------------toList()");
        List<String> names=employees.stream().map(Employee::getName).collect(Collectors.toList());
        names.forEach(System.out::println);
        System.out.println("--------------------------------------------------toSet()");
        Set<String> nameSets=employees.stream().map(Employee::getName).collect(Collectors.toSet());
        nameSets.forEach(System.out::println);
        System.out.println("--------------------------------------------------toCollection()");
        HashSet<String> hashSets=employees.stream().map(Employee::getName).collect(Collectors.toCollection(HashSet::new));
        hashSets.forEach(System.out::println);
    }
    //运算
    public  static  void testCollect(){
        //总数
        Long count=employees.stream().collect(Collectors.counting());
        System.out.println(count);
        //平均值
        Double avg= employees.stream().collect(Collectors.averagingDouble(Employee::getSalary));
        System.out.println(avg);
        //总和
        Double sum=employees.stream().collect(Collectors.summingDouble(Employee::getSalary));
        System.out.println(sum);
        //最大值
        Optional<Employee> max=employees.stream().collect(Collectors.maxBy((e1,e2)-> Double.compare(e1.getSalary(),e2.getSalary())));
        System.out.println(max.get());
        //最小值
        Optional<Double> min=employees.stream().map(Employee::getSalary).collect(Collectors.minBy(Double::compare));
        System.out.println(min.get());

    }
    //1.Collectors.groupingBy分组，按照状态分组
    public static void testCollectGroup(){
        Map<Employee.Status,List<Employee>> groupList=
        employees.stream().collect(Collectors.groupingBy(Employee::getStatus));
        System.out.println(groupList);
    }
    //2.Collectors.groupingBy分组，多条件分组-- 先按照状态分，再按年龄分
    public  static  void testCollectGroups(){
        //现按状态分的返回Map<状态,Map<"青年,中年,老年,",List<Emplyee>>
     Map<Employee.Status,Map<String,List<Employee>>> map=   employees.stream().collect(Collectors.groupingBy(Employee::getStatus,Collectors.groupingBy((e)->{
            if(((Employee)e).getAge()<=35){
                return "青年";
        }else if(((Employee)e).getAge()<=50){
                return "中年";
            }
           else {
                return "老年";
            }
        })));
    }
    //3 分区
    public static void testCollectorespartitioningBy(){
        //返回工资大于15000的false的一组，true的一组
        Map<Boolean,List<Employee>> map =employees.stream().collect(Collectors.partitioningBy((e)-> e.getSalary()>15000.00));
        System.out.println(map);
    }
    //DoubleSummaryStatistics
    public static void collectSummarizing(){
        DoubleSummaryStatistics dss= employees.stream().collect(Collectors.summarizingDouble((Employee::getSalary)));
        System.out.println(dss.getAverage());//获取平均值
        System.out.println(dss.getCount());//总数
        System.out.println(dss.getSum());//总和
        System.out.println(dss.getMax());//最大
        System.out.println(dss.getMin());//最小
    }
    //4. 连接字符串
    public static void collectJoinStr(){
        //joining(delimiter, prefix, suffix)
        String str= employees.stream().map(Employee::getName).collect(Collectors.joining(",","===","==="));
        System.out.println(str);
    }
}
