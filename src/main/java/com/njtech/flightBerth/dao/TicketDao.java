package com.njtech.flightBerth.dao;

import com.njtech.flightBerth.entity.Ticket;

import java.util.List;

/**
 * Author:helloboy
 * Date:2020-03-19 14:04
 * Description:<描述>
 */
public interface TicketDao {
    /**
     * 查找所用机票信息
     * @return
     */
    public List<Ticket> selectAll();

    /**
     * 根据身份信息查找所有历史机票
     * @param identity
     * @return
     */
    public List<Ticket> selectByIdentity(int identity);

    /**
     * 根据航班号与起飞日期查找机票信息
     * @param flightNum
     * @param flightDate
     * @return
     */
    public Ticket selectByFlightNumAndFlightDate(int flightNum,String flightDate);
}
