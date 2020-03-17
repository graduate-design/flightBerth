package com.njtech.flightBerth.entity;

/**
 * Author:helloboy
 * Date:2020-03-17 21:36
 * Description:<描述>
 */
public class Authority {
    //权限等级编码
    private int authorityCode;
    //权限等级名称
    private String authorityName;

    public Authority(int authorityCode, String authorityName) {
        this.authorityCode = authorityCode;
        this.authorityName = authorityName;
    }

    public int getAuthorityCode() {
        return authorityCode;
    }

    public void setAuthorityCode(int authorityCode) {
        this.authorityCode = authorityCode;
    }

    public String getAuthorityName() {
        return authorityName;
    }

    public void setAuthorityName(String authorityName) {
        this.authorityName = authorityName;
    }

    @Override
    public String toString() {
        return "Authority{" +
                "authorityCode=" + authorityCode +
                ", authorityName='" + authorityName + '\'' +
                '}';
    }
}
