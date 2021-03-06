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
     List<Flight> selectAll();

    /**
     * 根据航班信息编码查询航班信息
     * @param flightCode
     * @return
     */
     Flight selectByFlightCode(String flightCode);

    /**
     * 更新航班信息
     * @param flight
     * @return
     */
     int updateFlight(Flight flight);

    /**
     *
     * @param flight
     * @return
     */
     int insertFlight(Flight flight);

    /**
     * 删除航班信息
     * @param flight
     * @return
     */
     int deleteFlight(Flight flight);

}
