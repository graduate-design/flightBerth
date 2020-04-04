package com.njtech.flightBerth.controller;

import com.njtech.flightBerth.entity.User;
import com.njtech.flightBerth.service.GlobalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

/**
 * Author:helloboy
 * Date:2020-04-02 16:52
 * Description:<描述>
 */

@Controller("globalController")
public class GlobalController {
    @Autowired
    private GlobalService globalService;
    @RequestMapping("/to_login")
    public String toLogin(){
        return "login";
    }
    @RequestMapping("login")
    public String login(HttpSession session, @RequestParam String usercode, @RequestParam String password){
        User user = globalService.login(usercode,password);
        if (user == null){
            return "redirect:to_login";
        }
        session.setAttribute("user",user);
        return "redirect:self";
    }

    @RequestMapping("/self")
    public String self(){
        return "self";
    }
    @RequestMapping("/quit")
    public String quit(HttpSession session){
        session.setAttribute("user",null);
        return "redirect:to_login";
    }
    @RequestMapping("/to_change_password")
    public String toChangePassword(){
        return "change_password";
    }
    @RequestMapping("/change_password")
    public String changePassword(HttpSession session, @RequestParam String old, @RequestParam String new1, @RequestParam String new2){
        User user = (User) session.getAttribute("user");
        if (user.getPassword().equals(old)){
            if (new1.equals(new2)){
                user.setPassword(new1);
                globalService.changePassword(user);
                return "redirect:self";
            }
        }
        return "redirect:to_change_password";
    }


}
