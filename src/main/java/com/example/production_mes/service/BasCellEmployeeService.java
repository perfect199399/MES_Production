package com.example.production_mes.service;

import com.example.production_mes.entity.BasCellEmployee;

import java.util.List;

/**
 * (BasCellEmployee)表服务接口
 *
 * @author makejava
 * @since 2020-09-16 09:08:14
 */
public interface BasCellEmployeeService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BasCellEmployee queryById(String id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<BasCellEmployee> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param basCellEmployee 实例对象
     * @return 实例对象
     */
    BasCellEmployee insert(BasCellEmployee basCellEmployee);

    /**
     * 修改数据
     *
     * @param basCellEmployee 实例对象
     * @return 实例对象
     */
    BasCellEmployee update(BasCellEmployee basCellEmployee);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(String id);

    List<BasCellEmployee> queryByName(int i, int i1, String employeename);
}