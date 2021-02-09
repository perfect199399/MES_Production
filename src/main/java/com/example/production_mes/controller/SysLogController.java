package com.example.production_mes.controller;

import com.example.production_mes.entity.SysLog;
import com.example.production_mes.service.SysLogService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 日志表(SysLog)表控制层
 *
 * @author makejava
 * @since 2020-09-16 09:09:47
 */
@RestController
@RequestMapping("sysLog")
public class SysLogController {
    /**
     * 服务对象
     */
    @Resource
    private SysLogService sysLogService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SysLog selectOne(String id) {
        return this.sysLogService.queryById(id);
    }

}