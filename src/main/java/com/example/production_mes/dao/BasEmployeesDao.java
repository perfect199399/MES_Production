package com.example.production_mes.dao;

import com.example.production_mes.entity.BasEmployees;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (BasEmployees)表数据库访问层
 *
 * @author makejava
 * @since 2020-09-16 09:08:17
 */
public interface BasEmployeesDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BasEmployees queryById(String id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<BasEmployees> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param basEmployees 实例对象
     * @return 对象列表
     */
    List<BasEmployees> queryAll(BasEmployees basEmployees);

    /**
     * 新增数据
     *
     * @param basEmployees 实例对象
     * @return 影响行数
     */
    int insert(BasEmployees basEmployees);

    /**
     * 修改数据
     *
     * @param basEmployees 实例对象
     * @return 影响行数
     */
    int update(BasEmployees basEmployees);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(String id);

    List<BasEmployees> queryByName(int i, int i1, String employeename);
}