package com.example.production_mes.controller;

import com.example.production_mes.entity.SysRoleOffice;
import com.example.production_mes.service.SysRoleOfficeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 角色-机构(SysRoleOffice)表控制层
 *
 * @author makejava
 * @since 2020-09-16 09:09:51
 */
@RestController
@RequestMapping("sysRoleOffice")
public class SysRoleOfficeController {
    /**
     * 服务对象
     */
    @Resource
    private SysRoleOfficeService sysRoleOfficeService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SysRoleOffice selectOne(String id) {
        return this.sysRoleOfficeService.queryById(id);
    }

}