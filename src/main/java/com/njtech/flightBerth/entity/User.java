package com.njtech.flightBerth.entity;

import java.io.Serializable;

/**
 * Author:helloboy
 * Date:2020-03-16 20:47
 * Description:<描述>
 */
public class User implements Serializable{
    //ID
    private int id;
    //用户编码
    private String userCode;
    //姓名
    private String name;
    //密码
    private String password;
    //邮箱
    private String email;
    //性别
    private String sex;
    //年龄
    private int age;
    //联系电话
    private int phoneNum;
    //身份信息
    private String identity;
    //权限等级
    private Authority authority;
    //备注
    private String remark;
    //构造函数


    public User(int age, Authority authority, String email, int id, String identity, String name, String password, int phoneNum, String remark, String sex, String usercode) {
        this.age = age;
        this.authority = authority;
        this.email = email;
        this.id = id;
        this.identity = identity;
        this.name = name;
        this.password = password;
        this.phoneNum = phoneNum;
        this.remark = remark;
        this.sex = sex;
        this.userCode = usercode;
    }

    public User() {

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Authority getAuthority() {
        return authority;
    }

    public void setAuthority(Authority authority) {
        this.authority = authority;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String usercode) {
        this.userCode = usercode;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", id=" + id +
                ", usercode=" + userCode +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", phoneNum=" + phoneNum +
                ", identity=" + identity +
                ", authority=" + authority +
                ", remark='" + remark + '\'' +
                '}';
    }

}
