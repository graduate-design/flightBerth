package com.njtech.flightBerth.entity;

import java.io.Serializable;

/**
 * Author:helloboy
 * Date:2020-03-16 21:04
 * Description:<描述>
 */
public class Ticket implements Serializable {
    //id
    private int id;
    //乘客身份信息
    private int identity;
    //乘客姓名
    private String name;
    //购票方式 1为非折扣购票 0为折扣购票
    private int buyWay;
    //航空公司id
    private int airComId;
    //航班号
    private int flightNum;
    //起飞地
    private String start;
    //目的地
    private String destination;
    //起飞日期
    private String flightDate;
    //舱位等级ID
    private int berthCode;
    //登机口
    private String gateNum;
    //座位号
    private String seatNum;
    //备注
    private String remark;

    public Ticket(int airComId, int berthCode, int buyWay, String destination, String flightDate, int flightNum, String gateNum, int id, int identity, String name, String remark, String seatNum, String start) {
        this.airComId = airComId;
        this.berthCode = berthCode;
        this.buyWay = buyWay;
        this.destination = destination;
        this.flightDate = flightDate;
        this.flightNum = flightNum;
        this.gateNum = gateNum;
        this.id = id;
        this.identity = identity;
        this.name = name;
        this.remark = remark;
        this.seatNum = seatNum;
        this.start = start;
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

    public int getBuyWay() {
        return buyWay;
    }

    public void setBuyWay(int buyWay) {
        this.buyWay = buyWay;
    }

    public int getAirComId() {
        return airComId;
    }

    public void setAirComId(int airComId) {
        this.airComId = airComId;
    }

    public int getFlightNum() {
        return flightNum;
    }

    public void setFlightNum(int flightNum) {
        this.flightNum = flightNum;
    }

    public String getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(String flightDate) {
        this.flightDate = flightDate;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getBerthCode() {
        return berthCode;
    }

    public void setBerthCode(int berthCode) {
        this.berthCode = berthCode;
    }

    public String getSeatNum() {
        return seatNum;
    }

    public void setSeatNum(String seatNum) {
        this.seatNum = seatNum;
    }

    public String getGateNum() {
        return gateNum;
    }

    public void setGateNum(String gateNum) {
        this.gateNum = gateNum;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "airComId=" + airComId +
                ", id=" + id +
                ", identity=" + identity +
                ", name='" + name + '\'' +
                ", buyWay=" + buyWay +
                ", flightNum=" + flightNum +
                ", start='" + start + '\'' +
                ", destination='" + destination + '\'' +
                ", flightDate=" + flightDate +
                ", berthCode=" + berthCode +
                ", gateNum='" + gateNum + '\'' +
                ", seatNum='" + seatNum + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
