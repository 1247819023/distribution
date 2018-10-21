package com.lgj.entity;

import java.math.BigDecimal;

public class Deliveryrange {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column deliveryrange.range_id
     *
     * @mbg.generated
     */
    private String rangeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column deliveryrange.dep_id
     *
     * @mbg.generated
     */
    private String depId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column deliveryrange.area_id
     *
     * @mbg.generated
     */
    private String areaId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column deliveryrange.range_name
     *
     * @mbg.generated
     */
    private String rangeName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column deliveryrange.delivary_price
     *
     * @mbg.generated
     */
    private BigDecimal delivaryPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column deliveryrange.Comment
     *
     * @mbg.generated
     */
    private String comment;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column deliveryrange.range_id
     *
     * @return the value of deliveryrange.range_id
     *
     * @mbg.generated
     */
    public String getRangeId() {
        return rangeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column deliveryrange.range_id
     *
     * @param rangeId the value for deliveryrange.range_id
     *
     * @mbg.generated
     */
    public void setRangeId(String rangeId) {
        this.rangeId = rangeId == null ? null : rangeId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column deliveryrange.dep_id
     *
     * @return the value of deliveryrange.dep_id
     *
     * @mbg.generated
     */
    public String getDepId() {
        return depId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column deliveryrange.dep_id
     *
     * @param depId the value for deliveryrange.dep_id
     *
     * @mbg.generated
     */
    public void setDepId(String depId) {
        this.depId = depId == null ? null : depId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column deliveryrange.area_id
     *
     * @return the value of deliveryrange.area_id
     *
     * @mbg.generated
     */
    public String getAreaId() {
        return areaId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column deliveryrange.area_id
     *
     * @param areaId the value for deliveryrange.area_id
     *
     * @mbg.generated
     */
    public void setAreaId(String areaId) {
        this.areaId = areaId == null ? null : areaId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column deliveryrange.range_name
     *
     * @return the value of deliveryrange.range_name
     *
     * @mbg.generated
     */
    public String getRangeName() {
        return rangeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column deliveryrange.range_name
     *
     * @param rangeName the value for deliveryrange.range_name
     *
     * @mbg.generated
     */
    public void setRangeName(String rangeName) {
        this.rangeName = rangeName == null ? null : rangeName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column deliveryrange.delivary_price
     *
     * @return the value of deliveryrange.delivary_price
     *
     * @mbg.generated
     */
    public BigDecimal getDelivaryPrice() {
        return delivaryPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column deliveryrange.delivary_price
     *
     * @param delivaryPrice the value for deliveryrange.delivary_price
     *
     * @mbg.generated
     */
    public void setDelivaryPrice(BigDecimal delivaryPrice) {
        this.delivaryPrice = delivaryPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column deliveryrange.Comment
     *
     * @return the value of deliveryrange.Comment
     *
     * @mbg.generated
     */
    public String getComment() {
        return comment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column deliveryrange.Comment
     *
     * @param comment the value for deliveryrange.Comment
     *
     * @mbg.generated
     */
    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }
}