package com.example.production_mes.dao;

import com.example.production_mes.entity.EquipFaultReport;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (EquipFaultReport)表数据库访问层
 *
 * @author makejava
 * @since 2020-09-16 09:09:33
 */
public interface EquipFaultReportDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    EquipFaultReport queryById(String id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<EquipFaultReport> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param equipFaultReport 实例对象
     * @return 对象列表
     */
    List<EquipFaultReport> queryAll(EquipFaultReport equipFaultReport);

    /**
     * 新增数据
     *
     * @param equipFaultReport 实例对象
     * @return 影响行数
     */
    int insert(EquipFaultReport equipFaultReport);

    /**
     * 修改数据
     *
     * @param equipFaultReport 实例对象
     * @return 影响行数
     */
    int update(EquipFaultReport equipFaultReport);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(String id);


    /**
     * 查询按钮
     * @param address
     * @param name
     * @return
     */
    List<EquipFaultReport> queryByAddress(String address, String name);

    /**
     * 条件查询
     * @param equip_type
     * @param equip_loc
     * @param status
     * @return
     */
    List<EquipFaultReport> query(String equip_type, String equip_loc, String status);

    List<EquipFaultReport> selectBy(String by);
}