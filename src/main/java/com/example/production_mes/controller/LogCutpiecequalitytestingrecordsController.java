package com.example.production_mes.controller;

import com.example.production_mes.entity.LogChopingbizrecords;
import com.example.production_mes.entity.LogCutpiecequalitytestingrecords;
import com.example.production_mes.entity.QcInperfections;
import com.example.production_mes.service.LogCutpiecequalitytestingrecordsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static com.example.production_mes.utils.TimeUtils.StringToDate;

/**
 * (LogCutpiecequalitytestingrecords)表控制层
 *
 * @author makejava
 * @since 2020-09-16 09:09:38
 */
@RestController
@RequestMapping("logCutpiecequalitytestingrecords")
public class LogCutpiecequalitytestingrecordsController {
    /**
     * 服务对象
     */
    @Resource
    private LogCutpiecequalitytestingrecordsService logCutpiecequalitytestingrecordsService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public LogCutpiecequalitytestingrecords selectOne(String id) {
        return this.logCutpiecequalitytestingrecordsService.queryById(id);
    }
    /**
     * 查询所有数据
     */
    @GetMapping("selectAll")
    public List<List<String>> selectAll(String startTime,String endTime) {
        System.out.println(startTime);
        System.out.println(endTime);
        List<LogCutpiecequalitytestingrecords> list = this.logCutpiecequalitytestingrecordsService.queryAllByLimit(0,1000,startTime,endTime);
        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();
        for (LogCutpiecequalitytestingrecords logCutpiecequalitytestingrecords:list) {
            list1.add(logCutpiecequalitytestingrecords.getEmployeename());
            list2.add(logCutpiecequalitytestingrecords.getYield());
        }
        List<List<String>> result = new LinkedList<>();
        result.add(list1);
        result.add(list2);
        return result;
    }

}