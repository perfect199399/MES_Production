package com.example.production_mes.controller;

import com.example.production_mes.dto.Result;
import com.example.production_mes.entity.BasBom;
import com.example.production_mes.entity.KpiPerformtype;
import com.example.production_mes.service.KpiPerformtypeService;
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
 * 绩效方式表(KpiPerformtype)表控制层
 *
 * @author makejava
 * @since 2020-09-16 09:09:36
 */
@RestController
@RequestMapping("kpiPerformtype")
public class KpiPerformtypeController {
    /**
     * 服务对象
     */
    @Resource
    private KpiPerformtypeService kpiPerformtypeService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public KpiPerformtype selectOne(String id) {
        return this.kpiPerformtypeService.queryById(id);
    }

    @GetMapping("selectAll")
    public List<KpiPerformtype> selectAll() {
        return this.kpiPerformtypeService.queryAllByLimit(0,100000);
    }


    @GetMapping("deleteById")
    public Result deleteById(String id) {
        kpiPerformtypeService.deleteById(id);
        return Result.success("删除成功");
    }


    @RequestMapping(value="/add")
    public Result add(@RequestBody HashMap<String, String> map) {
        KpiPerformtype kpiPerformtype = new KpiPerformtype();
        kpiPerformtype.setCreateBy(map.get("reportPerson"));
        kpiPerformtype.setCreateDate(TimeUtils.StringToDate(TimeUtils.NowTime()));
        kpiPerformtype.setDelFlag("0");
        kpiPerformtype.setId(IDGenerator.generateUUID());
        kpiPerformtype.setPerformtypename(map.get("performtypename"));
        kpiPerformtype.setPerformtypenum(Double.parseDouble(map.get("performtypenum")));
        kpiPerformtype.setPerformtypeunit(map.get("performtypeunit"));

        kpiPerformtype.setUpdateBy(map.get("reportPerson"));
        kpiPerformtype.setUpdateDate(TimeUtils.StringToDate(TimeUtils.NowTime()));

        kpiPerformtypeService.insert(kpiPerformtype);
        return Result.success("添加成功");
    }


    @RequestMapping(value="/edit")
    public Result edit(@RequestBody HashMap<String, String> map) {
        KpiPerformtype kpiPerformtype = new KpiPerformtype();
        kpiPerformtype.setId(map.get("id"));
        kpiPerformtype.setPerformtypename(map.get("performtypename"));
        kpiPerformtype.setPerformtypenum(Double.parseDouble(map.get("performtypenum")));
        kpiPerformtype.setPerformtypeunit(map.get("performtypeunit"));
        kpiPerformtype.setUpdateBy(map.get("reportPerson"));
        kpiPerformtype.setUpdateDate(TimeUtils.StringToDate(TimeUtils.NowTime()));
        kpiPerformtypeService.update(kpiPerformtype);
        return Result.success("添加成功");
    }

    @GetMapping("search")
    public List<KpiPerformtype> search(String desc) {
        System.out.println(desc);
        return this.kpiPerformtypeService.search(desc);
    }




}