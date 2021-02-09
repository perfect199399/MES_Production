package com.example.production_mes.service;

import com.example.production_mes.entity.LogCutpiecequalitytestingrecords;

import java.util.List;

/**
 * (LogCutpiecequalitytestingrecords)表服务接口
 *
 * @author makejava
 * @since 2020-09-16 09:09:38
 */
public interface LogCutpiecequalitytestingrecordsService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    LogCutpiecequalitytestingrecords queryById(String id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<LogCutpiecequalitytestingrecords> queryAllByLimit(int offset, int limit,String startTime, String endTime);

    /**
     * 新增数据
     *
     * @param logCutpiecequalitytestingrecords 实例对象
     * @return 实例对象
     */
    LogCutpiecequalitytestingrecords insert(LogCutpiecequalitytestingrecords logCutpiecequalitytestingrecords);

    /**
     * 修改数据
     *
     * @param logCutpiecequalitytestingrecords 实例对象
     * @return 实例对象
     */
    LogCutpiecequalitytestingrecords update(LogCutpiecequalitytestingrecords logCutpiecequalitytestingrecords);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(String id);

}