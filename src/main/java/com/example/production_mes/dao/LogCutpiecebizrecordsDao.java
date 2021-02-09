package com.example.production_mes.dao;

import com.example.production_mes.entity.LogCutpiecebizrecords;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (LogCutpiecebizrecords)表数据库访问层
 *
 * @author makejava
 * @since 2020-09-16 09:09:37
 */
public interface LogCutpiecebizrecordsDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    LogCutpiecebizrecords queryById(String id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<LogCutpiecebizrecords> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param logCutpiecebizrecords 实例对象
     * @return 对象列表
     */
    List<LogCutpiecebizrecords> queryAll(LogCutpiecebizrecords logCutpiecebizrecords);

    /**
     * 新增数据
     *
     * @param logCutpiecebizrecords 实例对象
     * @return 影响行数
     */
    int insert(LogCutpiecebizrecords logCutpiecebizrecords);

    /**
     * 修改数据
     *
     * @param logCutpiecebizrecords 实例对象
     * @return 影响行数
     */
    int update(LogCutpiecebizrecords logCutpiecebizrecords);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(String id);

}