package com.example.production_mes.controller;

import com.example.production_mes.entity.LogCutpiecequalitytestingrecords;
import com.example.production_mes.entity.LogDecaptitatingbizrecords;
import com.example.production_mes.service.LogDecaptitatingbizrecordsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * (LogDecaptitatingbizrecords)表控制层
 *
 * @author makejava
 * @since 2020-09-16 09:09:39
 */
@RestController
@RequestMapping("logDecaptitatingbizrecords")
public class LogDecaptitatingbizrecordsController {
    /**
     * 服务对象
     */
    @Resource
    private LogDecaptitatingbizrecordsService logDecaptitatingbizrecordsService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public LogDecaptitatingbizrecords selectOne(String id) {
        return this.logDecaptitatingbizrecordsService.queryById(id);
    }

    @GetMapping("selectAll")
    public List<LogDecaptitatingbizrecords> selectAll(String id) {
        return this.logDecaptitatingbizrecordsService.queryAllByLimit(0,100000);
    }

}