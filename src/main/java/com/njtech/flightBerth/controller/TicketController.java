package com.njtech.flightBerth.controller;

import com.njtech.flightBerth.entity.Ticket;
import com.njtech.flightBerth.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Author:helloboy
 * Date:2020-04-02 16:56
 * Description:<描述>
 */


@Controller("ticketController")
@RequestMapping("/ticket")
public class TicketController {
    @Autowired
    private TicketService ticketService;
    @RequestMapping("/list")
    public String list(Map<String,Object> map){
        map.put("list",ticketService.findAll());
        return "ticket_list";
    }
    @RequestMapping("/to_add")
    public String toAdd(Ticket ticket,Map<String,Object> map){
        map.put("ticket",ticket);
        return "ticket_add";
    }
    @RequestMapping("/add")
    public String add(Ticket ticket){
        ticketService.addTicket(ticket);
        //int值输出结果语句
        return "redirect:list";
    }
    @RequestMapping(value = "/to_update",params = "ticCode")
    public String toUpdate(String ticCode,Map<String,Object> map){
        map.put("ticket",ticketService.findByTicCode(ticCode));
        return "ticket_update";
    }
    @RequestMapping("/update")
    public String update(Ticket ticket){
        ticketService.modifyTicket(ticket);
        return "redirect:list";
    }
    @RequestMapping(value = "/remove",params = "ticCode")
    public String remove(String ticCode,Ticket ticket){
        ticket.setTicCode(ticCode);
        ticketService.removeTicket(ticket);
        return "redirect:list";
    }

}

