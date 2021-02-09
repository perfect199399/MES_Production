package com.example.production_mes.service;

import com.example.production_mes.entity.KpiPerformtype;

import java.util.List;

/**
 * 绩效方式表(KpiPerformtype)表服务接口
 *
 * @author makejava
 * @since 2020-09-16 09:09:36
 */
public interface KpiPerformtypeService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    KpiPerformtype queryById(String id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<KpiPerformtype> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param kpiPerformtype 实例对象
     * @return 实例对象
     */
    KpiPerformtype insert(KpiPerformtype kpiPerformtype);

    /**
     * 修改数据
     *
     * @param kpiPerformtype 实例对象
     * @return 实例对象
     */
    KpiPerformtype update(KpiPerformtype kpiPerformtype);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(String id);

    List<KpiPerformtype>search(String desc);

}