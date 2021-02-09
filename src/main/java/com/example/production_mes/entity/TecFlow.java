package com.example.production_mes.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 工艺路由维护（流程）(TecFlow)实体类
 *
 * @author makejava
 * @since 2020-09-16 09:09:54
 */
public class TecFlow implements Serializable {
    private static final long serialVersionUID = -87849099135180486L;

    private String id;
    /**
     * 流程编号
     */
    private String flowcode;
    /**
     * 版本
     */
    private String version;
    /**
     * 流程名称
     */
    private String flowname;
    /**
     * 描述
     */
    private String flowdesc;
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
    /**
     * 备注信息
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

    public String getFlowcode() {
        return flowcode;
    }

    public void setFlowcode(String flowcode) {
        this.flowcode = flowcode;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getFlowname() {
        return flowname;
    }

    public void setFlowname(String flowname) {
        this.flowname = flowname;
    }

    public String getFlowdesc() {
        return flowdesc;
    }

    public void setFlowdesc(String flowdesc) {
        this.flowdesc = flowdesc;
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