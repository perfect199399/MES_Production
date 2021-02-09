package com.example.production_mes.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (BasWorkorder)实体类
 *
 * @author makejava
 * @since 2020-09-16 09:09:30
 */
public class BasWorkorder implements Serializable {
    private static final long serialVersionUID = 211867373936638846L;
    /**
     * 工单Id
     */
    private String id;
    /**
     * 订单Id
     */
    private String orderId;
    /**
     * 工单条码
     */
    private String ordercode;
    /**
     * 计量单位
     */
    private String unitname;
    /**
     * 工单类型
     */
    private String ordertype;
    /**
     * 工单生产数量
     */
    private String amount;
    /**
     * 预计生产时间
     */
    private String eststarttime;
    /**
     * 预计结束时间
     */
    private String estendtime;
    /**
     * 实际生产时间
     */
    private String actstarttime;
    /**
     * 投入数量
     */
    private Integer inamount;
    /**
     * 产出数量
     */
    private String outamount;
    /**
     * 报废数量
     */
    private Integer scrapamount;
    /**
     * 工单状态
     */
    private String state;
    /**
     * 所属产线
     */
    private String lineId;
    /**
     * 产品
     */
    private String productId;
    /**
     * 删除标记
     */
    private String delFlag;
    /**
     * 备注
     */
    private String remarks;
    /**
     * 创建者
     */
    private String createBy;
    /**
     * 创建日期
     */
    private Date createDate;
    /**
     * 更新者
     */
    private String updateBy;
    private String productname;
    private String linename;

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getLinename() {
        return linename;
    }

    public void setLinename(String linename) {
        this.linename = linename;
    }

    /**
     * 更新日期
     */
    private Date updateDate;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrdercode() {
        return ordercode;
    }

    public void setOrdercode(String ordercode) {
        this.ordercode = ordercode;
    }

    public String getUnitname() {
        return unitname;
    }

    public void setUnitname(String unitname) {
        this.unitname = unitname;
    }

    public String getOrdertype() {
        return ordertype;
    }

    public void setOrdertype(String ordertype) {
        this.ordertype = ordertype;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getEststarttime() {
        return eststarttime;
    }

    public void setEststarttime(String eststarttime) {
        this.eststarttime = eststarttime;
    }

    public String getEstendtime() {
        return estendtime;
    }

    public void setEstendtime(String estendtime) {
        this.estendtime = estendtime;
    }

    public String getActstarttime() {
        return actstarttime;
    }

    public void setActstarttime(String actstarttime) {
        this.actstarttime = actstarttime;
    }

    public Integer getInamount() {
        return inamount;
    }

    public void setInamount(Integer inamount) {
        this.inamount = inamount;
    }

    public String getOutamount() {
        return outamount;
    }

    public void setOutamount(String outamount) {
        this.outamount = outamount;
    }

    public Integer getScrapamount() {
        return scrapamount;
    }

    public void setScrapamount(Integer scrapamount) {
        this.scrapamount = scrapamount;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getLineId() {
        return lineId;
    }

    public void setLineId(String lineId) {
        this.lineId = lineId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
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