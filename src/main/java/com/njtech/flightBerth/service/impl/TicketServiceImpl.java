package com.njtech.flightBerth.service.impl;

import com.njtech.flightBerth.dao.TicketDao;
import com.njtech.flightBerth.entity.Ticket;
import com.njtech.flightBerth.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Author:helloboy
 * Date:2020-04-02 9:29
 * Description:<描述>
 */
@Service
@Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
public class TicketServiceImpl implements TicketService{
    @Autowired
    private TicketDao ticketDao;

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public List<Ticket> findAll(){
        return ticketDao.selectAll();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public Ticket findByTicCode(String ticketCode){
        return ticketDao.selectByTicCode(ticketCode);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public List<Ticket> findByIdentity(String identity){
        return ticketDao.selectByIdentity(identity);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int addTicket(Ticket ticket){
        return ticketDao.insertTicket(ticket);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int modifyTicket(Ticket ticket){
        return ticketDao.updateTicket(ticket);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int removeTicket(Ticket ticket){
        return ticketDao.deleteTicket(ticket);
    }
}
