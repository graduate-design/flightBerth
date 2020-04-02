package com.njtech.flightBerth.service.impl;

import com.njtech.flightBerth.dao.BerthDao;
import com.njtech.flightBerth.entity.Berth;
import com.njtech.flightBerth.service.BerthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Author:helloboy
 * Date:2020-04-02 10:34
 * Description:<描述>
 */
@Service
@Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
public class BerthServiceImpl implements BerthService{
    @Autowired
    private BerthDao berthDao;

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public List<Berth> findAll(){
        return berthDao.selectAll();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public Berth findByBerthCode(String berthCode){
        return berthDao.selectByBerthCode(berthCode);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public Berth findByBerthName(String berthName){
        return berthDao.selectByBerthName(berthName);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int addBerth(Berth berth){
        return berthDao.insertBerth(berth);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int modifyBerth(Berth berth){
        return berthDao.updateBerth(berth);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int removeBerthByBerthCode(Berth berth){
        return berthDao.deleteBerthByBerthCode(berth);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int removeBerthByBerthName(Berth berth){
        return berthDao.deleteBerthByBerthName(berth);
    }
}
