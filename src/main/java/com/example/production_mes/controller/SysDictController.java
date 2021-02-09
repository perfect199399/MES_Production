package com.example.production_mes.controller;

import com.example.production_mes.entity.SysDict;
import com.example.production_mes.service.SysDictService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 字典表(SysDict)表控制层
 *
 * @author makejava
 * @since 2020-09-16 09:09:46
 */
@RestController
@RequestMapping("sysDict")
public class SysDictController {
    /**
     * 服务对象
     */
    @Resource
    private SysDictService sysDictService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SysDict selectOne(String id) {
        return this.sysDictService.queryById(id);
    }


    @GetMapping("selectBytype")
    public List<SysDict> selectBytype(String type) {
        return this.sysDictService.queryBytype(type);
    }


}