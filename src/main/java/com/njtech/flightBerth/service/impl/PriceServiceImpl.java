package com.njtech.flightBerth.service.impl;

import com.njtech.flightBerth.dao.PriceDao;
import com.njtech.flightBerth.entity.Flight;
import com.njtech.flightBerth.entity.Price;
import com.njtech.flightBerth.entity.User;
import com.njtech.flightBerth.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Author:helloboy
 * Date:2020-04-02 9:45
 * Description:<描述>
 */
@Service
@Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
public class PriceServiceImpl implements PriceService{
    @Autowired
    private PriceDao priceDao;

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public List<Price> findAll(){
        return priceDao.selectAll();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public List<Price> findByFlight(Flight flight){
        return priceDao.selectByFlight(flight);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public Price findByPriceCode(String priceCode){
        return priceDao.selectByPriceCode(priceCode);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public List<Price> findByUserAndFlight(User user,Flight flight){
        return priceDao.selectByUserAndFlight(user,flight);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public List<Price> findByFlightAndDelflag(Flight flight,boolean delFlag){
        return priceDao.selectByFlightAndDelflag(flight,delFlag);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int addPrice(Price price){
        return priceDao.insertPrice(price);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int modifyPrice(Price price){
        return priceDao.updatePrice(price);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int removePrice(Price price){
        return priceDao.deletePrice(price);
    }
}
