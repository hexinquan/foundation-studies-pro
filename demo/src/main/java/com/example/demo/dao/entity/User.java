/**
 * Copyright (C), 2018-2018, 深圳市莫思餐飲有限公司
 * FileName: User
 * Author:   IT002
 * Date:     2018/8/21 16:29
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.demo.dao.entity;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author IT002
 * @create 2018/8/21
 * @since 1.0.0
 */
public class User {
    private String name;
    private String email;

    public User() {

    }

    User(String name) {

    }

    private User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("name='").append(name).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
