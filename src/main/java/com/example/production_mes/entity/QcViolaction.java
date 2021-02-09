package com.example.production_mes.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (QcViolaction)实体类
 *
 * @author makejava
 * @since 2020-09-16 09:09:44
 */
public class QcViolaction implements Serializable {
    private static final long serialVersionUID = -59480386341075495L;
    /**
     * 主键
     */
    private String id;
    /**
     * 工站编号
     */
    private String stationId;
    /**
     * 工站名
     */
    private String stationname;
    /**
     * 工序编号
     */
    private String procode;
    /**
     * 工序编号
     */
    private String proId;
    /**
     * 违规人员
     */
    private String username;
    /**
     * 违规描述
     */
    private String violationDes;
    /**
     * 违规时间
     */
    private Date violationTime;
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
    /**
     * 删除标记
     */
    private String delFlag;
    /**
     * 备注
     */
    private String remarks;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public String getProId() {
        return proId;
    }

    public void setProId(String proId) {
        this.proId = proId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getViolationDes() {
        return violationDes;
    }

    public void setViolationDes(String violationDes) {
        this.violationDes = violationDes;
    }

    public Date getViolationTime() {
        return violationTime;
    }

    public void setViolationTime(Date violationTime) {
        this.violationTime = violationTime;
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

    public String getStationname() {
        return stationname;
    }

    public void setStationname(String stationname) {
        this.stationname = stationname;
    }

    public String getProcode() {
        return procode;
    }

    public void setProcode(String procode) {
        this.procode = procode;
    }
}