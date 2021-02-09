package com.example.production_mes.dao;

import com.example.production_mes.entity.LogCutpiecequalitytestingrecords;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (LogCutpiecequalitytestingrecords)表数据库访问层
 *
 * @author makejava
 * @since 2020-09-16 09:09:38
 */
public interface LogCutpiecequalitytestingrecordsDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    LogCutpiecequalitytestingrecords queryById(String id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<LogCutpiecequalitytestingrecords> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit,String startTime, String endTime);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param logCutpiecequalitytestingrecords 实例对象
     * @return 对象列表
     */
    List<LogCutpiecequalitytestingrecords> queryAll(LogCutpiecequalitytestingrecords logCutpiecequalitytestingrecords);

    /**
     * 新增数据
     *
     * @param logCutpiecequalitytestingrecords 实例对象
     * @return 影响行数
     */
    int insert(LogCutpiecequalitytestingrecords logCutpiecequalitytestingrecords);

    /**
     * 修改数据
     *
     * @param logCutpiecequalitytestingrecords 实例对象
     * @return 影响行数
     */
    int update(LogCutpiecequalitytestingrecords logCutpiecequalitytestingrecords);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(String id);

}