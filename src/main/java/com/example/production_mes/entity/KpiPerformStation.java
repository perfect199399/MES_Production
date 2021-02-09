package com.example.production_mes.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 绩效参数与工站关系表(KpiPerformStation)实体类
 *
 * @author makejava
 * @since 2020-09-16 09:09:35
 */
public class KpiPerformStation implements Serializable {
    private static final long serialVersionUID = 298445481635974044L;

    private String id;
    /**
     * 绩效数值
     */
    private String performId;
    /**
     * 工站
     */
    private String stationId;
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

    public String getPerformId() {
        return performId;
    }

    public void setPerformId(String performId) {
        this.performId = performId;
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
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