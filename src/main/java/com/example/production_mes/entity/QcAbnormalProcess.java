package com.example.production_mes.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 异常工序检测(QcAbnormalProcess)实体类
 *
 * @author makejava
 * @since 2020-09-16 09:09:42
 */
public class QcAbnormalProcess implements Serializable {
    private static final long serialVersionUID = -54257106818399534L;

    private String id;
    /**
     * 工序ID
     */
    private String proId;

    /**
     * 工序
     */
    private String proname;
    /**
     * 问题描述
     */
    private String problem;
    /**
     * 上报人
     */
    private String reportUser;

    /**
     * 上报人
     */
    private String reportUsername;
    /**
     * 上报时间
     */
    private Date reportTime;
    /**
     * 检测描述
     */
    private String test;
    /**
     * 检测人
     */
    private String testUser;
    /**
     * 检测人
     */
    private String testUsername;
    /**
     * 检测时间
     */
    private Date testTime;
    /**
     * 状态
     */
    private String state;
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

    public String getProId() {
        return proId;
    }

    public void setProId(String proId) {
        this.proId = proId;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public String getReportUser() {
        return reportUser;
    }

    public void setReportUser(String reportUser) {
        this.reportUser = reportUser;
    }

    public Date getReportTime() {
        return reportTime;
    }

    public void setReportTime(Date reportTime) {
        this.reportTime = reportTime;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public String getTestUser() {
        return testUser;
    }

    public void setTestUser(String testUser) {
        this.testUser = testUser;
    }

    public Date getTestTime() {
        return testTime;
    }

    public void setTestTime(Date testTime) {
        this.testTime = testTime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
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

    public String getProname() {
        return proname;
    }

    public void setProname(String proname) {
        this.proname = proname;
    }

    public String getReportUsername() {
        return reportUsername;
    }

    public void setReportUsername(String reportUsername) {
        this.reportUsername = reportUsername;
    }

    public String getTestUsername() {
        return testUsername;
    }

    public void setTestUsername(String testUsername) {
        this.testUsername = testUsername;
    }
}