package com.njtech.flightBerth.dao;

import com.njtech.flightBerth.entity.User;
import org.apache.ibatis.annotations.Param;

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
     List<User> selectAll();

    /**
     * 根绝身份信息查找用户
     * @param identity
     * @return
     */
     User selectByIdentity(String identity);

    /**
     * 根据姓名查找用户
     * @param name
     * @return
     */
     List<User> selectByName(String name);

    /**
     * 根据用户编码查找用户
     * @param userCode
     * @return
     */
     User selectByUserCode(String userCode);

    /**
     * 根据手机号查找用户
     * @param phone
     * @return
     */
     List<User> selectByPhone(int phone);

    /**
     * 插入用户
     * @param user
     * @return
     */
     int insertUser(User user);

    /**
     * 删除用户
     * @param user
     * @return
     */
     int deleteUser(User user);

    /**
     * 更新用户
     * @param user
     * @return
     */
     int updateUser(User user);


        //注册
        public int regist(User user);
        //登录
        public User login(@Param("username") String username, @Param("password") String password);


}
