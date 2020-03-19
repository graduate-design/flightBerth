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
    public List<Berth> selectAll();

    /**
     * 根据舱位编码查询舱位信息
     * @param berthCode
     * @return
     */
    public Berth selectByBerthCode(int berthCode);

    /**
     * 根据舱位名称查询舱位信息
     * @param berthName
     * @return
     */
    public Berth selectByBerthName(String berthName);

    /**
     * 更新舱位信息
     * @param berth
     * @return
     */
    public int updateBerth(Berth berth);

    /**
     * 根据舱位编码删除舱位信息
     * @param berthCode
     * @return
     */
    public int deleteBerth(int berthCode);

    /**
     * 根据舱位名称删除舱位信息
     * @param berthName
     * @return
     */
    public int deleteBerth(String berthName);

}
