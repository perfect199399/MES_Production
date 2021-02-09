package com.example.production_mes.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (Orders)实体类
 *
 * @author makejava
 * @since 2020-09-16 09:09:42
 */
public class Orders implements Serializable {
    private static final long serialVersionUID = 164157584653503921L;
    /**
     * 编号
     */
    private String id;
    /**
     * 员工Id
     */
    private String orderno;
    /**
     * 员工工号
     */
    private String indentor;
    /**
     * 姓名
     */
    private String productId;

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    /**
     * 所属部门
     */
    private String productname;
    private Integer quantity;
    /**
     * 所属产线
     */
    private String unit;
    /**
     * 预计生产时间
     */
    private Date orderdate;
    /**
     * 预计结束时间
     */
    private String salesman;
    /**
     * 实际生产时间
     */
    private String status;
    /**
     * 删除标记
     */
    private String delFlag;
    /**
     * 备注
     */
    private String remarks;
    /**
     * 创建者
     */
    private String createBy;
    /**
     * 创建日期
     */
    private Date createDate;
    /**
     * 更新者
     */
    private String updateBy;
    /**
     * 更新日期
     */
    private Date updateDate;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno;
    }

    public String getIndentor() {
        return indentor;
    }

    public void setIndentor(String indentor) {
        this.indentor = indentor;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Date getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }

    public String getSalesman() {
        return salesman;
    }

    public void setSalesman(String salesman) {
        this.salesman = salesman;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

}