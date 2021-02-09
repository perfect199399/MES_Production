package com.example.production_mes.service;

import com.example.production_mes.entity.EquipMaintenancePlan;
import com.example.production_mes.entity.EquipReport;

import java.util.List;

/**
 * (EquipMaintenancePlan)表服务接口
 *
 * @author makejava
 * @since 2020-09-16 09:09:34
 */
public interface EquipMaintenancePlanService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    EquipMaintenancePlan queryById(String id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<EquipMaintenancePlan> queryAllByLimit(int offset, int limit);

    /**
     * 条件查询
     * @param equip_type
     * @return
     */

    List<EquipMaintenancePlan> selectByType(String equip_type);

    /**
     * 新增数据
     *
     * @param equipMaintenancePlan 实例对象
     * @return 实例对象
     */
    EquipMaintenancePlan insert(EquipMaintenancePlan equipMaintenancePlan);

    /**
     * 修改数据
     *
     * @param equipMaintenancePlan 实例对象
     * @return 实例对象
     */
    EquipMaintenancePlan update(EquipMaintenancePlan equipMaintenancePlan);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(String id);

    /**
     * flag置为1
     * @param id
     */
    void delete(String id);

    List<EquipMaintenancePlan> selectBy(String by);
}