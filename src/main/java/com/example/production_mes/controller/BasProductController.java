package com.example.production_mes.controller;

import com.example.production_mes.dto.Result;
import com.example.production_mes.entity.BasProduct;
import com.example.production_mes.entity.EquipFaultReport;
import com.example.production_mes.entity.EquipRepair;
import com.example.production_mes.service.BasProductService;
import com.example.production_mes.utils.IDGenerator;
import com.example.production_mes.utils.TimeUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.sql.Time;
import java.util.HashMap;
import java.util.List;

/**
 * (BasProduct)表控制层
 *
 * @author makejava
 * @since 2020-09-16 09:09:29
 */
@RestController
@RequestMapping("basProduct")
public class BasProductController {
    /**
     * 服务对象
     */
    @Resource
    private BasProductService basProductService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public BasProduct selectOne(String id) {
        return this.basProductService.queryById(id);
    }



    @GetMapping("selectAll")
    public List<BasProduct> selectAll() {

        /**
         *
         *
         * @description: 分页查询
         * @param 上界与下界
         * @return: java.util.List<com.example.production_mes.entity.BasProduct>
         * @author: weizhipeng
         * @time: 2020/9/29 上午10:01
         */
        return this.basProductService.queryAllByLimit(0,10);



    }

    @RequestMapping(value="/edit")
    public Result edit(@RequestBody HashMap<String, String> map) {

        BasProduct basProduct = new BasProduct();
        basProduct.setProductname(map.get("productname"));
        basProduct.setProductabbr(map.get("productabbr"));
        basProduct.setProductdesc(map.get("productdesc"));
        basProduct.setFirstcheck(map.get("firstcheck"));
        basProduct.setQrcode(map.get("qrcode"));
        basProduct.setManageway(map.get("manageway"));
        basProduct.setLotnumber(map.get("lotnumber"));
        basProduct.setProductunit(map.get("productunit"));
        basProduct.setProductprop(map.get("productprop"));
        basProduct.setState(map.get("state"));
        basProduct.setFlowId(map.get("flowid"));
        basProduct.setId(map.get("id"));
        basProduct.setLotnumber(map.get("lotnumber"));
        basProduct.setUpdateBy(map.get("reportPerson"));
        basProduct.setUpdateDate(TimeUtils.StringToDate(TimeUtils.NowTime()));
        basProductService.update(basProduct);
        return Result.success("修改成功");
    }

    @GetMapping("deleteById")
    public Result deleteById(String id) {

        basProductService.deleteById(id);
        return Result.success("删除成功");
    }






    @RequestMapping(value="/add")
    public Result add(@RequestBody HashMap<String, String> map) {

        BasProduct basProduct = new BasProduct();
        basProduct.setId(IDGenerator.generateUUID());

        basProduct.setProductname(map.get("productname"));
        basProduct.setProductabbr(map.get("productabbr"));
        basProduct.setProductdesc(map.get("productdesc"));
        basProduct.setFirstcheck(map.get("firstcheck"));
        basProduct.setQrcode(map.get("qrcode"));
        basProduct.setManageway(map.get("manageway"));
        basProduct.setLotnumber(map.get("lotnumber"));
        basProduct.setProductunit(map.get("productunit"));
        basProduct.setProductprop(map.get("productprop"));
        basProduct.setFlowId(map.get("flowid"));
        basProduct.setState(map.get("state"));


        basProduct.setCreateBy(map.get("creatby"));
        basProduct.setLotnumber(map.get("lotnumber"));
        basProduct.setCreateBy(map.get("reportPerson"));
        basProduct.setUpdateBy(map.get("reportPerson"));


        basProduct.setUpdateDate(TimeUtils.StringToDate(TimeUtils.NowTime()));
        basProduct.setCreateDate(TimeUtils.StringToDate(TimeUtils.NowTime()));
        basProduct.setDelFlag("0");


        basProductService.insert(basProduct);

        return Result.success("添加成功");
    }
    @GetMapping("search")
    public List<BasProduct> search(String select,String desc) {
        if (select.equals("qrcode")) {
            System.out.println("qrcode");
            System.out.println(desc);
            return basProductService.search_qrcode(desc);
        }
        else if (select.equals("name")) {
            return basProductService.search_name(desc);
        }
        else{
            return null;
        }
    }





}