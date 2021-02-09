package com.example.production_mes.controller;

import com.example.production_mes.entity.SysRole;
import com.example.production_mes.service.SysRoleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 角色表(SysRole)表控制层
 *
 * @author makejava
 * @since 2020-09-16 09:09:50
 */
@RestController
@RequestMapping("sysRole")
public class SysRoleController {
    /**
     * 服务对象
     */
    @Resource
    private SysRoleService sysRoleService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SysRole selectOne(String id) {
        return this.sysRoleService.queryById(id);
    }

}