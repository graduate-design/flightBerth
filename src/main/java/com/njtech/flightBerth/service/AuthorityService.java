package com.njtech.flightBerth.service;

import com.njtech.flightBerth.entity.Authority;

import java.util.List;

/**
 * Author:helloboy
 * Date:2020-03-29 17:01
 * Description:<描述>
 */
public interface AuthorityService {
    /**
     * 查询所有
     * @return
     */
    public List<Authority> findAll();

    /**
     * 根据权限编码查询
     * @param authorityCode
     * @return
     */
    public Authority findByAuthroityCode(String authorityCode);

    /**
     * 根据权限修改
     * @param authority
     * @return
     */
    public int modifyAuthority(Authority authority);

    /**
     * 插入权限
     * @param authority
     * @return
     */
    public int addAuthority(Authority authority);

    /**
     * 根据权限编码删除
     * @param authority
     * @return
     */
    public int removeAuthorityByAuthorityCode(Authority authority);

    /**
     * 根据权限名称删除
     * @param authority
     * @return
     */
    public int removeAuthorityByAuthorityName(Authority authority);

}
