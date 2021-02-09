package com.example.production_mes.service;

import com.example.production_mes.entity.BasWorkshop;

import java.util.List;

/**
 * (BasWorkshop)表服务接口
 *
 * @author makejava
 * @since 2020-09-16 09:09:31
 */
public interface BasWorkshopService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BasWorkshop queryById(String id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<BasWorkshop> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param basWorkshop 实例对象
     * @return 实例对象
     */
    BasWorkshop insert(BasWorkshop basWorkshop);

    /**
     * 修改数据
     *
     * @param basWorkshop 实例对象
     * @return 实例对象
     */
    BasWorkshop update(BasWorkshop basWorkshop);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(String id);

    List<BasWorkshop> queryByName(int i, int i1, String shopname);
}