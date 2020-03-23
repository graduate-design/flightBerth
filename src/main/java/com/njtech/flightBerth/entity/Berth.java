package com.njtech.flightBerth.entity;

/**
 * Author:helloboy
 * Date:2020-03-17 21:43
 * Description:<描述>
 */
public class Berth {
    //id
    private int id;
    //舱位等级编码
    private String berthCode;
    //舱位等级名称
    private String berthName;

    public Berth(String berthCode, String berthName, int id) {
        this.berthCode = berthCode;
        this.berthName = berthName;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBerthCode() {
        return berthCode;
    }

    public void setBerthCode(String berthCode) {
        this.berthCode = berthCode;
    }

    public String getBerthName() {
        return berthName;
    }

    public void setBerthName(String berthName) {
        this.berthName = berthName;
    }

    @Override
    public String toString() {
        return "Berth{" +
                "berthCode=" + berthCode +
                ", id=" + id +
                ", berthName='" + berthName + '\'' +
                '}';
    }
}
