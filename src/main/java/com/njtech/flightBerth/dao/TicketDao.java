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
     * 查找所有机票信息
     * @return
     */
    public List<Ticket> selectAll();

    /**
     * 根据机票信息编码查找机票信息
     * @param ticCode
     * @return
     */
    public Ticket selectByTicCode(int ticCode);

    /**
     * 根据身份信息查找所有历史机票
     * @param identity
     * @return
     */
    public List<Ticket> selectByIdentity(int identity);

    /**
     * 插入机票信息
     * @param ticket
     * @return
     */
    public int insertTicket(Ticket ticket);

    /**
     * 更新机票信息
     * @param ticket
     * @return
     */
    public int updateTicket(Ticket ticket);

    /**
     * 根据机票信息编码删除机票信息
     * @param ticket
     * @return
     */
    public int deleteTicket(Ticket ticket);

}
