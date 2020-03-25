package com.njtech.flightBerth.dao;

import com.njtech.flightBerth.entity.Berth;

import java.util.List;

/**
 * Author:helloboy
 * Date:2020-03-19 19:21
 * Description:<描述>
 */
public interface BerthDao {
    /**
     * 查询所有舱位等级
     * @return
     */
     List<Berth> selectAll();

    /**
     * 根据舱位编码查询舱位信息
     * @param berthCode
     * @return
     */
     Berth selectByBerthCode(String berthCode);

    /**
     * 根据舱位名称查询舱位信息
     * @param berthName
     * @return
     */
     Berth selectByBerthName(String berthName);

    /**
     * 更新舱位信息
     * @param berth
     * @return
     */
     int updateBerth(Berth berth);

    /**
     * 根据舱位编码删除舱位信息
     * @param berthCode
     * @return
     */
     int deleteBerthByBerthCode(String berthCode);

    /**
     * 根据舱位名称删除舱位信息
     * @param berth
     * @return
     */
     int deleteBerthByBerthName(Berth berth);

}
