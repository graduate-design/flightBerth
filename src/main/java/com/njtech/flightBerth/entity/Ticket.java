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
    //乘客身份信息、姓名(使用user对象)
    private User user;
    //购票方式 1为非折扣购票 0为折扣购票
    private int buyWay;
    //航空公司id(使用aircompany对象)
    private AirCompany airCompany;
    //航班号
    private int flightNum;
    //起飞地
    private String start;
    //目的地
    private String destination;
    //起飞日期
    private String flightDate;
    //舱位等级ID（使用berth对象）
    private Berth berth;
    //登机口
    private String gateNum;
    //座位号
    private String seatNum;
    //备注
    private String remark;

    public Ticket(AirCompany airCompany, Berth berth, int buyWay, String destination, String flightDate, int flightNum, String gateNum, int id,User user, String remark, String seatNum, String start) {
        this.airCompany = airCompany;
        this.berth = berth;
        this.buyWay = buyWay;
        this.destination = destination;
        this.flightDate = flightDate;
        this.flightNum = flightNum;
        this.gateNum = gateNum;
        this.id = id;
        this.user = user;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getBuyWay() {
        return buyWay;
    }

    public void setBuyWay(int buyWay) {
        this.buyWay = buyWay;
    }

    public AirCompany getAirCompany() {
        return airCompany;
    }

    public void setAirCompany(AirCompany airCompany) {
        this.airCompany =airCompany;
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

    public Berth getBerth() {
        return berth;
    }

    public void setBerthCode(Berth berth) {
        this.berth = berth;
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
                "airCompany=" + airCompany +
                ", id=" + id +
                ", user=" + user +
                ", buyWay=" + buyWay +
                ", flightNum=" + flightNum +
                ", start='" + start + '\'' +
                ", destination='" + destination + '\'' +
                ", flightDate='" + flightDate + '\'' +
                ", berth=" + berth +
                ", gateNum='" + gateNum + '\'' +
                ", seatNum='" + seatNum + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}