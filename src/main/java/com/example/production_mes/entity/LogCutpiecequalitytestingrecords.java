package com.example.production_mes.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (LogCutpiecequalitytestingrecords)实体类
 *
 * @author makejava
 * @since 2020-09-16 09:09:38
 */
public class LogCutpiecequalitytestingrecords implements Serializable {
    private static final long serialVersionUID = -84090868902127404L;

    private String id;
    /**
     * 员工工号
     */
    private String cardid;
    private String yield;

    private String employeeid;

    private String employeename;

    private String workcellid;

    private String workcellname;

    private String equipid;

    private String equipname;

    private String qrcode;

    private Object weight;

    private String unit;

    private Object error;
    /**
     * 0:合格 ，1：不合格
     */
    private Integer qualified;

    private Date time;

    private String delFlag;

    private String remarks;

    private String createBy;

    private Date createDate;

    private String updateBy;

    private Date updateDate;

    public String getYield() {
        return yield;
    }

    public void setYield(String yield) {
        this.yield = yield;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCardid() {
        return cardid;
    }

    public void setCardid(String cardid) {
        this.cardid = cardid;
    }

    public String getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(String employeeid) {
        this.employeeid = employeeid;
    }

    public String getEmployeename() {
        return employeename;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }

    public String getWorkcellid() {
        return workcellid;
    }

    public void setWorkcellid(String workcellid) {
        this.workcellid = workcellid;
    }

    public String getWorkcellname() {
        return workcellname;
    }

    public void setWorkcellname(String workcellname) {
        this.workcellname = workcellname;
    }

    public String getEquipid() {
        return equipid;
    }

    public void setEquipid(String equipid) {
        this.equipid = equipid;
    }

    public String getEquipname() {
        return equipname;
    }

    public void setEquipname(String equipname) {
        this.equipname = equipname;
    }

    public String getQrcode() {
        return qrcode;
    }

    public void setQrcode(String qrcode) {
        this.qrcode = qrcode;
    }

    public Object getWeight() {
        return weight;
    }

    public void setWeight(Object weight) {
        this.weight = weight;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Object getError() {
        return error;
    }

    public void setError(Object error) {
        this.error = error;
    }

    public Integer getQualified() {
        return qualified;
    }

    public void setQualified(Integer qualified) {
        this.qualified = qualified;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
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

}