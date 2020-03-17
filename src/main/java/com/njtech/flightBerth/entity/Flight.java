package com.njtech.flightBerth.entity;

/**
 * Author:helloboy
 * Date:2020-03-17 21:45
 * Description:<描述>
 */
public class Flight {
    //id
    private int id;
    //航班信息编码
    private int flightCode;
    //航空公司名称
    private String airCompanyName;
    //航班号
    private int flightNum;
    //起飞日期
    private String flightDate;
    //商务舱空位
    private int redundantBusinessClass;
    //头等舱空位
    private int redundantFirstClass;

    public Flight(String airCompanyName, int flightCode, String flightDate, int flightNum, int id, int redundantBusinessClass, int redundantFirstClass) {
        this.airCompanyName = airCompanyName;
        this.flightCode = flightCode;
        this.flightDate = flightDate;
        this.flightNum = flightNum;
        this.id = id;
        this.redundantBusinessClass = redundantBusinessClass;
        this.redundantFirstClass = redundantFirstClass;
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

    public String getAirCompanyName() {
        return airCompanyName;
    }

    public void setAirCompanyName(String airCompanyName) {
        this.airCompanyName = airCompanyName;
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

    public int getRedundantBusinessClass() {
        return redundantBusinessClass;
    }

    public void setRedundantBusinessClass(int redundantBusinessClass) {
        this.redundantBusinessClass = redundantBusinessClass;
    }

    public int getRedundantFirstClass() {
        return redundantFirstClass;
    }

    public void setRedundantFirstClass(int redundantFirstClass) {
        this.redundantFirstClass = redundantFirstClass;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "airCompanyName='" + airCompanyName + '\'' +
                ", id=" + id +
                ", flightCode=" + flightCode +
                ", flightNum=" + flightNum +
                ", flightDate='" + flightDate + '\'' +
                ", redundantBusinessClass=" + redundantBusinessClass +
                ", redundantFirstClass=" + redundantFirstClass +
                '}';
    }
}
