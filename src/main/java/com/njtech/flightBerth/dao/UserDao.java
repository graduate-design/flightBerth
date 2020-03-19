package com.njtech.flightBerth.dao;

import com.njtech.flightBerth.entity.User;

import java.util.List;

/**
 * Author:helloboy
 * Date:2020-03-19 13:28
 * Description:<描述>
 */
public interface UserDao {
    /**
     * 查找所有用户
     *
     * @return List<User>
     */
    public List<User> selectAll();

    /**
     * 根绝身份信息查找用户
     * @param identity
     * @return
     */
    public User selectByIdentity(int identity);

    /**
     * 根据姓名查找用户
     * @param name
     * @return
     */
    public List<User> selectByName(String name);

    /**
     * 根据用户编码查找用户
     * @param userCode
     * @return
     */
    public User selectByUserCode(int userCode);

    /**
     * 根据手机号查找用户
     * @param phone
     * @return
     */
    public List<User> selectByPhone(int phone);

    /**
     * 插入用户
     * @param user
     * @return
     */
    public int insertUser(User user);

    /**
     * 删除用户
     * @param user
     * @return
     */
    public int deleteUser(User user);

    /**
     * 更新用户
     * @param user
     * @return
     */
    public int updateUser(User user);

}
