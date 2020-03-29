package com.njtech.flightBerth.service;

import com.njtech.flightBerth.entity.Berth;

import java.util.List;

/**
 * Author:helloboy
 * Date:2020-03-29 16:54
 * Description:<描述>
 */
public interface BerthService {
    /**
     * 查询所有
     * @return
     */
    public List<Berth> findAll();

    /**
     * 根据舱位编查询舱位
     * @param berthCode
     * @return
     */
    public Berth findByBerthCode(String berthCode);

    /**
     * 根据舱位名称查询
     * @param berthName
     * @return
     */
    public Berth findByBerthName(String berthName);

    /**
     * 修改舱位
     * @param berth
     * @return
     */
    public int modifyBerth(Berth berth);

    /**
     * 插入舱位
     * @param berth
     * @return
     */
    public int addBerth(Berth berth);

    /**
     * 根据舱位编码删除舱位
     * @param berth
     * @return
     */
    public int removeBerthByBerthCode(Berth berth);

    /**
     * 根据舱位名称删除舱位
     * @param berth
     * @return
     */
    public int removeBerthByBerthName(Berth berth);
}
