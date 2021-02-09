package com.example.production_mes.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (EquipRepair)实体类
 *
 * @author makejava
 * @since 2020-09-16 09:09:34
 */
public class EquipRepair implements Serializable {
    private static final long serialVersionUID = -32598149839596567L;

    private String id;
    /**
     * 报修记录编号
     */
    private String mid;
    /**
     * 故障类型
     */
    private String faultType;
    /**
     * 故障原因
     */
    private String faultReason;
    /**
     * 故障描述
     */
    private String faultDesc;
    /**
     * 图片地址
     */
    private String faultImgs;

    private String createBy;

    private Date createDate;

    private String updateBy;

    private Date updateDate;

    private String remarks;

    private String delFlag;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getFaultType() {
        return faultType;
    }

    public void setFaultType(String faultType) {
        this.faultType = faultType;
    }

    public String getFaultReason() {
        return faultReason;
    }

    public void setFaultReason(String faultReason) {
        this.faultReason = faultReason;
    }

    public String getFaultDesc() {
        return faultDesc;
    }

    public void setFaultDesc(String faultDesc) {
        this.faultDesc = faultDesc;
    }

    public String getFaultImgs() {
        return faultImgs;
    }

    public void setFaultImgs(String faultImgs) {
        this.faultImgs = faultImgs;
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