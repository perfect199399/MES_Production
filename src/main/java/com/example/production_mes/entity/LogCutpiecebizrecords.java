package com.example.production_mes.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (LogCutpiecebizrecords)实体类
 *
 * @author makejava
 * @since 2020-09-16 09:09:37
 */
public class LogCutpiecebizrecords implements Serializable {
    private static final long serialVersionUID = 663097279771984444L;

    private String id;

    private String cardid;

    private String employeeid;

    private String employeename;

    private String workcellid;

    private String workcellname;

    private String equipid;

    private String equipname;

    private String qrcode;

    private Integer counter;

    private String unit;

    private Integer pieces;

    private Date time;

    private String creatorid;

    private Date createdate;

    private String updateby;

    private Date updatedate;

    private String remarks;


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

    public Integer getCounter() {
        return counter;
    }

    public void setCounter(Integer counter) {
        this.counter = counter;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Integer getPieces() {
        return pieces;
    }

    public void setPieces(Integer pieces) {
        this.pieces = pieces;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getCreatorid() {
        return creatorid;
    }

    public void setCreatorid(String creatorid) {
        this.creatorid = creatorid;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getUpdateby() {
        return updateby;
    }

    public void setUpdateby(String updateby) {
        this.updateby = updateby;
    }

    public Date getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

}