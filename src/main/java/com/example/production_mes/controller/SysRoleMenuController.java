package com.example.production_mes.controller;

import com.example.production_mes.entity.SysRoleMenu;
import com.example.production_mes.service.SysRoleMenuService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 角色-菜单(SysRoleMenu)表控制层
 *
 * @author makejava
 * @since 2020-09-16 09:09:51
 */
@RestController
@RequestMapping("sysRoleMenu")
public class SysRoleMenuController {
    /**
     * 服务对象
     */
    @Resource
    private SysRoleMenuService sysRoleMenuService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SysRoleMenu selectOne(String id) {
        return this.sysRoleMenuService.queryById(id);
    }

}