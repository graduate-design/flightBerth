package com.njtech.flightBerth.service;

import com.njtech.flightBerth.entity.User;

import java.util.List;

/**
 * Author:helloboy
 * Date:2020-03-29 16:20
 * Description:<描述>
 */
public interface UserService {
    /**
     * 查找所有用户
     * @return
     */
    public List<User> findAll();

    /**
     * 根据身份信息查询
     * @param identity
     * @return
     */
    public User findByIdentity(String identity);

    /**
     * 根据姓名查询
     * @param name
     * @return
     */
    public List<User> findByName(String name);

    /**
     * 根据用户编码查询
     * @param userCode
     * @return
     */
    public User findByUserCode(String userCode);

    /**
     * 根据手机号查询
     * @param phone
     * @return
     */
    public List<User> findByPhone(int phone);

    /**
     * 添加用户
     * @param user
     * @return
     */
    public int addUser(User user);

    /**
     * 删除用户
     * @param user
     * @return
     */
    public int removeUser(User user);

    /**
     * 修改用户
     * @param user
     * @return
     */
    public int modifyUser(User user);


        public int regist(User user);

        public User login(String username,String password);

}
