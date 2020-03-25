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
    private String flightCode;
    //航空公司名称
    private AirCompany airCompany;
    //航班号
    private int flightNum;
    //起飞日期
    private String flightDate;
    //商务舱空位
    private int redundantBusinessClass;
    //头等舱空位
    private int redundantFirstClass;

    public Flight(AirCompany airCompany, String flightCode, String flightDate, int flightNum, int id, int redundantBusinessClass, int redundantFirstClass) {
        this.airCompany = airCompany;
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

    public String getFlightCode() {
        return flightCode;
    }

    public void setFlightCode(String flightCode) {
        this.flightCode = flightCode;
    }

    public AirCompany getAirCompany() {
        return airCompany;
    }

    public void setAirCompany(AirCompany airCompany) {
        this.airCompany = airCompany;
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
                "airCompany=" + airCompany +
                ", id=" + id +
                ", flightCode='" + flightCode + '\'' +
                ", flightNum=" + flightNum +
                ", flightDate='" + flightDate + '\'' +
                ", redundantBusinessClass=" + redundantBusinessClass +
                ", redundantFirstClass=" + redundantFirstClass +
                '}';
    }
}
