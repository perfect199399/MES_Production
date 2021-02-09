package com.example.production_mes.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (BasLine)实体类
 *
 * @author makejava
 * @since 2020-09-16 09:09:27
 */
public class BasLine implements Serializable {
    private static final long serialVersionUID = -19618153130521653L;
    /**
     * 产线id
     */
    private String id;
    /**
     * 产线名称
     */
    private String linename;
    /**
     * 产线编码
     */
    private String linenumber;
    /**
     * 产线负责人
     */
    private String linemaster;
    /**
     * 产线描述
     */
    private String linedescription;
    /**
     * 所属车间
     */
    private String workshopId;

    public String getWorkshopname() {
        return workshopname;
    }

    public void setWorkshopname(String workshopname) {
        this.workshopname = workshopname;
    }

    /**
     * 所属车间
     */
    private String workshopname;
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


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLinename() {
        return linename;
    }

    public void setLinename(String linename) {
        this.linename = linename;
    }

    public String getLinenumber() {
        return linenumber;
    }

    public void setLinenumber(String linenumber) {
        this.linenumber = linenumber;
    }

    public String getLinemaster() {
        return linemaster;
    }

    public void setLinemaster(String linemaster) {
        this.linemaster = linemaster;
    }

    public String getLinedescription() {
        return linedescription;
    }

    public void setLinedescription(String linedescription) {
        this.linedescription = linedescription;
    }

    public String getWorkshopId() {
        return workshopId;
    }

    public void setWorkshopId(String workshopId) {
        this.workshopId = workshopId;
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

    @Override
    public String toString() {
        return "BasLine{" +
                "id='" + id + '\'' +
                ", linename='" + linename + '\'' +
                ", linenumber='" + linenumber + '\'' +
                ", linemaster='" + linemaster + '\'' +
                ", linedescription='" + linedescription + '\'' +
                ", workshopId='" + workshopId + '\'' +
                ", createBy='" + createBy + '\'' +
                ", createDate=" + createDate +
                ", updateBy='" + updateBy + '\'' +
                ", updateDate=" + updateDate +
                ", remarks='" + remarks + '\'' +
                ", delFlag='" + delFlag + '\'' +
                '}';
    }
}