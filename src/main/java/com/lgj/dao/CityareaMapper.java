package com.lgj.dao;

import com.lgj.entity.Cityarea;
import java.util.List;

public interface CityareaMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cityarea
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String areaId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cityarea
     *
     * @mbg.generated
     */
    int insert(Cityarea record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cityarea
     *
     * @mbg.generated
     */
    Cityarea selectByPrimaryKey(String areaId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cityarea
     *
     * @mbg.generated
     */
    List<Cityarea> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cityarea
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Cityarea record);
}