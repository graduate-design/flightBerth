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
    public List<AirCompany> selectAll();

    /**
     * 根据航空公司编码查询航空公司信息
     * @param AirCompanyCode
     * @return
     */
    public AirCompany selectByAirCompanyCode(int AirCompanyCode);

    /**
     * 根据航空公司名称查询航空公司信息
     * @param AirCompanyName
     * @return
     */
    public AirCompany selectByAirCompanyName(String AirCompanyName);

    /**
     * 插入航空公司信息
     * @param airCompany
     * @return
     */
    public int insertAirCompany(AirCompany airCompany);

    /**
     * 更新航空公司信息
     * @param airCompany
     * @return
     */
    public int updateAirCompany(AirCompany airCompany);

    /**
     * 根据航空公司编码删除航空公司信息
     * @param airCompanyCode
     * @return
     */
    public int deleteByAirCompanyCode(int airCompanyCode);

    /**
     * 根据航空公司名称删除航空公司信息
     * @param airCompanyName
     * @return
     */
    public int delteByAirCompanyName(String airCompanyName);
}
