package com.example.production_mes.controller;

import com.example.production_mes.entity.SysMenu;
import com.example.production_mes.service.SysMenuService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 菜单表(SysMenu)表控制层
 *
 * @author makejava
 * @since 2020-09-16 09:09:48
 */
@RestController
@RequestMapping("sysMenu")
public class SysMenuController {
    /**
     * 服务对象
     */
    @Resource
    private SysMenuService sysMenuService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SysMenu selectOne(String id) {
        return this.sysMenuService.queryById(id);
    }

}