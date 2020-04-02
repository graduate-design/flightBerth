package com.njtech.flightBerth.service.impl;

import com.njtech.flightBerth.dao.AuthorityDao;
import com.njtech.flightBerth.entity.Authority;
import com.njtech.flightBerth.service.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Author:helloboy
 * Date:2020-04-02 10:44
 * Description:<描述>
 */
@Service
@Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
public class AuthorityServiceImpl implements AuthorityService{
    @Autowired
    private AuthorityDao authorityDao;

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public List<Authority> findAll(){
        return authorityDao.selectAll();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public Authority findByAuthroityCode(String authorityCode){
        return authorityDao.selectByAuthorityCode(authorityCode);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int modifyAuthority(Authority authority){
        return authorityDao.updateAuthority(authority);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int addAuthority(Authority authority){
        return authorityDao.insertAuthority(authority);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int removeAuthorityByAuthorityCode(Authority authority){
        return authorityDao.deleteAuthorityByAuthorityCode(authority);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int removeAuthorityByAuthorityName(Authority authority){
        return authorityDao.deleteAuthorityByAuthorityName(authority);
    }
}
