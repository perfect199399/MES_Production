package com.example.production_mes.service;

import com.example.production_mes.entity.KpiPerformStation;

import java.util.List;

/**
 * 绩效参数与工站关系表(KpiPerformStation)表服务接口
 *
 * @author makejava
 * @since 2020-09-16 09:09:35
 */
public interface KpiPerformStationService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    KpiPerformStation queryById(String id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<KpiPerformStation> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param kpiPerformStation 实例对象
     * @return 实例对象
     */
    KpiPerformStation insert(KpiPerformStation kpiPerformStation);

    /**
     * 修改数据
     *
     * @param kpiPerformStation 实例对象
     * @return 实例对象
     */
    KpiPerformStation update(KpiPerformStation kpiPerformStation);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(String id);

}