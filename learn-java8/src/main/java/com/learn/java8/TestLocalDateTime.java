/**
 * Copyright (C), 2018-2018, 深圳市莫思餐飲有限公司
 * FileName: TestLocalDateTime
 * Author:   IT002
 * Date:     2018/9/12 14:15
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.learn.java8;

import java.time.LocalDateTime;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author IT002
 * @create 2018/9/12
 * @since 1.0.0
 */
public class TestLocalDateTime {
    public static void main(String[] args) {
        test1();
        test2();
    }
    //1.LocalDate LocalTime LocalDateTime 都有一样的时间操作
    public static void test1(){

        //当前时间
        LocalDateTime ldt= LocalDateTime.now();
        System.out.println(ldt);
        //生成指定日期
        LocalDateTime ldt2= LocalDateTime.of(2015,10,19,13,22,33);
        System.out.println(ldt2);
        LocalDateTime ldt3=ldt.plusYears(2);//当前时间加2年
        System.out.println(ldt3);
        LocalDateTime ldt4= ldt.minusMonths(2);//当前时间减去2个月

        System.out.println(ldt.getYear()); //年
        System.out.println(ldt.getMonthValue());//月
        System.out.println(ldt.getDayOfMonth()); //日
        System.out.println(ldt.getHour()); //时
        System.out.println(ldt.getMinute()); //分
        System.out.println(ldt.getSecond()); //秒
    }
    //Instant :时间戳(以Unix元年:1970年1月1日 00:00:00 到某个时间之间的毫秒值)
    public static void test2(){
        Instant ins1 =Instant.now(); //默认获取UTC时区
        System.out.println(ins1);
        OffsetDateTime odt=ins1.atOffset(ZoneOffset.ofHours(8)); //美国时间+8小时等于当前中国时区
        System.out.println(odt);
    }

    /**
     * 计算两个时间的相差值
     * 1.Duration :计算两个”时间“之间的间隔
     * 2.Period：计算两个"日期"之间的间隔
     * @throws Exception
     */
    public static void test3() throws Exception{
        //----------------------Duration-----------------------
        Instant ins1=Instant.now();
        Thread.sleep(1000);
        Instant ins2=Instant.now();
        Duration duration= Duration.between(ins1,ins2);
        System.out.println(duration.toMillis()); //相差毫秒
        System.out.println(duration.toMinutes());//相差分种

        LocalTime t1=LocalTime.now(); //LocalTime也可以用Duration
        Thread.sleep(1000);
        LocalTime t2 = LocalTime.now();
        Duration duration1=Duration.between(t1,t2);
        System.out.println(duration1.toMillis());
        //----------------------Duration--end---------------------

        //----------------------Period-----------------------
        LocalDate ld1=LocalDate.of(2015,1,2);
        LocalDate ld2=LocalDate.now();
        Period period =Period.between(ld1,ld2);
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());
        //----------------------Period------end-----------------
    }
    /**
     * 时间校正器
     * 1.接口:TemporalAdjuster
     * 2.工具类:TemporalAdjusters
     * Temporal
     */
    public static void test4(){
        LocalDateTime ldt =LocalDateTime.now();
        System.out.println(ldt);
        //把当前时间里面的天指定为某天
        LocalDateTime localDateTime=ldt.withDayOfMonth(10);
        System.out.println(localDateTime);

        LocalDateTime ldt3= ldt.with(TemporalAdjusters.next(DayOfWeek.SUNDAY)); //下一个星期日是几号
        System.out.println(ldt3);
        //自定义:下一个工作日
        LocalDateTime ldt5=ldt.with((l)->{
            LocalDateTime ldt4=(LocalDateTime)l;

            DayOfWeek dayOfWeek=ldt4.getDayOfWeek(); //当前是周几

            if(dayOfWeek.equals(DayOfWeek.FRIDAY)){ //如果是周五
                return ldt4.plusDays(3); //加3天
            }
            else if(dayOfWeek.equals(DayOfWeek.SATURDAY)){ //如果是周六
                return ldt4.plusDays(2); //加2天
            }else {
                return ldt4.plusDays(1); //否则加一天
            }
        });
        System.out.println("下一个工作日:"+ldt5);
    }

    /**
     *  DateTimeFormatter 时间/日期 格式化
     */
    public static void test5(){
        //DateTimeFormatter.ISO_DATE 指定格式化格式
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ISO_DATE;
        LocalDateTime ldt=LocalDateTime.now();
        String strDate=ldt.format(dateTimeFormatter);
        System.out.println(strDate);

        System.out.println("-------------------");
        DateTimeFormatter dateTimeFormatter1=DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        String strDate2= dateTimeFormatter1.format(ldt);
        System.out.println(strDate2);

        LocalDateTime newDate= ldt.parse(strDate2,dateTimeFormatter1); //字符变回时间
        System.out.println(newDate);
    }
    /**
     * ZoneDate, ZoneTime,ZoneDateTime 时区
     * */
    public  void test6(){
        LocalDateTime ldt=LocalDateTime.now(ZoneId.of(""));//查看支持多少个时区
        System.out.println(ldt);

        LocalDateTime ldt2=LocalDateTime.now(ZoneId.of("Asia/Shanghai"));
        ZonedDateTime zdt=ldt2.atZone(ZoneId.of("Asia/Shanghai"));
        System.out.println(zdt); //上海与默认UTF(美国)的时间差

    }
}
