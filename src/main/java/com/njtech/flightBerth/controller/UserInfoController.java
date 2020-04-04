package com.njtech.flightBerth.controller;

import com.njtech.flightBerth.entity.Authority;
import com.njtech.flightBerth.entity.User;
import com.njtech.flightBerth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Author:helloboy
 * Date:2020-04-02 16:53
 * Description:<描述>
 */

@Controller("userInfoController")
@RequestMapping("/userInfo")
public class UserInfoController {

    @Autowired
    private UserService userService;
    @RequestMapping("/list")
    public String list(Map<String,Object> map){
        map.put("list",userService.findAll());
        return "userInfo_list";
    }
    @RequestMapping("/to_add")
    public String toAdd(Map<String,Object> map,int age, Authority authority, String email, int id, String identity, String name, String password, int phoneNum, String remark, String sex, String usercode){
        map.put("user",new User(age,authority,email, id, identity, name, password, phoneNum, remark,  sex, usercode));
        return "userInfo_add";
    }
    @RequestMapping("/add")
    public String add(User user){
        userService.addUser(user);
        return "redirect:list";
    }
    @RequestMapping(value = "/to_update",params = "usercode")
    public String toUpdate(String usercode,Map<String,Object> map){
        map.put("userInfo",userService.findByUserCode(usercode));
        return "userInfo_update";
    }
    @RequestMapping("/update")
    public String update(User user){
        userService.modifyUser(user);
        return "redirect:list";
    }
    @RequestMapping(value = "/remove",params = "usercode")
    public String remove(String usercode,User user){
        user.setUserCode(usercode);
        userService.removeUser(user);
        return "redirect:list";
    }
}
