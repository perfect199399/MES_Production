package com.example.production_mes.dao;

import com.example.production_mes.entity.BasCellEmployee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (BasCellEmployee)表数据库访问层
 *
 * @author makejava
 * @since 2020-09-16 09:08:14
 */
public interface BasCellEmployeeDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BasCellEmployee queryById(String id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<BasCellEmployee> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param basCellEmployee 实例对象
     * @return 对象列表
     */
    List<BasCellEmployee> queryAll(BasCellEmployee basCellEmployee);

    /**
     * 新增数据
     *
     * @param basCellEmployee 实例对象
     * @return 影响行数
     */
    int insert(BasCellEmployee basCellEmployee);

    /**
     * 修改数据
     *
     * @param basCellEmployee 实例对象
     * @return 影响行数
     */
    int update(BasCellEmployee basCellEmployee);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(String id);

    List<BasCellEmployee> queryByName(int i, int i1, String employeename);
}