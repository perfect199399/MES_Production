package com.example.production_mes.service;

import com.example.production_mes.entity.BasWorkstationinfos;

import java.util.List;

/**
 * (BasWorkstationinfos)表服务接口
 *
 * @author makejava
 * @since 2020-09-16 09:09:32
 */
public interface BasWorkstationinfosService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BasWorkstationinfos queryById(String id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<BasWorkstationinfos> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param basWorkstationinfos 实例对象
     * @return 实例对象
     */
    BasWorkstationinfos insert(BasWorkstationinfos basWorkstationinfos);

    /**
     * 修改数据
     *
     * @param basWorkstationinfos 实例对象
     * @return 实例对象
     */
    BasWorkstationinfos update(BasWorkstationinfos basWorkstationinfos);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(String id);

    List<BasWorkstationinfos> queryByName(int i, int i1, String stationname);
}