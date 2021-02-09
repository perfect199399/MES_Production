package com.example.production_mes.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (BasFactory)实体类
 *
 * @author makejava
 * @since 2020-09-16 09:09:25
 */
public class BasFactory implements Serializable {
    private static final long serialVersionUID = 876877925803762106L;
    /**
     * 工厂id
     */
    private String id;
    /**
     * 工厂名称
     */
    private String factoryname;
    /**
     * 创建日期
     */
    private String factorybuilddate;
    /**
     * 地址
     */
    private String factoryaddress;
    /**
     * 电话
     */
    private String factoryphone;
    /**
     * 邮政编码
     */
    private String factoryecode;
    /**
     * 建筑面积
     */
    private String factorybuildm;
    /**
     * 企业编号
     */
    private String enterpriseId;
    /**
     * 企业名称
     */
    private String enterprisename;
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

    public String getFactoryname() {
        return factoryname;
    }

    public void setFactoryname(String factoryname) {
        this.factoryname = factoryname;
    }

    public String getFactorybuilddate() {
        return factorybuilddate;
    }

    public void setFactorybuilddate(String factorybuilddate) {
        this.factorybuilddate = factorybuilddate;
    }

    public String getFactoryaddress() {
        return factoryaddress;
    }

    public void setFactoryaddress(String factoryaddress) {
        this.factoryaddress = factoryaddress;
    }

    public String getFactoryphone() {
        return factoryphone;
    }

    public void setFactoryphone(String factoryphone) {
        this.factoryphone = factoryphone;
    }

    public String getFactoryecode() {
        return factoryecode;
    }

    public void setFactoryecode(String factoryecode) {
        this.factoryecode = factoryecode;
    }

    public String getFactorybuildm() {
        return factorybuildm;
    }

    public void setFactorybuildm(String factorybuildm) {
        this.factorybuildm = factorybuildm;
    }

    public String getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
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

    public String getEnterprisename() {
        return enterprisename;
    }

    public void setEnterprisename(String enterprisename) {
        this.enterprisename = enterprisename;
    }
}