package com.example.production_mes.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 机构表(SysOffice)实体类
 *
 * @author makejava
 * @since 2020-09-16 09:09:48
 */
public class SysOffice implements Serializable {
    private static final long serialVersionUID = -45537374572585944L;
    /**
     * 编号
     */
    private String id;
    /**
     * 父级编号
     */
    private String parentId;
    /**
     * 所有父级编号
     */
    private String parentIds;
    /**
     * 名称
     */
    private String name;
    /**
     * 排序
     */
    private Double sort;
    /**
     * 归属区域
     */
    private String areaId;
    /**
     * 区域编码
     */
    private String code;
    /**
     * 机构类型
     */
    private String type;
    /**
     * 机构等级
     */
    private String grade;
    /**
     * 联系地址
     */
    private String address;
    /**
     * 邮政编码
     */
    private String zipCode;
    /**
     * 负责人
     */
    private String master;
    /**
     * 电话
     */
    private String phone;
    /**
     * 传真
     */
    private String fax;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 是否启用
     */
    private String useable;
    /**
     * 主负责人
     */
    private String primaryPerson;
    /**
     * 副负责人
     */
    private String deputyPerson;
    /**
     * 创建者
     */
    private String createBy;
    /**
     * 创建时间
     */
    private Date createDate;
    /**
     * 更新者
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

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getParentIds() {
        return parentIds;
    }

    public void setParentIds(String parentIds) {
        this.parentIds = parentIds;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSort() {
        return sort;
    }

    public void setSort(Double sort) {
        this.sort = sort;
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getMaster() {
        return master;
    }

    public void setMaster(String master) {
        this.master = master;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUseable() {
        return useable;
    }

    public void setUseable(String useable) {
        this.useable = useable;
    }

    public String getPrimaryPerson() {
        return primaryPerson;
    }

    public void setPrimaryPerson(String primaryPerson) {
        this.primaryPerson = primaryPerson;
    }

    public String getDeputyPerson() {
        return deputyPerson;
    }

    public void setDeputyPerson(String deputyPerson) {
        this.deputyPerson = deputyPerson;
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