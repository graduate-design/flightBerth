package com.njtech.flightBerth.service.impl;

import com.njtech.flightBerth.dao.FlightDao;
import com.njtech.flightBerth.entity.Flight;
import com.njtech.flightBerth.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Author:helloboy
 * Date:2020-04-02 9:57
 * Description:<描述>
 */
@Service
@Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
public class FlightServiceImpl implements FlightService{
    @Autowired
    private FlightDao flightDao;

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public List<Flight> findAll(){
        return flightDao.selectAll();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public Flight findByFlightCode(String flightCode){
        return flightDao.selectByFlightCode(flightCode);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int addFlight(Flight flight){
        return flightDao.insertFlight(flight);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int modifyFlight(Flight flight){
        return  flightDao.updateFlight(flight);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int removeFlight(Flight flight){
        return flightDao.deleteFlight(flight);
    }
}
