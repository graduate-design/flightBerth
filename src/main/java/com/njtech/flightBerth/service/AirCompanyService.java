package com.njtech.flightBerth.service;

import com.njtech.flightBerth.entity.AirCompany;

import java.util.List;

/**
 * Author:helloboy
 * Date:2020-03-29 17:33
 * Description:<描述>
 */
public interface AirCompanyService {
    /**
     * 查询所有
     * @return
     */
    public List<AirCompany> findAll();

    /**
     * 根据航空公司编码查询
     * @param AirCompnayCode
     * @return
     */
    public AirCompany findByAirCompanyCode(String AirCompnayCode);

    /**
     * 根据航空公司名称查询
     * @param AirCompanyName
     * @return
     */
    public AirCompany findByAirCompanyName(String AirCompanyName);

    /**
     * 插入航空公司
     * @param airCompany
     * @return
     */
    public int addAirCompany(AirCompany airCompany);

    /**
     * 修改航空公司
     * @param airCompany
     * @return
     */
    public int modifyAirCompany(AirCompany airCompany);

    /**
     * 根据航空公司编码删除
     * @param airCompany
     * @return
     */
    public int removeAirCompanyByAirCompanyCode(AirCompany airCompany);

    /**
     * 根据航空公司名称删除
     * @param airCompany
     * @return
     */
    public int removeAirCompanyByAirCompanyName(AirCompany airCompany);
}
