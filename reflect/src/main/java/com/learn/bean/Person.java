/**
 * Copyright (C), 2018-2018, 深圳市莫思餐飲有限公司
 * FileName: Person
 * Author:   IT002
 * Date:     2018/8/29 14:02
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.learn.bean;

import java.io.Serializable;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author IT002
 * @create 2018/8/29
 * @since 1.0.0
 */
public class Person implements Serializable {

    private String name;
    private Integer age;
    private Integer weight;
    private Integer bust;
    private Integer waistline;
    private Integer  hipline;
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Person(){

    }
    private Person(String name,String email){
        this.name =name;
        this.email =email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getBust() {
        return bust;
    }

    public void setBust(Integer bust) {
        this.bust = bust;
    }

    public Integer getWaistline() {
        return waistline;
    }

    public void setWaistline(Integer waistline) {
        this.waistline = waistline;
    }

    public Integer getHipline() {
        return hipline;
    }

    public void setHipline(Integer hipline) {
        this.hipline = hipline;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", weight=").append(weight);
        sb.append(", bust=").append(bust);
        sb.append(", waistline=").append(waistline);
        sb.append(", hipline=").append(hipline);
        sb.append('}');
        return sb.toString();
    }
}
