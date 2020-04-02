package com.njtech.flightBerth.service.impl;

import com.njtech.flightBerth.dao.AirCompanyDao;
import com.njtech.flightBerth.entity.AirCompany;
import com.njtech.flightBerth.service.AirCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Author:helloboy
 * Date:2020-04-02 10:53
 * Description:<描述>
 */
@Service
@Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
public class AirCompanyServiceImpl implements AirCompanyService{
    @Autowired
    private AirCompanyDao airCompanyDao;

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public List<AirCompany> findAll(){
        return airCompanyDao.selectAll();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public AirCompany findByAirCompanyCode(String AirCompnayCode){
        return airCompanyDao.selectByAirCompanyCode(AirCompnayCode);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public AirCompany findByAirCompanyName(String AirCompanyName){
        return airCompanyDao.selectByAirCompanyName(AirCompanyName);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int addAirCompany(AirCompany airCompany){
        return airCompanyDao.insertAirCompany(airCompany);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int modifyAirCompany(AirCompany airCompany){
        return airCompanyDao.updateAirCompany(airCompany);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int removeAirCompanyByAirCompanyCode(AirCompany airCompany){
        return airCompanyDao.deleteByAirCompanyCode(airCompany);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int removeAirCompanyByAirCompanyName(AirCompany airCompany){
        return airCompanyDao.deleteByAirCompanyName(airCompany);
    }
}
