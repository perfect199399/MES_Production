package com.example.production_mes.entity;

import java.io.Serializable;

/**
 * 角色-机构(SysRoleOffice)实体类
 *
 * @author makejava
 * @since 2020-09-16 09:09:51
 */
public class SysRoleOffice implements Serializable {
    private static final long serialVersionUID = -73441458583928599L;
    /**
     * 角色编号
     */
    private String roleId;
    /**
     * 机构编号
     */
    private String officeId;


    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getOfficeId() {
        return officeId;
    }

    public void setOfficeId(String officeId) {
        this.officeId = officeId;
    }

}