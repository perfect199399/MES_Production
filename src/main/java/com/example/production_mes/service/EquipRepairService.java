package com.example.production_mes.service;

import com.example.production_mes.entity.EquipRepair;

import java.util.List;

/**
 * (EquipRepair)表服务接口
 *
 * @author makejava
 * @since 2020-09-16 09:09:34
 */
public interface EquipRepairService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    EquipRepair queryById(String id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<EquipRepair> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param equipRepair 实例对象
     * @return 实例对象
     */
    EquipRepair insert(EquipRepair equipRepair);

    /**
     * 修改数据
     *
     * @param equipRepair 实例对象
     * @return 实例对象
     */
    EquipRepair update(EquipRepair equipRepair);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(String id);

    EquipRepair selectByMid(String mid);

}