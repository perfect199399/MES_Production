package com.example.production_mes.service;

import com.example.production_mes.entity.EquipFaultReport;

import java.util.List;

/**
 * (EquipFaultReport)表服务接口
 *
 * @author makejava
 * @since 2020-09-16 09:09:33
 */
public interface EquipFaultReportService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    EquipFaultReport queryById(String id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<EquipFaultReport> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param equipFaultReport 实例对象
     * @return 实例对象
     */
    EquipFaultReport insert(EquipFaultReport equipFaultReport);

    /**
     * 修改数据
     *
     * @param equipFaultReport 实例对象
     * @return 实例对象
     */
    EquipFaultReport update(EquipFaultReport equipFaultReport);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(String id);

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