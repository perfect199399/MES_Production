package com.example.production_mes.dao;

import com.example.production_mes.entity.TecProcess;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 工艺基础数据维护（工序）(TecProcess)表数据库访问层
 *
 * @author makejava
 * @since 2020-09-16 09:09:55
 */
public interface TecProcessDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TecProcess queryById(String id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TecProcess> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tecProcess 实例对象
     * @return 对象列表
     */
    List<TecProcess> queryAll(TecProcess tecProcess);

    /**
     * 新增数据
     *
     * @param tecProcess 实例对象
     * @return 影响行数
     */
    int insert(TecProcess tecProcess);

    /**
     * 修改数据
     *
     * @param tecProcess 实例对象
     * @return 影响行数
     */
    int update(TecProcess tecProcess);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(String id);

    /**
     * 通过主键修改数据
     * @param id
     */
    void updateById(String id);


    /**
     * 条件查询
     * @param procode
     * @return
     */
    List<TecProcess> select(String procode);
}