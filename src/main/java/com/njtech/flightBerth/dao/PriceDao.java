package com.njtech.flightBerth.dao;

import com.njtech.flightBerth.entity.Flight;
import com.njtech.flightBerth.entity.Price;
import com.njtech.flightBerth.entity.User;

import java.util.List;

/**
 * Author:helloboy
 * Date:2020-03-19 15:00
 * Description:<描述>
 */
public interface PriceDao {
    /**
     * 查询所有出价信息
     * @return
     */
     List<Price> selectAll();

    /**
     * 根据航班信息查询出价（查询该次航班的所有出价）
     * @param flight
     * @return
     */
     List<Price> selectByFlight(Flight flight);

    /**
     * 根据出价号查询信息
     * @param priceCode
     * @return
     */
     PriceDao selectByPriceCode(String priceCode);

    /**
     * 根据用户与航班信息查询出价（查询该用户在一个航班的历史出价）
     * @param user
     * @param flight
     * @return
     */
     List<Price> selectByUserAndFlight(User user,Flight flight);

    /**
     * 查询现存的特定航班所有出价（通过@pram delFlag进行出价是否删除的筛选，如果出价未删除则为最新出价，因为每个用户只有一个未删除出价，所以这样查询得出的出价表可以进行排序进行竞价操作）
     * @param flight
     * @param delFlag
     * @return
     */
     List<Price> selectByFlightAndDelflag(Flight flight,boolean delFlag);

    /**
     * 插入出价信息
     * @param price
     * @return
     */
     int insertPrice(Price price);
    /**
     * 更新出价信息
     * @param price
     * @return
     */
     int updatePrice(Price price);

    /**
     * 删除出价信息
     * @param priceCode
     * @return
     */
     int deletePrice(String priceCode);

}
