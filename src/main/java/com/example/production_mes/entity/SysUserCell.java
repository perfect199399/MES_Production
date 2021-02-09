package com.example.production_mes.entity;

import java.io.Serializable;

/**
 * (SysUserCell)实体类
 *
 * @author makejava
 * @since 2020-09-16 09:09:52
 */
public class SysUserCell implements Serializable {
    private static final long serialVersionUID = 601361659302208810L;
    /**
     * 用户编号
     */
    private String userId;
    /**
     * 工位编号
     */
    private String cellId;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCellId() {
        return cellId;
    }

    public void setCellId(String cellId) {
        this.cellId = cellId;
    }

}