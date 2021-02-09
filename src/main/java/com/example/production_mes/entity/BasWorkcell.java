package com.example.production_mes.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (BasWorkcell)实体类
 *
 * @author makejava
 * @since 2020-09-16 09:09:30
 */
public class BasWorkcell implements Serializable {
    private static final long serialVersionUID = 146573400135302803L;
    /**
     * 工位id
     */
    private String id;
    /**
     * 工位名
     */
    private String cellname;
    /**
     * 工位编号
     */
    private String cellnumber;
    /**
     * 工位负责人
     */
    private String cellmaster;
    /**
     * 工位描述
     */
    private String celldescription;
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
    /**
     * 所属工站
     */
    private String stationId;
    /**
     * 所属工站
     */
    private String stationname;

    public String getStationname() {
        return stationname;
    }

    public void setStationname(String stationname) {
        this.stationname = stationname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCellname() {
        return cellname;
    }

    public void setCellname(String cellname) {
        this.cellname = cellname;
    }

    public String getCellnumber() {
        return cellnumber;
    }

    public void setCellnumber(String cellnumber) {
        this.cellnumber = cellnumber;
    }

    public String getCellmaster() {
        return cellmaster;
    }

    public void setCellmaster(String cellmaster) {
        this.cellmaster = cellmaster;
    }

    public String getCelldescription() {
        return celldescription;
    }

    public void setCelldescription(String celldescription) {
        this.celldescription = celldescription;
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

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

}