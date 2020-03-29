package com.njtech.flightBerth.service;

import com.njtech.flightBerth.entity.Flight;

import java.util.List;

/**
 * Author:helloboy
 * Date:2020-03-29 16:49
 * Description:<描述>
 */
public interface FlightService {
    /**
     * 查询所有航班信息
     * @return
     */
    public List<Flight> findAll();

    /**
     * 根据航班信息编码查询
     * @param flightCode
     * @return
     */
    public Flight findByFlightCode(String flightCode);

    /**
     * 修改航班信息
     * @param flight
     * @return
     */
    public int modifyFlight(Flight flight);

    /**
     * 插入航班信息
     * @param flight
     * @return
     */
    public int addFlight(Flight flight);

    /**
     * 删除航班信息
     * @param flight
     * @return
     */
    public int removeFlight(Flight flight);
}
