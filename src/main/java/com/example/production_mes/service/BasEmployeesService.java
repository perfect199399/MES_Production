package com.example.production_mes.service;

import com.example.production_mes.entity.BasEmployees;

import java.util.List;

/**
 * (BasEmployees)表服务接口
 *
 * @author makejava
 * @since 2020-09-16 09:08:17
 */
public interface BasEmployeesService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BasEmployees queryById(String id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<BasEmployees> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param basEmployees 实例对象
     * @return 实例对象
     */
    BasEmployees insert(BasEmployees basEmployees);

    /**
     * 修改数据
     *
     * @param basEmployees 实例对象
     * @return 实例对象
     */
    BasEmployees update(BasEmployees basEmployees);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(String id);

    List<BasEmployees> queryByName(int i, int i1, String employeename);
}