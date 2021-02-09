package com.example.production_mes.dao;

import com.example.production_mes.entity.BasPad;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (BasPad)表数据库访问层
 *
 * @author makejava
 * @since 2020-09-16 09:09:27
 */
public interface BasPadDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BasPad queryById(String id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<BasPad> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param basPad 实例对象
     * @return 对象列表
     */
    List<BasPad> queryAll(BasPad basPad);

    /**
     * 新增数据
     *
     * @param basPad 实例对象
     * @return 影响行数
     */
    int insert(BasPad basPad);

    /**
     * 修改数据
     *
     * @param basPad 实例对象
     * @return 影响行数
     */
    int update(BasPad basPad);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(String id);

    void delete(String id);

    List<BasPad> query(String type, String spec, String id);
}