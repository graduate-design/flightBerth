package com.njtech.flightBerth.dao;

import com.njtech.flightBerth.entity.AirCompany;

import java.util.List;

/**
 * Author:helloboy
 * Date:2020-03-19 19:42
 * Description:<描述>
 */
public interface AirCompanyDao {
    /**
     * 查询所有航空公司信息
     * @return
     */
    List<AirCompany> selectAll();

    /**
     * 根据航空公司编码查询航空公司信息
     * @param AirCompanyCode
     * @return
     */
    AirCompany selectByAirCompanyCode(String AirCompanyCode);

    /**
     * 根据航空公司名称查询航空公司信息
     * @param AirCompanyName
     * @return
     */
    AirCompany selectByAirCompanyName(String AirCompanyName);

    /**
     * 插入航空公司信息
     * @param airCompany
     * @return
     */
    int insertAirCompany(AirCompany airCompany);

    /**
     * 更新航空公司信息
     * @param airCompany
     * @return
     */
    int updateAirCompany(AirCompany airCompany);

    /**
     * 根据航空公司编码删除航空公司信息
     * @param airCompany
     * @return
     */
    int deleteByAirCompanyCode(AirCompany airCompany);

    /**
     * 根据航空公司名称删除航空公司信息
     * @param airCompany
     * @return
     */
    int delteByAirCompanyName(AirCompany airCompany);
}
