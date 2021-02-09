package com.example.production_mes.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (QcInperfections)实体类
 *
 * @author makejava
 * @since 2020-09-16 09:09:44
 */
public class QcInperfections implements Serializable {
    private static final long serialVersionUID = -26048880277165477L;

    private String id;
    /**
     * 产品编号
     */
    private String pn;
    /**
     * 产品名称
     */
    private String pname;

    /**
     * 批次编号
     */
    private String bn;
    /**
     * 工单id
     */
    private String woId;
    /**
     * 工单编号
     */
    private String woCode;

    private String desc;

    private String createBy;

    private Date createDate;

    private String updateBy;

    private Date updateDate;

    private String delFlag;

    private String remarks;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPn() {
        return pn;
    }

    public void setPn(String pn) {
        this.pn = pn;
    }

    public String getBn() {
        return bn;
    }

    public void setBn(String bn) {
        this.bn = bn;
    }

    public String getWoId() {
        return woId;
    }

    public void setWoId(String woId) {
        this.woId = woId;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
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

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getWoCode() {
        return woCode;
    }

    public void setWoCode(String woCode) {
        this.woCode = woCode;
    }
}