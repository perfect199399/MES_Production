package com.example.production_mes.controller;

import com.example.production_mes.dto.Result;
import com.example.production_mes.entity.BasBom;
import com.example.production_mes.entity.BasBomList;
import com.example.production_mes.service.BasBomService;
import com.example.production_mes.utils.IDGenerator;
import com.example.production_mes.utils.TimeUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

/**
 * 物料清单(BasBom)表控制层
 *
 * @author makejava
 * @since 2020-09-16 09:08:12
 */
@RestController
@RequestMapping("basBom")
public class BasBomController {
    /**
     * 服务对象
     */
    @Resource
    private BasBomService basBomService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public BasBom selectOne(String id) {
        return this.basBomService.queryById(id);
    }


    @GetMapping("selectname")
    public List<BasBom> selectname(String name) {
        System.out.println("Hello");
        return basBomService.queryname(name);
    }




    @GetMapping("selectAll")
    public List<BasBom> selectAll() {
        return this.basBomService.queryAllByLimit(0,100000);
    }


    @RequestMapping(value="/edit")
    public Result edit(@RequestBody HashMap<String, String> map) {
        BasBom basBom = new BasBom();

        basBom.setId(map.get("id"));
        basBom.setBomname(map.get("bomname"));
        basBom.setBomversion(map.get("bomversion"));

        basBom.setStatus(map.get("status"));
        basBom.setUpdateBy(map.get("reportPerson"));
        basBom.setUpdateDate(TimeUtils.StringToDate(TimeUtils.NowTime()));
        basBom.setCreateBy(map.get("reportPerson"));
        basBom.setCreateDate(TimeUtils.StringToDate(TimeUtils.NowTime()));
        basBom.setDelFlag("0");

        basBomService.update(basBom);


        return Result.success("修改成功");
    }

    @GetMapping("deleteById")
    public Result deleteById(String id) {
        BasBom basBom = new BasBom();
        basBom.setId(id);
        basBomService.deleteById(id);
        return Result.success("删除成功");
    }

    @RequestMapping(value="/add")
    public Result add(@RequestBody HashMap<String, String> map) {

        BasBom basBom = new BasBom();
        basBom.setId(IDGenerator.generateUUID());
        basBom.setCreateBy(map.get("reportPerson"));
        basBom.setCreateDate(TimeUtils.StringToDate(TimeUtils.NowTime()));
        basBom.setBomname(map.get("bomname"));
        basBom.setBomversion(map.get("bomversion"));
        basBom.setProductId(map.get("productid"));
        basBom.setStatus(map.get("status"));
        basBom.setUpdateBy(map.get("reportPerson"));
        basBom.setUpdateDate(TimeUtils.StringToDate(TimeUtils.NowTime()));
        basBom.setDelFlag("0");
        basBom.setProductId("111");
        basBomService.insert(basBom);
        return Result.success("添加成功");
    }




}