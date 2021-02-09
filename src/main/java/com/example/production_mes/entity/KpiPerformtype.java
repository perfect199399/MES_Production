package com.example.production_mes.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 绩效方式表(KpiPerformtype)实体类
 *
 * @author makejava
 * @since 2020-09-16 09:09:35
 */
public class KpiPerformtype implements Serializable {
    private static final long serialVersionUID = 539006651429706971L;

    private String id;
    /**
     * 绩效名称
     */
    private String performtypename;
    /**
     * 绩效数值
     */
    private Object performtypenum;
    /**
     * 绩效单位
     */
    private String performtypeunit;
    /**
     * 删除标记
     */
    private String delFlag;
    /**
     * 备注信息
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
     * 更新着
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

    public String getPerformtypename() {
        return performtypename;
    }

    public void setPerformtypename(String performtypename) {
        this.performtypename = performtypename;
    }

    public Object getPerformtypenum() {
        return performtypenum;
    }

    public void setPerformtypenum(Object performtypenum) {
        this.performtypenum = performtypenum;
    }

    public String getPerformtypeunit() {
        return performtypeunit;
    }

    public void setPerformtypeunit(String performtypeunit) {
        this.performtypeunit = performtypeunit;
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