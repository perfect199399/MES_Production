package com.example.production_mes.entity;

import java.io.Serializable;

/**
 * 用户-角色(SysUserRole)实体类
 *
 * @author makejava
 * @since 2020-09-16 09:09:53
 */
public class SysUserRole implements Serializable {
    private static final long serialVersionUID = 564621122321749164L;
    /**
     * 用户编号
     */
    private String userId;
    /**
     * 角色编号
     */
    private String roleId;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

}