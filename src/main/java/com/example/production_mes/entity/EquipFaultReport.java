package com.example.production_mes.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (EquipFaultReport)实体类
 *
 * @author makejava
 * @since 2020-09-16 09:09:33
 */
public class EquipFaultReport implements Serializable {
    private static final long serialVersionUID = -82832386736928828L;
    /**
     * 主键
     */
    private String id;
    /**
     * 设备主键
     */
    private String equipId;
    /**
     * 设备编号
     */
    private String equipNo;
    /**
     * 设备类型
     */
    private String equipType;
    /**
     * 所处产线
     */
    private String equipLoc;
    /**
     * 故障描述
     */
    private String faultDesc;
    /**
     * 状态
     */
    private String status;
    /**
     * 上报人姓名
     */
    private String reportPerson;
    /**
     * 指派时间
     */
    private Date assignTime;
    /**
     * 维修工人
     */
    private String maintenanceWorker;

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

    public String getEquipId() {
        return equipId;
    }

    public void setEquipId(String equipId) {
        this.equipId = equipId;
    }

    public String getEquipNo() {
        return equipNo;
    }

    public void setEquipNo(String equipNo) {
        this.equipNo = equipNo;
    }

    public String getEquipType() {
        return equipType;
    }

    public void setEquipType(String equipType) {
        this.equipType = equipType;
    }

    public String getEquipLoc() {
        return equipLoc;
    }

    public void setEquipLoc(String equipLoc) {
        this.equipLoc = equipLoc;
    }

    public String getFaultDesc() {
        return faultDesc;
    }

    public void setFaultDesc(String faultDesc) {
        this.faultDesc = faultDesc;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReportPerson() {
        return reportPerson;
    }

    public void setReportPerson(String reportPerson) {
        this.reportPerson = reportPerson;
    }

    public Date getAssignTime() {
        return assignTime;
    }

    public void setAssignTime(Date assignTime) {
        this.assignTime = assignTime;
    }

    public String getMaintenanceWorker() {
        return maintenanceWorker;
    }

    public void setMaintenanceWorker(String maintenanceWorker) {
        this.maintenanceWorker = maintenanceWorker;
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