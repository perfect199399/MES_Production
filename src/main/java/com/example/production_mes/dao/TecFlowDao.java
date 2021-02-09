package com.example.production_mes.dao;

import com.example.production_mes.entity.TecFlow;
import com.example.production_mes.entity.TecProcess;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 工艺路由维护（流程）(TecFlow)表数据库访问层
 *
 * @author makejava
 * @since 2020-09-16 09:09:54
 */
public interface TecFlowDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TecFlow queryById(String id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TecFlow> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tecFlow 实例对象
     * @return 对象列表
     */
    List<TecFlow> queryAll(TecFlow tecFlow);

    /**
     * 新增数据
     *
     * @param tecFlow 实例对象
     * @return 影响行数
     */
    int insert(TecFlow tecFlow);

    /**
     * 修改数据
     *
     * @param tecFlow 实例对象
     * @return 影响行数
     */
    int update(TecFlow tecFlow);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(String id);

    List<TecFlow> select(String procode);


    /**
     * 通过主键修改数据
     * @param id
     */
    void updateById(String id);

}