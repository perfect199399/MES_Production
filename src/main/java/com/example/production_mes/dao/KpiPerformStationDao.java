package com.example.production_mes.dao;

import com.example.production_mes.entity.KpiPerformStation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 绩效参数与工站关系表(KpiPerformStation)表数据库访问层
 *
 * @author makejava
 * @since 2020-09-16 09:09:35
 */
public interface KpiPerformStationDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    KpiPerformStation queryById(String id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<KpiPerformStation> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param kpiPerformStation 实例对象
     * @return 对象列表
     */
    List<KpiPerformStation> queryAll(KpiPerformStation kpiPerformStation);

    /**
     * 新增数据
     *
     * @param kpiPerformStation 实例对象
     * @return 影响行数
     */
    int insert(KpiPerformStation kpiPerformStation);

    /**
     * 修改数据
     *
     * @param kpiPerformStation 实例对象
     * @return 影响行数
     */
    int update(KpiPerformStation kpiPerformStation);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(String id);

}