package com.example.production_mes.controller;

import com.example.production_mes.entity.KpiPerformStation;
import com.example.production_mes.service.KpiPerformStationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 绩效参数与工站关系表(KpiPerformStation)表控制层
 *
 * @author makejava
 * @since 2020-09-16 09:09:35
 */
@RestController
@RequestMapping("kpiPerformStation")
public class KpiPerformStationController {
    /**
     * 服务对象
     */
    @Resource
    private KpiPerformStationService kpiPerformStationService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public KpiPerformStation selectOne(String id) {
        return this.kpiPerformStationService.queryById(id);
    }

}