package com.example.production_mes.service;

import com.example.production_mes.entity.TecProcessStation;

import java.util.List;

/**
 * 工序与工站关系(TecProcessStation)表服务接口
 *
 * @author makejava
 * @since 2020-09-16 09:09:56
 */
public interface TecProcessStationService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TecProcessStation queryById(String id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TecProcessStation> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tecProcessStation 实例对象
     * @return 实例对象
     */
    TecProcessStation insert(TecProcessStation tecProcessStation);

    /**
     * 修改数据
     *
     * @param tecProcessStation 实例对象
     * @return 实例对象
     */
    TecProcessStation update(TecProcessStation tecProcessStation);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(String id);

    /**
     * 通过工序查询所有数据
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @param proname 工序
     * @return
     */
    List<TecProcessStation> queryByName(int offset, int limit, String proname);

    /**
     * 通过id删除指定数据
     * @param id
     * @return
     */
    void updateById(String id);
}