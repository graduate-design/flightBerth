package com.njtech.flightBerth.controller;

import com.njtech.flightBerth.entity.User;
import com.njtech.flightBerth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    public String toAdd(Map<String,Object> map,User user ){
        map.put("user",user);
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

    @RequestMapping("/regist")
    public String regist(
            @RequestParam(value = "username",required = false) String username,
            @RequestParam(value = "password",required = false) String password,
            @RequestParam(value = "repassword",required = false)String repassword,
            @RequestParam(value = "phone",required = false) int phone,
            Model model)
    {
        if (password.equals(repassword)) {
            User user = new User();
            user.setName(username);
            user.setPassword(password);
            user.setPhoneNum(phone);
            System.out.println(user);
            if (userService.regist(user) > 0) {
                model.addAttribute("msg", "注册成功");
                return "login";
            } else {
                model.addAttribute("msg", "注册失败");
                return "regist";
            }
        } else {
            model.addAttribute("msg", "密码不一致");
            return "regist";
        }
    }

    @RequestMapping("/login")
    public String loign(@RequestParam(value = "username",required = false) String username, @RequestParam(value = "password",required = false) String password, Model model){
        User user = userService.login(username,password);
        System.out.println(username);
        System.out.println(password);
        System.out.println("+++++++++++"+user);
        if (user != null){
            model.addAttribute("msg","登录成功");
            return "success";
        }else {
            model.addAttribute("msg","登录失败");
            return "login";
        }
    }
}

