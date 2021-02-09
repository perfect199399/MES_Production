package com.example.production_mes.controller;

import com.example.production_mes.entity.LogDecaptitatingbizrecords;
import com.example.production_mes.entity.LogRemovefishbonebizrecords;
import com.example.production_mes.service.LogRemovefishbonebizrecordsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * (LogRemovefishbonebizrecords)表控制层
 *
 * @author makejava
 * @since 2020-09-16 09:09:40
 */
@RestController
@RequestMapping("logRemovefishbonebizrecords")
public class LogRemovefishbonebizrecordsController {
    /**
     * 服务对象
     */
    @Resource
    private LogRemovefishbonebizrecordsService logRemovefishbonebizrecordsService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public LogRemovefishbonebizrecords selectOne(String id) {
        return this.logRemovefishbonebizrecordsService.queryById(id);
    }


    @GetMapping("selectAll")
    public List<LogRemovefishbonebizrecords> selectAll(String id) {
        return this.logRemovefishbonebizrecordsService.queryAllByLimit(0,100000);
    }

}