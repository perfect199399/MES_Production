package com.example.production_mes.controller;

import com.example.production_mes.entity.SysUserRole;
import com.example.production_mes.service.SysUserRoleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 用户-角色(SysUserRole)表控制层
 *
 * @author makejava
 * @since 2020-09-16 09:09:53
 */
@RestController
@RequestMapping("sysUserRole")
public class SysUserRoleController {
    /**
     * 服务对象
     */
    @Resource
    private SysUserRoleService sysUserRoleService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SysUserRole selectOne(String id) {
        return this.sysUserRoleService.queryById(id);
    }

}