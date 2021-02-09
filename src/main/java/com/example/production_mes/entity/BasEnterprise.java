package com.example.production_mes.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (BasEnterprise)实体类
 *
 * @author makejava
 * @since 2020-09-16 09:08:17
 */
public class BasEnterprise implements Serializable {
    private static final long serialVersionUID = -53928507140588616L;
    /**
     * 企业id
     */
    private String id;
    /**
     * 单位名称
     */
    private String entername;
    /**
     * 组织机构代码
     */
    private String entercode;
    /**
     * 单位层次
     */
    private String enterlevel;
    /**
     * 单位性质
     */
    private String enternature;
    /**
     * 企业注册资本
     */
    private String entercapital;
    /**
     * 法人
     */
    private String enterlperson;
    /**
     * 法人身份证
     */
    private String enterlpcard;
    /**
     * 单位地址
     */
    private String enteraddress;
    /**
     * 邮政编码
     */
    private String emailcode;
    /**
     * 备注
     */
    private String enterremarks;
    /**
     * 创建者
     */
    private String createBy;
    /**
     * 创建日期
     */
    private Date createDate;
    /**
     * 更新人
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

    public String getEntername() {
        return entername;
    }

    public void setEntername(String entername) {
        this.entername = entername;
    }

    public String getEntercode() {
        return entercode;
    }

    public void setEntercode(String entercode) {
        this.entercode = entercode;
    }

    public String getEnterlevel() {
        return enterlevel;
    }

    public void setEnterlevel(String enterlevel) {
        this.enterlevel = enterlevel;
    }

    public String getEnternature() {
        return enternature;
    }

    public void setEnternature(String enternature) {
        this.enternature = enternature;
    }

    public String getEntercapital() {
        return entercapital;
    }

    public void setEntercapital(String entercapital) {
        this.entercapital = entercapital;
    }

    public String getEnterlperson() {
        return enterlperson;
    }

    public void setEnterlperson(String enterlperson) {
        this.enterlperson = enterlperson;
    }

    public String getEnterlpcard() {
        return enterlpcard;
    }

    public void setEnterlpcard(String enterlpcard) {
        this.enterlpcard = enterlpcard;
    }

    public String getEnteraddress() {
        return enteraddress;
    }

    public void setEnteraddress(String enteraddress) {
        this.enteraddress = enteraddress;
    }

    public String getEmailcode() {
        return emailcode;
    }

    public void setEmailcode(String emailcode) {
        this.emailcode = emailcode;
    }

    public String getEnterremarks() {
        return enterremarks;
    }

    public void setEnterremarks(String enterremarks) {
        this.enterremarks = enterremarks;
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