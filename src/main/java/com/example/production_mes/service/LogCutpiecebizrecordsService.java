package com.example.production_mes.service;

import com.example.production_mes.entity.LogCutpiecebizrecords;

import java.util.List;

/**
 * (LogCutpiecebizrecords)表服务接口
 *
 * @author makejava
 * @since 2020-09-16 09:09:37
 */
public interface LogCutpiecebizrecordsService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    LogCutpiecebizrecords queryById(String id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<LogCutpiecebizrecords> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param logCutpiecebizrecords 实例对象
     * @return 实例对象
     */
    LogCutpiecebizrecords insert(LogCutpiecebizrecords logCutpiecebizrecords);

    /**
     * 修改数据
     *
     * @param logCutpiecebizrecords 实例对象
     * @return 实例对象
     */
    LogCutpiecebizrecords update(LogCutpiecebizrecords logCutpiecebizrecords);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(String id);

}