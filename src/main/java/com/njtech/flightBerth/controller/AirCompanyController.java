package com.njtech.flightBerth.controller;

import com.njtech.flightBerth.entity.AirCompany;
import com.njtech.flightBerth.service.AirCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Map;
/**
 * Author:helloboy
 * Date:2020-04-02 16:54
 * Description:<描述>
 */


@Controller("airCompanyController")
@RequestMapping("/airCompany")
public class AirCompanyController {
    @Autowired
    private AirCompanyService airCompanyService;
    @RequestMapping("/list")
    public String list(Map<String,Object> map){
        map.put("list",airCompanyService.findAll());
        return "air_company_list";
    }
    @RequestMapping("/to_add")
    public String toAdd(String airCompanyCode, String airCompanyName, int id,Map<String,Object> map){
        map.put("aircompany",new AirCompany(airCompanyCode,airCompanyName,id));
        return "air_company_add";
    }
    @RequestMapping("/add")
    public String add(AirCompany airCompany){
       airCompanyService.addAirCompany(airCompany);
        //int值输出结果语句
        return "redirect:list";
    }
    @RequestMapping(value = "/to_update",params = "aircompanycode")
    public String toUpdate(String aircompanycode,Map<String,Object> map){
        map.put("aircompany",airCompanyService.findByAirCompanyCode(aircompanycode));
        return "air_company_update";
    }
    @RequestMapping("/update")
    public String update(AirCompany airCompany){
        airCompanyService.modifyAirCompany(airCompany);
        return "redirect:list";
    }
    @RequestMapping(value = "/remove",params = "aircompanycode")
    public String remove(String aircompanycode,AirCompany airCompany){
        airCompany.setAirCompanyCode(aircompanycode);
        airCompanyService.removeAirCompanyByAirCompanyCode(airCompany);
        return "redirect:list";
    }

}

