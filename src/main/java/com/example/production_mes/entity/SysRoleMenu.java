package com.example.production_mes.entity;

import java.io.Serializable;

/**
 * 角色-菜单(SysRoleMenu)实体类
 *
 * @author makejava
 * @since 2020-09-16 09:09:51
 */
public class SysRoleMenu implements Serializable {
    private static final long serialVersionUID = 495067497778278006L;
    /**
     * 角色编号
     */
    private String roleId;
    /**
     * 菜单编号
     */
    private String menuId;


    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

}