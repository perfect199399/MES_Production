package com.example.production_mes.controller;

import com.example.production_mes.entity.SysArea;
import com.example.production_mes.service.SysAreaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 区域表(SysArea)表控制层
 *
 * @author makejava
 * @since 2020-09-16 09:09:45
 */
@RestController
@RequestMapping("sysArea")
public class SysAreaController {
    /**
     * 服务对象
     */
    @Resource
    private SysAreaService sysAreaService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SysArea selectOne(String id) {
        return this.sysAreaService.queryById(id);
    }

}