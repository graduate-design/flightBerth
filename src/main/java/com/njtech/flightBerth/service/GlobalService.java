package com.njtech.flightBerth.service;

/**
 * Author:helloboy
 * Date:2020-04-04 18:02
 * Description:<描述>
 */



        import com.njtech.flightBerth.entity.User;


public interface GlobalService {
    User login(String userCode, String password);
    void changePassword(User user);
}
