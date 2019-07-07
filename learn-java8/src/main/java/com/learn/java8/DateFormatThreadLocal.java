/**
 * Copyright (C), 2018-2018, 深圳市莫思餐飲有限公司
 * FileName: DateFormatThreadLocal
 * Author:   IT002
 * Date:     2018/9/12 11:31
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.learn.java8;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author IT002
 * @create 2018/9/12
 * @since 1.0.0
 */
public class DateFormatThreadLocal {
    private static final ThreadLocal<DateFormat> df=new ThreadLocal<DateFormat>(){
        protected DateFormat initialValue(){
            return new SimpleDateFormat("yyyyMMdd");
        }
    };
    public static Date convert(String source) throws ParseException {
        return df.get().parse(source);
    }
}
