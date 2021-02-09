package com.example.production_mes.dao;

import com.example.production_mes.entity.BasCodeprinter;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (BasCodeprinter)表数据库访问层
 *
 * @author makejava
 * @since 2020-09-16 09:08:15
 */
public interface BasCodeprinterDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BasCodeprinter queryById(String id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<BasCodeprinter> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param basCodeprinter 实例对象
     * @return 对象列表
     */
    List<BasCodeprinter> queryAll(BasCodeprinter basCodeprinter);

    /**
     * 新增数据
     *
     * @param basCodeprinter 实例对象
     * @return 影响行数
     */
    int insert(BasCodeprinter basCodeprinter);

    /**
     * 修改数据
     *
     * @param basCodeprinter 实例对象
     * @return 影响行数
     */
    int update(BasCodeprinter basCodeprinter);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(String id);

}