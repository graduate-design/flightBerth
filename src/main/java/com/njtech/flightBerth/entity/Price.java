package com.njtech.flightBerth.entity;

import java.io.Serializable;

/**
 * Author:helloboy
 * Date:2020-03-16 21:20
 * Description:<描述>
 */
public class Price implements Serializable {
    //id
    private int id;
    //出价号
    private int priceCode;
    //出价价格
    private double price;
    //出价人ID
    private int usercode;
    //出价人姓名
    private String name;
    //航班信息id
    private int flightCode;
    //出价时间
    private String createTime;
    //备注
    private String remark;
    //是否删除
    private boolean delFlag;

    public Price(String createTime, boolean delFlag, int flightCode, int id, String name, double price, int priceCode, String remark, int usercode) {
        this.createTime = createTime;
        this.delFlag = delFlag;
        this.flightCode = flightCode;
        this.id = id;
        this.name = name;
        this.price = price;
        this.priceCode = priceCode;
        this.remark = remark;
        this.usercode = usercode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFlightCode() {
        return flightCode;
    }

    public void setFlightCode(int flightCode) {
        this.flightCode = flightCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPriceCode() {
        return priceCode;
    }

    public void setPriceCode(int priceCode) {
        this.priceCode = priceCode;
    }

    public int getUsercode() {
        return usercode;
    }

    public void setUsercode(int usercode) {
        this.usercode = usercode;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public boolean isDelFlag() {
        return delFlag;
    }

    public void setDelFlag(boolean delFlag) {
        this.delFlag = delFlag;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
