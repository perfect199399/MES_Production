package com.example.production_mes.service;

import com.example.production_mes.entity.LogDecaptitatingbizrecords;

import java.util.List;

/**
 * (LogDecaptitatingbizrecords)表服务接口
 *
 * @author makejava
 * @since 2020-09-16 09:09:39
 */
public interface LogDecaptitatingbizrecordsService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    LogDecaptitatingbizrecords queryById(String id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<LogDecaptitatingbizrecords> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param logDecaptitatingbizrecords 实例对象
     * @return 实例对象
     */
    LogDecaptitatingbizrecords insert(LogDecaptitatingbizrecords logDecaptitatingbizrecords);

    /**
     * 修改数据
     *
     * @param logDecaptitatingbizrecords 实例对象
     * @return 实例对象
     */
    LogDecaptitatingbizrecords update(LogDecaptitatingbizrecords logDecaptitatingbizrecords);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(String id);

}