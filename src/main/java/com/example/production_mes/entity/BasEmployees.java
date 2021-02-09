package com.example.production_mes.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (BasEmployees)实体类
 *
 * @author makejava
 * @since 2020-09-16 09:08:17
 */
public class BasEmployees implements Serializable {
    private static final long serialVersionUID = 828343003676912580L;
    /**
     * 员工id
     */
    private String id;
    /**
     * 员工编号
     */
    private String employeeno;
    /**
     * 员工姓名
     */
    private String employeename;
    /**
     * 入职日期
     */
    private Object workdate;
    /**
     * 性别
     */
    private String sex;
    /**
     * 年龄
     */
    private Integer age;
    /**
     * 电话
     */
    private String telnum;
    /**
     * 地址
     */
    private String address;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 身份证
     */
    private String idcard;
    /**
     * 所属部门
     */
    private String officeid;

    public String getOfficename() {
        return officename;
    }

    public void setOfficename(String officename) {
        this.officename = officename;
    }

    /**
     * 备注
     */
    private String officename;
    /**
     * 备注
     */
    private String remarks;
    /**
     * 删除标记
     */
    private String delFlag;
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

    public Object getWorkdate() {
        return workdate;
    }

    public void setWorkdate(Object workdate) {
        this.workdate = workdate;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getTelnum() {
        return telnum;
    }

    public void setTelnum(String telnum) {
        this.telnum = telnum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getOfficeid() {
        return officeid;
    }

    public void setOfficeid(String officeid) {
        this.officeid = officeid;
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