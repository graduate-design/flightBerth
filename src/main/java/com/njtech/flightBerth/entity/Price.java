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
    //出价人ID、identity(使用user对象)
    private User user;
    //航班信息id（使用flight对象）
    private Flight flight;
    //出价时间
    private String createTime;
    //备注
    private String remark;
    //是否删除
    private boolean delFlag;

    public Price(String createTime, boolean delFlag, Flight flight, int id, double price, int priceCode, String remark, User user) {
        this.createTime = createTime;
        this.delFlag = delFlag;
        this.flight = flight;
        this.id = id;
        this.price = price;
        this.priceCode = priceCode;
        this.remark = remark;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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

    @Override
    public String toString() {
        return "PriceDao{" +
                "createTime='" + createTime + '\'' +
                ", id=" + id +
                ", priceCode=" + priceCode +
                ", price=" + price +
                ", user=" + user +
                ", flight=" + flight +
                ", remark='" + remark + '\'' +
                ", delFlag=" + delFlag +
                '}';
    }
}
