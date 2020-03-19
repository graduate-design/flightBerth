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
    private int usercode;
    //姓名
    private String name;
    //性别
    private String sex;
    //年龄
    private int age;
    //联系电话
    private int phoneNum;
    //身份信息
    private int identity;
    //权限等级代码
    private Authority authority;
    //备注
    private String remark;
    //构造函数

    public User(int age, Authority authority, int id, int identity, String name, int phoneNum, String remark, String sex, int usercode) {
        this.age = age;
        this.authority = authority;
        this.id = id;
        this.identity = identity;
        this.name = name;
        this.phoneNum = phoneNum;
        this.remark = remark;
        this.sex = sex;
        this.usercode = usercode;
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

    public int getIdentity() {
        return identity;
    }

    public void setIdentity(int identity) {
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

    public int getUsercode() {
        return usercode;
    }

    public void setUsercode(int usercode) {
        this.usercode = usercode;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", id=" + id +
                ", usercode=" + usercode +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", phoneNum=" + phoneNum +
                ", identity=" + identity +
                ", authority=" + authority +
                ", remark='" + remark + '\'' +
                '}';
    }
}
