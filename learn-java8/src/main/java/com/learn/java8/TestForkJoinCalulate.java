/**
 * Copyright (C), 2018-2018, 深圳市莫思餐飲有限公司
 * FileName: TestForkJoinCalulate
 * Author:   IT002
 * Date:     2018/9/11 17:40
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.learn.java8;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.stream.LongStream;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author IT002
 * @create 2018/9/11
 * @since 1.0.0
 */
public class TestForkJoinCalulate {
    public static void main(String[] args) {
        //test1();
        //test2();
        test3();
    }
    public static void test1(){
        long start = System.currentTimeMillis();
        ForkJoinPool pool = new ForkJoinPool();
        ForkJoinTask<Long> task = new ForkJoinCalulate(0L, 10000000000L);
        long sum = pool.invoke(task);
        System.out.println(sum);
        long end = System.currentTimeMillis();
        System.out.println("耗费的时间为: " + (end - start)); //112-1953-1988-2654-2647-20663-113808
    }
    public static void test2(){
        long start = System.currentTimeMillis();
        long sum = 0L;
        for (long i = 0L; i <= 10000000000L; i++) {
            sum += i;
        }
        System.out.println(sum);
        long end = System.currentTimeMillis();
        System.out.println("耗费的时间为: " + (end - start)); //34-3174-3132-4227-4223-31583
    }
    public static void test3(){
        long start = System.currentTimeMillis();
        Long sum = LongStream.rangeClosed(0L, 10000000000L)
                .parallel()
                .sum();
        System.out.println(sum);
        long end = System.currentTimeMillis();
        System.out.println("耗费的时间为: " + (end - start)); //2061-2053-2086-18926
    }
    public static void test4(){
        long start = System.currentTimeMillis();
            LongStream.rangeClosed(0,100000000000L).parallel().reduce(0,Long::sum);
        long end = System.currentTimeMillis();
        System.out.println("耗费的时间为: " + (end - start));
    }
}
