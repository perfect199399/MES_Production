package com.example.production_mes.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (BasWorkshop)实体类
 *
 * @author makejava
 * @since 2020-09-16 09:09:31
 */
public class BasWorkshop implements Serializable {
    private static final long serialVersionUID = -21531983109751821L;
    /**
     * 车间id
     */
    private String id;
    /**
     * 车间名称
     */
    private String shopname;
    /**
     * 车间编码
     */
    private String shopno;
    /**
     * 车间负责人
     */
    private String master;
    /**
     * 车间描述
     */
    private String description;
    /**
     * 所属工厂
     */
    private String factoryId;
    /**
     * 所属工厂名称
     */
    private String factoryname;

    public String getFactoryname() {
        return factoryname;
    }

    public void setFactoryname(String factoryname) {
        this.factoryname = factoryname;
    }

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
    /**
     * 备注信息
     */
    private String remarks;
    /**
     * 删除信息
     */
    private String delFlag;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname;
    }

    public String getShopno() {
        return shopno;
    }

    public void setShopno(String shopno) {
        this.shopno = shopno;
    }

    public String getMaster() {
        return master;
    }

    public void setMaster(String master) {
        this.master = master;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFactoryId() {
        return factoryId;
    }

    public void setFactoryId(String factoryId) {
        this.factoryId = factoryId;
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