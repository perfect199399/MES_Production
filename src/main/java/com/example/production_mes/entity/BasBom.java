package com.example.production_mes.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 物料清单(BasBom)实体类
 *
 * @author makejava
 * @since 2020-09-16 09:08:12
 */
public class BasBom implements Serializable {
    private static final long serialVersionUID = -50008459979329384L;

    private String id;
    /**
     * bom名称
     */
    private String bomname;
    /**
     * bom版本
     */
    private String bomversion;
    /**
     * 产品编号
     */
    private String productId;
    /**
     * 状态
     */
    private String status;
    /**
     * 创建者
     */
    private String createBy;
    /**
     * 创建时间
     */
    private Date createDate;
    /**
     * 更新着
     */
    private String updateBy;
    /**
     * 更新时间
     */
    private Date updateDate;
    /**
     * 备注信息
     */
    private String remarks;
    /**
     * 删除标记
     */
    private String delFlag;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBomname() {
        return bomname;
    }

    public void setBomname(String bomname) {
        this.bomname = bomname;
    }

    public String getBomversion() {
        return bomversion;
    }

    public void setBomversion(String bomversion) {
        this.bomversion = bomversion;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

}