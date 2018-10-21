package com.lgj.dao;

import com.lgj.entity.Route;
import java.util.List;

public interface RouteMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table route
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String routeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table route
     *
     * @mbg.generated
     */
    int insert(Route record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table route
     *
     * @mbg.generated
     */
    Route selectByPrimaryKey(String routeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table route
     *
     * @mbg.generated
     */
    List<Route> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table route
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Route record);
}