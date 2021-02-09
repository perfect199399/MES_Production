package com.example.production_mes.controller;

import com.example.production_mes.entity.LogChopingbizrecords;
import com.example.production_mes.service.LogChopingbizrecordsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * (LogChopingbizrecords)表控制层
 *
 * @author makejava
 * @since 2020-09-16 09:09:37
 */
@RestController
@RequestMapping("logChopingbizrecords")
public class LogChopingbizrecordsController {
    /**
     * 服务对象
     */
    @Resource
    private LogChopingbizrecordsService logChopingbizrecordsService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public LogChopingbizrecords selectOne(String id) {
        return this.logChopingbizrecordsService.queryById(id);
    }


    @GetMapping("selectAll")
    public List<LogChopingbizrecords> selectAll(String id) {
        return this.logChopingbizrecordsService.queryAllByLimit(0,100000);
    }


    @GetMapping("search")
    public List<LogChopingbizrecords> search(String desc) {
        return this.logChopingbizrecordsService.search(desc);
    }

}