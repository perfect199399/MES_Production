package com.example.production_mes.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (Material)实体类
 *
 * @author makejava
 * @since 2020-09-16 09:09:41
 */
public class Material implements Serializable {
    private static final long serialVersionUID = 643835127616448263L;
    /**
     * 编号
     */
    private String id;
    /**
     * 批号
     */
    private String batchnum;
    /**
     * 材料类型
     */
    private String mtype;
    /**
     * 材料名称
     */
    private String mname;
    /**
     * 供应商ID
     */
    private String supplierid;
    /**
     * 供应商名称
     */
    private String suppliername;
    /**
     * 采购日期
     */
    private Object purchasedate;
    /**
     * 数量（顿）
     */
    private Object quantity;

    private String unit;
    /**
     * 备注
     */
    private String remarks;
    /**
     * 删除标记
     */
    private String delFlag;
    /**
     * 创建人
     */
    private String createBy;
    /**
     * 创建时间
     */
    private Date createDate;
    /**
     * 更新人
     */
    private String updateBy;
    /**
     * 更新时间
     */
    private Date updateDate;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBatchnum() {
        return batchnum;
    }

    public void setBatchnum(String batchnum) {
        this.batchnum = batchnum;
    }

    public String getMtype() {
        return mtype;
    }

    public void setMtype(String mtype) {
        this.mtype = mtype;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(String supplierid) {
        this.supplierid = supplierid;
    }

    public String getSuppliername() {
        return suppliername;
    }

    public void setSuppliername(String suppliername) {
        this.suppliername = suppliername;
    }

    public Object getPurchasedate() {
        return purchasedate;
    }

    public void setPurchasedate(Object purchasedate) {
        this.purchasedate = purchasedate;
    }

    public Object getQuantity() {
        return quantity;
    }

    public void setQuantity(Object quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
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