package com.njtech.flightBerth.entity;

/**
 * Author:helloboy
 * Date:2020-03-17 21:39
 * Description:<描述>
 */
public class AirCompany {
    //id
    private int id;
    //航空公司编码
    private int airCompanyCode;
    //航空公司名称
    private String airCompanyName;

    public AirCompany(int airCompanyCode, String airCompanyName, int id) {
        this.airCompanyCode = airCompanyCode;
        this.airCompanyName = airCompanyName;
        this.id = id;
    }

    public int getAirCompanyCode() {
        return airCompanyCode;
    }

    public void setAirCompanyCode(int airCompanyCode) {
        this.airCompanyCode = airCompanyCode;
    }

    public String getAirCompanyName() {
        return airCompanyName;
    }

    public void setAirCompanyName(String airCompanyName) {
        this.airCompanyName = airCompanyName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "AirCompany{" +
                "airCompanyCode=" + airCompanyCode +
                ", id=" + id +
                ", airCompanyName='" + airCompanyName + '\'' +
                '}';
    }
}
