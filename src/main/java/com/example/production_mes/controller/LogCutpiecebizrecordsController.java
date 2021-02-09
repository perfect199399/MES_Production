package com.example.production_mes.controller;

import com.example.production_mes.entity.LogChopingbizrecords;
import com.example.production_mes.entity.LogCutpiecebizrecords;
import com.example.production_mes.service.LogCutpiecebizrecordsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * (LogCutpiecebizrecords)表控制层
 *
 * @author makejava
 * @since 2020-09-16 09:09:38
 */
@RestController
@RequestMapping("logCutpiecebizrecords")
public class LogCutpiecebizrecordsController {
    /**
     * 服务对象
     */
    @Resource
    private LogCutpiecebizrecordsService logCutpiecebizrecordsService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public LogCutpiecebizrecords selectOne(String id) {
        return this.logCutpiecebizrecordsService.queryById(id);
    }



    @GetMapping("selectAll")
    public List<LogCutpiecebizrecords> selectAll(String id) {
        return this.logCutpiecebizrecordsService.queryAllByLimit(0,100000);
    }
}