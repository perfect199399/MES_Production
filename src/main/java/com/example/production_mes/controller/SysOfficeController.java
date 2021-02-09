package com.example.production_mes.controller;

import com.example.production_mes.entity.BasWorkshop;
import com.example.production_mes.entity.SysOffice;
import com.example.production_mes.service.SysOfficeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 机构表(SysOffice)表控制层
 *
 * @author makejava
 * @since 2020-09-16 09:09:49
 */
@RestController
@RequestMapping("sysOffice")
public class SysOfficeController {
    /**
     * 服务对象
     */
    @Resource
    private SysOfficeService sysOfficeService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SysOffice selectOne(String id) {
        return this.sysOfficeService.queryById(id);
    }
    @GetMapping("selectAll")
    public List<SysOffice> selectAll() {
        return this.sysOfficeService.queryAllByLimit(0,1000);
    }
}