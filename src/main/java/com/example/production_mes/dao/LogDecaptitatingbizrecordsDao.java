package com.example.production_mes.dao;

import com.example.production_mes.entity.LogDecaptitatingbizrecords;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (LogDecaptitatingbizrecords)表数据库访问层
 *
 * @author makejava
 * @since 2020-09-16 09:09:39
 */
public interface LogDecaptitatingbizrecordsDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    LogDecaptitatingbizrecords queryById(String id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<LogDecaptitatingbizrecords> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param logDecaptitatingbizrecords 实例对象
     * @return 对象列表
     */
    List<LogDecaptitatingbizrecords> queryAll(LogDecaptitatingbizrecords logDecaptitatingbizrecords);

    /**
     * 新增数据
     *
     * @param logDecaptitatingbizrecords 实例对象
     * @return 影响行数
     */
    int insert(LogDecaptitatingbizrecords logDecaptitatingbizrecords);

    /**
     * 修改数据
     *
     * @param logDecaptitatingbizrecords 实例对象
     * @return 影响行数
     */
    int update(LogDecaptitatingbizrecords logDecaptitatingbizrecords);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(String id);

}