package com.example.production_mes.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 员工上岗表(MountGuard)实体类
 *
 * @author makejava
 * @since 2020-09-16 09:09:41
 */
public class MountGuard implements Serializable {
    private static final long serialVersionUID = -60776122956689887L;
    /**
     * 编号
     */
    private String id;
    /**
     * 员工ID
     */
    private String employeeId;

    public String getOfficename() {
        return officename;
    }

    public void setOfficename(String officename) {
        this.officename = officename;
    }

    /**
     * 员工工号
     */
    private String employeeno;

    private String employeename;
    /**
     * 所属部门
     */
    private String officename;
    /**
     * 所属部门
     */
    private String officeId;
    /**
     * 所属产线
     */
    private String lineId;

    private String linename;
    /**
     * 所属工站
     */
    private String stationId;

    private String stationname;
    /**
     * 工位
     */
    private String cellId;

    private String cellname;
    /**
     * 打卡上班
     */
    private Date clockin;
    /**
     * 打卡下班
     */
    private Date clockoff;
    /**
     * 一次上下班工作时间
     */
    private String worktime;
    /**
     * 工作状态
     */
    private String workstatus;
    /**
     * 删除标记
     */
    private String delFlag;
    /**
     * 备注
     */
    private String remarks;
    /**
     * 创建人
     */
    private String createBy;
    /**
     * 创建时间
     */
    private Date createDate;
    /**
     * 更新人
     */
    private String updateBy;
    /**
     * 更新时间
     */
    private Date updateDate;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeno() {
        return employeeno;
    }

    public void setEmployeeno(String employeeno) {
        this.employeeno = employeeno;
    }

    public String getEmployeename() {
        return employeename;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }

    public String getOfficeId() {
        return officeId;
    }

    public void setOfficeId(String officeId) {
        this.officeId = officeId;
    }

    public String getLineId() {
        return lineId;
    }

    public void setLineId(String lineId) {
        this.lineId = lineId;
    }

    public String getLinename() {
        return linename;
    }

    public void setLinename(String linename) {
        this.linename = linename;
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public String getStationname() {
        return stationname;
    }

    public void setStationname(String stationname) {
        this.stationname = stationname;
    }

    public String getCellId() {
        return cellId;
    }

    public void setCellId(String cellId) {
        this.cellId = cellId;
    }

    public String getCellname() {
        return cellname;
    }

    public void setCellname(String cellname) {
        this.cellname = cellname;
    }

    public Date getClockin() {
        return clockin;
    }

    public void setClockin(Date clockin) {
        this.clockin = clockin;
    }

    public Date getClockoff() {
        return clockoff;
    }

    public void setClockoff(Date clockoff) {
        this.clockoff = clockoff;
    }

    public String getWorktime() {
        return worktime;
    }

    public void setWorktime(String worktime) {
        this.worktime = worktime;
    }

    public String getWorkstatus() {
        return workstatus;
    }

    public void setWorkstatus(String workstatus) {
        this.workstatus = workstatus;
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