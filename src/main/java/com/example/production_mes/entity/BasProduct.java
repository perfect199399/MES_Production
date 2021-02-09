package com.example.production_mes.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (BasProduct)实体类
 *
 * @author makejava
 * @since 2020-09-16 09:09:28
 */
public class BasProduct implements Serializable {
    private static final long serialVersionUID = 618238593376198200L;

    private String id;
    /**
     * 产品名称
     */
    private String productname;
    /**
     * 产品简称
     */
    private String productabbr;
    /**
     * 产品描述
     */
    private String productdesc;
    /**
     * 是否需要首件检查
     */
    private String firstcheck;
    /**
     * 条码
     */
    private String qrcode;
    /**
     * 管理方式
     */
    private String manageway;
    /**
     * 批次
     */
    private String lotnumber;
    /**
     * 状态
     */
    private String state;
    /**
     * 产品计量单位
     */
    private String productunit;
    /**
     * 产品属性
     */
    private String productprop;
    /**
     * 生产流程
     */
    private String flowId;
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

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getProductabbr() {
        return productabbr;
    }

    public void setProductabbr(String productabbr) {
        this.productabbr = productabbr;
    }

    public String getProductdesc() {
        return productdesc;
    }

    public void setProductdesc(String productdesc) {
        this.productdesc = productdesc;
    }

    public String getFirstcheck() {
        return firstcheck;
    }

    public void setFirstcheck(String firstcheck) {
        this.firstcheck = firstcheck;
    }

    public String getQrcode() {
        return qrcode;
    }

    public void setQrcode(String qrcode) {
        this.qrcode = qrcode;
    }

    public String getManageway() {
        return manageway;
    }

    public void setManageway(String manageway) {
        this.manageway = manageway;
    }

    public String getLotnumber() {
        return lotnumber;
    }

    public void setLotnumber(String lotnumber) {
        this.lotnumber = lotnumber;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getProductunit() {
        return productunit;
    }

    public void setProductunit(String productunit) {
        this.productunit = productunit;
    }

    public String getProductprop() {
        return productprop;
    }

    public void setProductprop(String productprop) {
        this.productprop = productprop;
    }

    public String getFlowId() {
        return flowId;
    }

    public void setFlowId(String flowId) {
        this.flowId = flowId;
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