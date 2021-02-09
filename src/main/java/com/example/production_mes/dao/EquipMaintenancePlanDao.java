package com.example.production_mes.dao;

import com.example.production_mes.entity.EquipMaintenancePlan;
import com.example.production_mes.entity.EquipReport;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (EquipMaintenancePlan)表数据库访问层
 *
 * @author makejava
 * @since 2020-09-16 09:09:34
 */
public interface EquipMaintenancePlanDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    EquipMaintenancePlan queryById(String id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<EquipMaintenancePlan> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param equipMaintenancePlan 实例对象
     * @return 对象列表
     */
    List<EquipMaintenancePlan> queryAll(EquipMaintenancePlan equipMaintenancePlan);

    /**
     * 新增数据
     *
     * @param equipMaintenancePlan 实例对象
     * @return 影响行数
     */
    int insert(EquipMaintenancePlan equipMaintenancePlan);

    /**
     * 修改数据
     *
     * @param equipMaintenancePlan 实例对象
     * @return 影响行数
     */
    int update(EquipMaintenancePlan equipMaintenancePlan);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(String id);

    /**
     * 置1删除
     * @param id
     */
    void delete(String id);

    /**
     * 条件查询
     * @param equip_type
     * @return
     */

    List<EquipMaintenancePlan> selectByType(String equip_type);


    List<EquipMaintenancePlan> selectBy(String by);
}