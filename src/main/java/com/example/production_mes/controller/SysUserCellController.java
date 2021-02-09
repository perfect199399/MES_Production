package com.example.production_mes.controller;

import com.example.production_mes.entity.SysUserCell;
import com.example.production_mes.service.SysUserCellService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (SysUserCell)表控制层
 *
 * @author makejava
 * @since 2020-09-16 09:09:52
 */
@RestController
@RequestMapping("sysUserCell")
public class SysUserCellController {
    /**
     * 服务对象
     */
    @Resource
    private SysUserCellService sysUserCellService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SysUserCell selectOne(String id) {
        return this.sysUserCellService.queryById(id);
    }

}