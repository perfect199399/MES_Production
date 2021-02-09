package com.example.production_mes.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (BasBomDetail)实体类
 *
 * @author makejava
 * @since 2020-09-16 09:08:12
 */
public class BasBomDetail implements Serializable {
    private static final long serialVersionUID = 888414930209230020L;

    private String id;

    private String bomId;

    private String mtype;

    private Integer mnum;

    private String unit;

    private String delFlag;

    private String remarks;

    private String createBy;

    private Date createDate;

    private String updateBy;

    private Date updateDate;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBomId() {
        return bomId;
    }

    public void setBomId(String bomId) {
        this.bomId = bomId;
    }

    public String getMtype() {
        return mtype;
    }

    public void setMtype(String mtype) {
        this.mtype = mtype;
    }

    public Integer getMnum() {
        return mnum;
    }

    public void setMnum(Integer mnum) {
        this.mnum = mnum;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
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