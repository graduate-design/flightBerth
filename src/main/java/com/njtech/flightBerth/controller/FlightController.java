package com.njtech.flightBerth.controller;

import com.njtech.flightBerth.entity.Flight;
import com.njtech.flightBerth.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Author:helloboy
 * Date:2020-04-04 17:47
 * Description:<描述>
 */


@Controller("flightController")
@RequestMapping("/flight")
public class FlightController {
    @Autowired
    private FlightService flightService;
    @RequestMapping("/list")
    public String list(Map<String,Object> map){
        map.put("list",flightService.findAll());
        return "flight_list";
    }
    @RequestMapping("/to_add")
    public String toAdd(Flight flight,Map<String,Object> map){
        map.put("flight",flight);
        return "flight_add";
    }
    @RequestMapping("/add")
    public String add(Flight flight){
        flightService.addFlight(flight);
        //int值输出结果语句
        return "redirect:list";
    }
    @RequestMapping(value = "/to_update",params = "flightcode")
    public String toUpdate(String flightcode,Map<String,Object> map){
        map.put("flight",flightService.findByFlightCode(flightcode));
        return "flight_update";
    }
    @RequestMapping("/update")
    public String update(Flight flight){
        flightService.modifyFlight(flight);
        return "redirect:list";
    }
    @RequestMapping(value = "/remove",params = "flightcode")
    public String remove(String flightcode,Flight flight){
        flight.setFlightCode(flightcode);
        flightService.removeFlight(flight);
        return "redirect:list";
    }

}

