package com.learn.java8.service;


@FunctionalInterface
public interface LambdaGetValue<T> {
    String getVlaue(String str);
    boolean equals(Object obj);
    default void getValue(String str){

    }
    public static  String getValue(){
        return  null;
    }
}
