/**
 * Copyright (C), 2018-2018, 深圳市莫思餐飲有限公司
 * FileName: TestSimpleDateFormat
 * Author:   IT002
 * Date:     2018/9/12 11:17
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.learn.java8;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author IT002
 * @create 2018/9/12
 * @since 1.0.0
 */
public class TestSimpleDateFormat {
    public static void main(String[] args) throws Exception{
        //以前老的
       /* ExecutorService pool = Executors.newFixedThreadPool(10);
        Callable<Date> task= new Callable<Date>() {
            @Override
            public Date call() throws Exception {
                return DateFormatThreadLocal.convert("20161218");
            }
        };
        List<Future<Date>> results= new ArrayList<>();
        for (int i=0;i<10;i++){
            results.add(pool.submit(task));
        }
        for (Future<Date> future:results){
            System.out.println(future.get());
        }
        pool.shutdown();*/
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd");
        Callable<LocalDate> task= new Callable<LocalDate>() {
            @Override
            public LocalDate call() throws Exception {
                return LocalDate.parse("20161218",dtf);

            }
        };
        ExecutorService pool=Executors.newFixedThreadPool(10);
        List<Future<LocalDate>> results = new ArrayList<>();
        for (int i=0;i<10;i++){
            results.add(pool.submit(task));
        }
        for (Future<LocalDate> future:results){
            System.out.println(future.get());
        }
        pool.shutdown();
    }
}
