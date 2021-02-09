package com.example.production_mes.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (LogRemovefishbonebizrecords)实体类
 *
 * @author makejava
 * @since 2020-09-16 09:09:40
 */
public class LogRemovefishbonebizrecords implements Serializable {
    private static final long serialVersionUID = -31083996752188889L;

    private String id;

    private String cardid;

    private String employeeid;

    private String employeename;

    private String workcellid;

    private String workcellname;

    private String equipid;

    private String equipname;

    private String qrcode;

    private Object weight;

    private String unit;

    private Date time;

    private String creatorid;

    private Date createdate;

    private String modifer;

    private Date modifieddate;

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

    public String getModifer() {
        return modifer;
    }

    public void setModifer(String modifer) {
        this.modifer = modifer;
    }

    public Date getModifieddate() {
        return modifieddate;
    }

    public void setModifieddate(Date modifieddate) {
        this.modifieddate = modifieddate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

}