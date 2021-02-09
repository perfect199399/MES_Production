package com.example.production_mes.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (EquipMaintenancePlan)实体类
 *
 * @author makejava
 * @since 2020-09-16 09:09:34
 */
public class EquipMaintenancePlan implements Serializable {
    private static final long serialVersionUID = 202796777604060751L;
    /**
     * 保养计划主键
     */
    private String id;
    /**
     * 设备类型
     */
    private String equipType;
    /**
     * 保养内容
     */
    private String maintenance;
    /**
     * 保养周期：周，月，年
     */
    private String cycle;
    /**
     * 预警时间
     */
    private Integer warnTime;
    /**
     * 保养人姓名
     */
    private String userName;
    /**
     * 保养人
     */
    private String userId;

    private String createBy;

    private String updateBy;

    private Date createDate;

    private Date updateDate;

    private String remarks;

    private String delFlag;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEquipType() {
        return equipType;
    }

    public void setEquipType(String equipType) {
        this.equipType = equipType;
    }

    public String getMaintenance() {
        return maintenance;
    }

    public void setMaintenance(String maintenance) {
        this.maintenance = maintenance;
    }

    public String getCycle() {
        return cycle;
    }

    public void setCycle(String cycle) {
        this.cycle = cycle;
    }

    public Integer getWarnTime() {
        return warnTime;
    }

    public void setWarnTime(Integer warnTime) {
        this.warnTime = warnTime;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
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