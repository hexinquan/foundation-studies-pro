/**
 * Copyright (C), 2018-2018, 深圳市莫思餐飲有限公司
 * FileName: ForkJoinCalulate
 * Author:   IT002
 * Date:     2018/9/11 17:11
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.learn.java8;

import java.util.concurrent.RecursiveTask;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author IT002
 * @create 2018/9/11
 * @since 1.0.0
 */
public class ForkJoinCalulate extends RecursiveTask<Long> {

    private static final long serialVersionUID = 13475679780L;

    private long start;
    private long end;

    private static final long THRESHOLD= 10000L;

    public ForkJoinCalulate(long start,long end){
        this.start = start;
        this.end =end;
    }

    @Override
    protected Long compute() {
        long length= end -start;
        if(length<=THRESHOLD){
            long sum=0;
            for (long i=start;i<=end;i++){
                sum=sum+i;
            }
            return sum;
        }else {
            long middle= (start+end)/2;
            ForkJoinCalulate left =new ForkJoinCalulate(start,middle);
            left.fork();
            ForkJoinCalulate right=new ForkJoinCalulate(middle+1,end);
            right.fork();
            return  left.join()+right.join();
        }
    }
}
