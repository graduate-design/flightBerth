package com.njtech.flightBerth.controller;

import com.njtech.flightBerth.entity.Price;
import com.njtech.flightBerth.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Author:helloboy
 * Date:2020-04-04 19:08
 * Description:<描述>
 */


@Controller("priceController")
@RequestMapping("/price")
public class PriceController {
    @Autowired
    private PriceService priceService;
    @RequestMapping("/list")
    public String list(Map<String,Object> map){
        map.put("list",priceService.findAll());
        return "price_list";
    }
    @RequestMapping("/to_add")
    public String toAdd(Price price,Map<String,Object> map){
        map.put("price",price);
        return "price_add";
    }
    @RequestMapping("/add")
    public String add(Price price){
        priceService.addPrice(price);
        //int值输出结果语句
        return "redirect:list";
    }
    @RequestMapping(value = "/to_update",params = "pricecode")
    public String toUpdate(String pricecode,Map<String,Object> map){
        map.put("price",priceService.findByPriceCode(pricecode));
        return "price_update";
    }
    @RequestMapping("/update")
    public String update(Price price){
        priceService.modifyPrice(price);
        return "redirect:list";
    }
    @RequestMapping(value = "/remove",params = "pricecode")
    public String remove(String pricecode,Price price){
        price.setPriceCode(pricecode);
        priceService.removePrice(price);
        return "redirect:list";
    }

}

