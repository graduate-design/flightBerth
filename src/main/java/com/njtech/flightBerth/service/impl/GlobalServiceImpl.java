package com.njtech.flightBerth.service.impl;

import com.njtech.flightBerth.dao.UserDao;
import com.njtech.flightBerth.entity.User;
import com.njtech.flightBerth.service.GlobalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Author:helloboy
 * Date:2020-04-04 18:01
 * Description:<描述>
 */

@Service("globalBiz")
public class GlobalServiceImpl implements GlobalService {
    @Autowired
    private UserDao userDao;
    public User login(String usercode, String password) {
        User user = userDao.selectByUserCode(usercode);
        if(user!=null&&user.getPassword().equals(password)){
            return  user;
        }
        return null;
    }

    public void changePassword(User user) {
        userDao.updateUser(user);
    }
}
