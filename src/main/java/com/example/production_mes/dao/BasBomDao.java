package com.example.production_mes.dao;

import com.example.production_mes.entity.BasBom;
import com.example.production_mes.entity.BasBomList;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 物料清单(BasBom)表数据库访问层
 *
 * @author makejava
 * @since 2020-09-16 09:08:12
 */
public interface BasBomDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BasBom queryById(String id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<BasBom> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param basBom 实例对象
     * @return 对象列表
     */
    List<BasBom> queryAll(BasBom basBom);

    /**
     * 新增数据
     *
     * @param basBom 实例对象
     * @return 影响行数
     */
    int insert(BasBom basBom);

    /**
     * 修改数据
     *
     * @param basBom 实例对象
     * @return 影响行数
     */
    int update(BasBom basBom);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(String id);

    List<BasBomList> queryAll();

    List<BasBom> queryname(String name);

}