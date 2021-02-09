package com.example.production_mes.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 角色表(SysRole)实体类
 *
 * @author makejava
 * @since 2020-09-16 09:09:49
 */
public class SysRole implements Serializable {
    private static final long serialVersionUID = 233533834467138839L;
    /**
     * 编号
     */
    private String id;
    /**
     * 归属机构
     */
    private String officeId;
    /**
     * 角色名称
     */
    private String name;
    /**
     * 英文名称
     */
    private String enname;
    /**
     * 角色类型
     */
    private String roleType;
    /**
     * 数据范围
     */
    private String dataScope;
    /**
     * 是否系统数据
     */
    private String isSys;
    /**
     * 是否可用
     */
    private String useable;
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

    public String getOfficeId() {
        return officeId;
    }

    public void setOfficeId(String officeId) {
        this.officeId = officeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnname() {
        return enname;
    }

    public void setEnname(String enname) {
        this.enname = enname;
    }

    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }

    public String getDataScope() {
        return dataScope;
    }

    public void setDataScope(String dataScope) {
        this.dataScope = dataScope;
    }

    public String getIsSys() {
        return isSys;
    }

    public void setIsSys(String isSys) {
        this.isSys = isSys;
    }

    public String getUseable() {
        return useable;
    }

    public void setUseable(String useable) {
        this.useable = useable;
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