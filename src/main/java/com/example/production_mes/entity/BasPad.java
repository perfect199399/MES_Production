package com.example.production_mes.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (BasPad)实体类
 *
 * @author makejava
 * @since 2020-09-16 09:09:27
 */
public class BasPad implements Serializable {
    private static final long serialVersionUID = -46777903284928405L;
    /**
     * 设备条码
     */
    private String qrcode;
    /**
     * 设备类型id，外键，对应EquipmentType表
     */
    private String type;
    /**
     * 设备规格id，外键，对应EquipmentSpec表
     */
    private String spec;
    /**
     * 供应商
     */
    private String supplier;
    /**
     * 生产商
     */
    private String manufacturer;
    /**
     * 出厂编号
     */
    private String factorynumber;
    /**
     * 用途
     */
    private String purpose;
    /**
     * 采购日期
     */
    private Object buydate;
    /**
     * 资产负责人
     */
    private String person;
    /**
     * 所有权部门
     */
    private String organization;
    /**
     * ip
     */
    private String ip;
    /**
     * com波特率
     */
    private String combaudrate;
    /**
     * com数据位
     */
    private String comdataseat;
    /**
     * com起始位
     */
    private String combegin;
    /**
     * com终止位
     */
    private String comend;
    /**
     * 校验属性
     */
    private String checkmode;
    /**
     * 系统简单属性
     */
    private String sysparam;
    /**
     * 分辨率
     */
    private String padsc;
    /**
     * 核心数
     */
    private String padnucleus;
    /**
     * 内存
     */
    private String padmemory;
    /**
     * 电池容量
     */
    private String capacity;
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
    /**
     * 编号
     */
    private String id;
    /**
     * 所属工位
     */
    private String cellId;
    /**
     * 所属工站
     */
    private String stationId;

    /**
     * 所属工位
     */
    private String cellname;
    /**
     * 所属工站
     */
    private String stationname;


    public String getQrcode() {
        return qrcode;
    }

    public void setQrcode(String qrcode) {
        this.qrcode = qrcode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getFactorynumber() {
        return factorynumber;
    }

    public void setFactorynumber(String factorynumber) {
        this.factorynumber = factorynumber;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public Object getBuydate() {
        return buydate;
    }

    public void setBuydate(Object buydate) {
        this.buydate = buydate;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getCombaudrate() {
        return combaudrate;
    }

    public void setCombaudrate(String combaudrate) {
        this.combaudrate = combaudrate;
    }

    public String getComdataseat() {
        return comdataseat;
    }

    public void setComdataseat(String comdataseat) {
        this.comdataseat = comdataseat;
    }

    public String getCombegin() {
        return combegin;
    }

    public void setCombegin(String combegin) {
        this.combegin = combegin;
    }

    public String getComend() {
        return comend;
    }

    public void setComend(String comend) {
        this.comend = comend;
    }

    public String getCheckmode() {
        return checkmode;
    }

    public void setCheckmode(String checkmode) {
        this.checkmode = checkmode;
    }

    public String getSysparam() {
        return sysparam;
    }

    public void setSysparam(String sysparam) {
        this.sysparam = sysparam;
    }

    public String getPadsc() {
        return padsc;
    }

    public void setPadsc(String padsc) {
        this.padsc = padsc;
    }

    public String getPadnucleus() {
        return padnucleus;
    }

    public void setPadnucleus(String padnucleus) {
        this.padnucleus = padnucleus;
    }

    public String getPadmemory() {
        return padmemory;
    }

    public void setPadmemory(String padmemory) {
        this.padmemory = padmemory;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCellId() {
        return cellId;
    }

    public void setCellId(String cellId) {
        this.cellId = cellId;
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public String getCellname() {
        return cellname;
    }

    public void setCellname(String cellname) {
        this.cellname = cellname;
    }

    public String getStationname() {
        return stationname;
    }

    public void setStationname(String stationname) {
        this.stationname = stationname;
    }
}