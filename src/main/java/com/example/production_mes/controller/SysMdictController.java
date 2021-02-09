package com.example.production_mes.controller;

import com.example.production_mes.entity.SysMdict;
import com.example.production_mes.service.SysMdictService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 多级字典表(SysMdict)表控制层
 *
 * @author makejava
 * @since 2020-09-16 09:09:47
 */
@RestController
@RequestMapping("sysMdict")
public class SysMdictController {
    /**
     * 服务对象
     */
    @Resource
    private SysMdictService sysMdictService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SysMdict selectOne(String id) {
        return this.sysMdictService.queryById(id);
    }

}