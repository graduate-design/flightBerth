package com.njtech.flightBerth.dao;

import com.njtech.flightBerth.entity.Flight;

import java.util.List;

/**
 * Author:helloboy
 * Date:2020-03-19 19:13
 * Description:<描述>
 */

public interface FlightDao {
    /**
     * 查询所有航班信息
     * @return
     */
    public List<Flight> selectAll();

    /**
     * 根据航班信息编码查询航班信息
     * @param flightCode
     * @return
     */
    public Flight selectByFlightCode(int flightCode);

    /**
     * 更新航班信息
     * @param flight
     * @return
     */
    public int updateFlight(Flight flight);

    /**
     * 删除航班信息
     * @param flightCode
     * @return
     */
    public int deleteFlight(int flightCode);

}
