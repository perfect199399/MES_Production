package com.example.production_mes.service;

import com.example.production_mes.entity.SysMdict;

import java.util.List;

/**
 * 多级字典表(SysMdict)表服务接口
 *
 * @author makejava
 * @since 2020-09-16 09:09:47
 */
public interface SysMdictService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysMdict queryById(String id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<SysMdict> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param sysMdict 实例对象
     * @return 实例对象
     */
    SysMdict insert(SysMdict sysMdict);

    /**
     * 修改数据
     *
     * @param sysMdict 实例对象
     * @return 实例对象
     */
    SysMdict update(SysMdict sysMdict);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(String id);

}