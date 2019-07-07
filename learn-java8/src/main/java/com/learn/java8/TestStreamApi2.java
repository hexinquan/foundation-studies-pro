/**
 * Copyright (C), 2018-2018, 深圳市莫思餐飲有限公司
 * FileName: TestStreamApi2
 * Author:   IT002
 * Date:     2018/9/10 18:35
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.learn.java8;

import com.learn.java8.entity.Employee;
import com.learn.java8.entity.SchemaField;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * 【终止操作】查找与匹配
 * allMatch--检查是否匹配所有元素 (接收一个断言行接口)
 * anyMatch--检查是否至少一个匹配一个元素 (接收一个断言行接口)
 * none-Match--检查是否没有匹配所有元素 (接收一个断言行接口)
 * findFirst--返回第一个元素
 * findAny--返回当前流中任意一个元素
 * count--返回流中元素得总个数
 * max--返回流中最大值元素
 * min--返回流中最小值元素
 *
 * @author IT002
 * @create 2018/9/10
 * @since 1.0.0
 */
public class TestStreamApi2 {
    static List<Employee> employees = Arrays.asList(
            new Employee("张三", 18, 9999.99, Employee.Status.BUSY),
            new Employee("李四", 38, 5555.99, Employee.Status.PREE),
            new Employee("李四", 38, 5555.99, Employee.Status.PREE),
            new Employee("李四", 38, 5555.99, Employee.Status.PREE),
            new Employee("李四", 38, 5555.99, Employee.Status.PREE),
            new Employee("李四", 38, 5555.99, Employee.Status.PREE),
            new Employee("王五", 50, 6666.66, Employee.Status.VOCATION),
            new Employee("赵六", 16, 3333.33, Employee.Status.BUSY),
            new Employee("田七", 10, 7777.77, Employee.Status.PREE),
            new Employee("田七", 10, 7777.77, Employee.Status.VOCATION),
            new Employee("田七", 10, 7777.77, Employee.Status.BUSY)
    );

    public static void main(String[] args) {
        test2();
    }


    public static void test2() {

        //流中的所有元素个数
        Long count = employees.stream().count();
        System.out.println(count);

        Optional<Employee> op1 = employees.stream().max((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));
        System.out.println(op1.get());

        Optional<Double> op2 = employees.stream().map(Employee::getSalary).max(Double::compareTo);
        System.out.println(op2.get());
    }

    /**
     * 所有匹配型方法
     */
    public static void test1() {
        //判断里面的元素状态属性是不是所有元素都等于BUSY
        boolean b1 = employees.stream().allMatch((e) -> e.getStatus().equals(Employee.Status.BUSY));
        System.out.println(b1);
        //判断里面的元素属性status是不是至少有匹配到为BUSY的
        boolean b2 = employees.stream().anyMatch((e) -> e.getStatus().equals(Employee.Status.BUSY));
        System.out.println(b2);
        //判断里面元素是不是status没有
        boolean b3 = employees.stream().noneMatch((e) -> e.getStatus().equals(Employee.Status.BUSY));
        System.out.println(b3);

        //根据工资排序，默认desc排序
        Optional<Employee> op = employees.stream().sorted((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary())).findFirst();
        System.out.println(op.get());

        //查找状态属性为PREE的任意其中一个(stream串行流,parallelStream并行流)
        Optional<Employee> OP2 = employees.parallelStream().filter((e) -> e.getStatus().equals(Employee.Status.PREE)).findAny();
        System.out.println(OP2.get());
    }


    public static void test3(boolean isVal) {

        List<SchemaField> schemaFields=new ArrayList<>();
        schemaFields.add(new SchemaField(1L,"name",2L,"字段名称为name","STRING","Y"));
        schemaFields.add(new SchemaField(1L,"age",2L,"字段名称为age","INTEGER","Y"));
        schemaFields.add(new SchemaField(1L,"salary",2L,"字段名称为salary","DOUBLE","Y"));

        List<Map<String, String>> employeesList = new ArrayList<>();

        Map<String, String> map = new HashMap<>();
        map.put("name", "name");
        map.put("value","test1");
        map.put("schema_id", "2");
        map.put("type", "STRING");
        map.put("object_key", "12345678901234567890123456789022");
        map.put("from_key", "schema_de/schema_er");
        map.put("to_key", "scheam_er/schema_de");

        Map<String, String> map2 = new HashMap<>();
        map2.put("name", "age");
        map2.put("value","26");
        map2.put("schema_id", "2");
        map2.put("type", "INTEGER");
        map2.put("object_key", "12345678901234567890123456789022");
        map2.put("from_key", "schema_de/schema_er");
        map2.put("to_key", "scheam_er/schema_de");

        Map<String, String> map3 = new HashMap<>();
        map3.put("name", "salary");
        map3.put("value","5000.00");
        map3.put("schema_id", "2");
        map3.put("type", "DOUBLE");
        map3.put("object_key", "12345678901234567890123456789022");
        employeesList.add(map);
        employeesList.add(map2);
        employeesList.add(map3);

        //判断传入的map合集里面的每个map是否包含object_key(不管是实体还是关系都包含object_key)
        //boolean isHasObjKey= datas.stream().allMatch((e)-> e.containsKey(Keys.OBJECT_KEY));

//        schemaFields.stream().anyMatch( e -> employeesList.stream().anyMatch(y->{
//                //如果当前字段存在map 并且此字段是必须的
//                if(!y.containsKey(e.getName()) && !e.getRequired().equals("Y")){
//
//                }
//
//        }));





    }
}
