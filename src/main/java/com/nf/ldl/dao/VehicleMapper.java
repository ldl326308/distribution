package com.nf.ldl.dao;

import com.nf.ldl.model.Vehicle;
import java.util.List;

public interface VehicleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vehicle
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String vehId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vehicle
     *
     * @mbg.generated
     */
    int insert(Vehicle record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vehicle
     *
     * @mbg.generated
     */
    Vehicle selectByPrimaryKey(String vehId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vehicle
     *
     * @mbg.generated
     */
    List<Vehicle> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vehicle
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Vehicle record);
}