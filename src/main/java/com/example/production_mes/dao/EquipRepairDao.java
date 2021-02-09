package com.example.production_mes.dao;

import com.example.production_mes.entity.EquipRepair;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (EquipRepair)表数据库访问层
 *
 * @author makejava
 * @since 2020-09-16 09:09:34
 */
public interface EquipRepairDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    EquipRepair queryById(String id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<EquipRepair> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param equipRepair 实例对象
     * @return 对象列表
     */
    List<EquipRepair> queryAll(EquipRepair equipRepair);

    /**
     * 新增数据
     *
     * @param equipRepair 实例对象
     * @return 影响行数
     */
    int insert(EquipRepair equipRepair);

    /**
     * 修改数据
     *
     * @param equipRepair 实例对象
     * @return 影响行数
     */
    int update(EquipRepair equipRepair);

    /**
     * 更改维修状态
     * @param equipRepair
     * @return
     */
    int updateStatus(EquipRepair equipRepair);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(String id);

    /**
     * 查找维修报告
     * @param mid
     * @return
     */
    EquipRepair selectByMid(String mid);
}