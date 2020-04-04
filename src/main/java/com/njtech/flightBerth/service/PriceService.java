package com.njtech.flightBerth.service;

import com.njtech.flightBerth.entity.Flight;
import com.njtech.flightBerth.entity.Price;
import com.njtech.flightBerth.entity.User;

import java.util.List;

/**
 * Author:helloboy
 * Date:2020-03-29 16:41
 * Description:<描述>
 */
public interface PriceService {
    /**
     * 查询所有出价
     * @return
     */
    public List<Price> findAll();



    /**
     * 根据航班查询出价
     * @param flight
     * @return
     */
    public List<Price> findByFlight(Flight flight);

    /**
     * 根据出价编码查询出价
     * @param priceCode
     * @return
     */
    public Price findByPriceCode(String priceCode);

    /**
     * 根据用户和航班信息查询
     * @param user
     * @param flight
     * @return
     */
    public List<Price> findByUserAndFlight(User user,Flight flight);

    /**
     * 根据航班信息和是否删除查询
     * @param flight
     * @param delFlag
     * @return
     */
    public List<Price> findByFlightAndDelflag(Flight flight,boolean delFlag);

    /**
     * 添加出价
     * @param price
     * @return
     */
    public int addPrice(Price price);

    /**
     * 修改出价
     * @param price
     * @return
     */
    public int modifyPrice(Price price);

    /**
     * 删除出价
     * @param price
     * @return
     */
    public int removePrice(Price price);
}
