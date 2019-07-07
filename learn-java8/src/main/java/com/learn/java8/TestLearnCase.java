/**
 * Copyright (C), 2018-2018, 深圳市莫思餐飲有限公司
 * FileName: TestLearnCase
 * Author:   IT002
 * Date:     2018/9/11 11:32
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.learn.java8;

import com.learn.java8.entity.Employee;
import com.learn.java8.entity.Trader;
import com.learn.java8.entity.Transaction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 〈〉
 *
 * @author IT002
 * @create 2018/9/11
 * @since 1.0.0
 */
public class TestLearnCase {

    static Trader raoul = new Trader("Raoul", "Cambridge");
    static Trader mario = new Trader("Mario", "Milan");
    static Trader alan = new Trader("Alan", "Cambridge");
    static Trader brian = new Trader("Brian", "Cambridge");

    static List<Transaction> transactions  = Arrays.asList(
            new Transaction(brian, 2011, 300),
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
    );

    public static void main(String[] args) {
       // test1();
        test2();
       // test3();
      //  test4();
    }
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
    /**
     * 练习题一
     * 给定一个数字列表,如何返回一个由每个数字的平方构成的的列表呢
     * 例如:传入【1，2，3，4，5】 返回 【1，4，6，9，25】
     *
     */
    public static void test1(){
        Integer[] nums =new Integer[]{1,2,3,4,5};
        List<Integer> numList=Arrays.stream(nums).map((e)-> e*e).collect(Collectors.toList());
        numList.forEach(System.out::println);
    }

    /**
     * 练习题二
     * 如何使用map与reduce方法数一数流中有多少个emplyee
     */
    public static void test2(){
       Optional<Integer> count= employees.stream().map((e)-> 1).reduce(Integer::sum);
        System.out.println(count.get());
        System.out.println("=======================================================");
        System.out.println("1. 找出2011年发生的所有交易， 并按交易额排序（从低到高）");
        Stream<Transaction> transactionStream=
                transactions.stream().filter((e)-> e.getYear()==2011)
                        .sorted((e1, e2)-> Integer.compare(e1.getValue(),e2.getValue()));
        transactionStream.forEach(System.out::println);

        System.out.println("=======================================================");
        System.out.println("2. 交易员都在哪些不同的城市工作过？");
        transactions.stream().map((e)-> e.getTrader().getCity()).distinct().forEach(System.out::println);

        System.out.println("=======================================================");
        System.out.println("3. 查找所有来自剑桥的交易员，并按姓名排序");
        transactions.stream().filter((e)-> e.getTrader().getCity().equals("Cambridge"))
                             .map(Transaction::getTrader)
                             .sorted((e1,e2)-> e1.getName().compareTo(e2.getName()))
                             .distinct().forEach(System.out::println);
        System.out.println("=======================================================");
        System.out.println("4. 返回所有交易员的姓名字符串，按字母顺序排序");
        transactions.stream().map((e)-> e.getTrader().getName()).sorted((e1,e2)-> e1.compareTo(e2)).distinct().forEach(System.out::println);
        String strName=transactions.stream().
                            map((e)-> e.getTrader().getName()).
                            distinct().
                            flatMap(TestLearnCase::filterStrToStream).
                            sorted((e1,e2)-> e1.compareToIgnoreCase(e2)).
                            collect(Collectors.joining(""));
        System.out.println(strName);
        System.out.println("=======================================================");
        System.out.println("5. 有没有交易员是在米兰工作的？");
        Boolean isMilan=transactions.stream().anyMatch((e)-> e.getTrader().getCity().equals("Milan"));
        System.out.println(isMilan);
        System.out.println("=======================================================");
        System.out.println("6. 打印生活在剑桥的交易员的所有交易额");
        Optional<Integer> op= transactions.stream().
                 filter((e)-> e.getTrader().getCity().equals("Cambridge"))
                 .map((e)-> e.getValue()).reduce(Integer::sum);
        System.out.println(op.get());

        System.out.println("=======================================================");
        System.out.println("7. 所有交易中，最高的交易额是多少");
        Optional<Integer> op2=transactions.stream().map((e)-> e.getValue()).max(Integer::compareTo);
        System.out.println(op2.get());

        System.out.println("=======================================================");
        System.out.println("8. 找到交易额最小的交易");
        Optional<Integer> op3= transactions.stream().map((e)-> e.getValue()).min(Integer::compareTo);
        System.out.println(op3.get());
    }


    //1. 找出2011年发生的所有交易， 并按交易额排序（从低到高）
    public static Stream<String> filterStrToStream(String str){
        List<String> strList=new ArrayList<>();
        for (Character ch:str.toCharArray()){
            strList.add(ch.toString());
        }
        return strList.stream();
    }
    //2. 交易员都在哪些不同的城市工作过？
    public static void test4(){

    }
    //3. 查找所有来自剑桥的交易员，并按姓名排序


}
