package com.njtech.flightBerth.dao;

import com.njtech.flightBerth.entity.Authority;

import java.util.List;

/**
 * Author:helloboy
 * Date:2020-03-19 19:37
 * Description:<描述>
 */
public interface AuthorityDao {
    /**
     * 查询所有权限
     * @return
     */
    List<Authority> selectAll();

    /**
     * 根据权限编码查询权限
     * @param authorityCode
     * @return
     */
    Authority selectByAuthorityCode(String authorityCode);

    /**
     * 更新权限
     * @param authority
     * @return
     */
     int updateAuthority(Authority authority);

    /**
     * 插入权限
     * @param authority
     * @return
     */
     int insertAuthority(Authority authority);

    /**
     * 根据权限编码删除权限
     * @param authority
     * @return
     */
     int deleteAuthorityByAuthorityCode(Authority authority);

    /**
     * 根据权限名称删除权限
     * @param authority
     * @return
     */
     int deleteAuthorityByAuthorityName(Authority authority);
}
