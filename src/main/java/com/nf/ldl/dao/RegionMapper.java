package com.nf.ldl.dao;

import com.nf.ldl.model.Region;
import java.util.List;

public interface RegionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table region
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String regId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table region
     *
     * @mbg.generated
     */
    int insert(Region record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table region
     *
     * @mbg.generated
     */
    Region selectByPrimaryKey(String regId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table region
     *
     * @mbg.generated
     */
    List<Region> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table region
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Region record);
}