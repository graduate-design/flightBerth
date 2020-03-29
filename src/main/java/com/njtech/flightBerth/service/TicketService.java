package com.njtech.flightBerth.service;

import com.njtech.flightBerth.entity.Ticket;

import java.util.List;

/**
 * Author:helloboy
 * Date:2020-03-29 16:28
 * Description:<描述>
 */
public interface TicketService {
    /**
     * 查询所有机票
     * @return
     */
    public List<Ticket> findAll();

    /**
     * 根据机票编码查询
     * @param ticCode
     * @return
     */
    public Ticket findByTicCode(String ticCode);

    /**
     * 根据身份信息查询
     * @param identity
     * @return
     */
    public List<Ticket> findByIdentity(String identity);

    /**
     * 插入机票
     * @param ticket
     * @return
     */
    public int addTicket(Ticket ticket);

    /**
     * 修改机票
     * @param ticket
     * @return
     */
    public int modifyTicket(Ticket ticket);

    /**
     * 删除机票
     * @param ticket
     * @return
     */
    public int removeTicket(Ticket ticket);
}
