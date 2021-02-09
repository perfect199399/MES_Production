package com.example.production_mes.entity;

/**
 * @author : weizhipeng
 * create at:  2020/10/6  8:05 下午
 * @description: Bom物料
 */
public class BasBomList extends BasBom {
    private String belongProduct;


    public String getBelongProduct() {
        return belongProduct;
    }

    public void setBelongProduct(String belongProduct) {
        this.belongProduct = belongProduct;
    }
}