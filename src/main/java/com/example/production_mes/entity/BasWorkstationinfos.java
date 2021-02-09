package com.example.production_mes.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (BasWorkstationinfos)实体类
 *
 * @author makejava
 * @since 2020-09-16 09:09:32
 */
public class BasWorkstationinfos implements Serializable {
    private static final long serialVersionUID = 626781213753209451L;
    /**
     * 工站id
     */
    private String id;
    /**
     * 工站名称
     */
    private String stationname;
    /**
     * 工站编码
     */
    private String stationno;
    /**
     * 工站负责人
     */
    private String stationmaster;
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
     * 备注
     */
    private String remarks;
    /**
     * 删除标记
     */
    private String delFlag;

    public String getLinename() {
        return linename;
    }

    public void setLinename(String linename) {
        this.linename = linename;
    }

    /**
     * 所属产线
     */
    private String linename;
    /**
     * 所属产线
     */
    private String lineId;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStationname() {
        return stationname;
    }

    public void setStationname(String stationname) {
        this.stationname = stationname;
    }

    public String getStationno() {
        return stationno;
    }

    public void setStationno(String stationno) {
        this.stationno = stationno;
    }

    public String getStationmaster() {
        return stationmaster;
    }

    public void setStationmaster(String stationmaster) {
        this.stationmaster = stationmaster;
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

    public String getLineId() {
        return lineId;
    }

    public void setLineId(String lineId) {
        this.lineId = lineId;
    }

}