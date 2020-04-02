package com.njtech.flightBerth.service.impl;

import com.njtech.flightBerth.dao.UserDao;
import com.njtech.flightBerth.entity.User;
import com.njtech.flightBerth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Author:helloboy
 * Date:2020-04-02 8:50
 * Description:<描述>
 */
@Service
@Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public List<User> findAll(){
        return userDao.selectAll();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public User findByIdentity(String identity){
        return userDao.selectByIdentity( identity);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public List<User> findByName(String name){
        return userDao.selectByName(name);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public User findByUserCode(String userCode){
        return userDao.selectByUserCode(userCode);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public List<User> findByPhone(int phone)
    {
        return userDao.selectByPhone(phone);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int addUser(User user){
        return userDao.insertUser(user);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int modifyUser(User user){
        return userDao.updateUser(user);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int removeUser(User user){
        return userDao.deleteUser(user);
    }
}
