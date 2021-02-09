package com.example.production_mes.dao;

import com.example.production_mes.entity.KpiPerformtype;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 绩效方式表(KpiPerformtype)表数据库访问层
 *
 * @author makejava
 * @since 2020-09-16 09:09:36
 */
public interface KpiPerformtypeDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    KpiPerformtype queryById(String id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<KpiPerformtype> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param kpiPerformtype 实例对象
     * @return 对象列表
     */
    List<KpiPerformtype> queryAll(KpiPerformtype kpiPerformtype);

    /**
     * 新增数据
     *
     * @param kpiPerformtype 实例对象
     * @return 影响行数
     */
    int insert(KpiPerformtype kpiPerformtype);

    /**
     * 修改数据
     *
     * @param kpiPerformtype 实例对象
     * @return 影响行数
     */
    int update(KpiPerformtype kpiPerformtype);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(String id);

    List<KpiPerformtype> search(String desc);

}