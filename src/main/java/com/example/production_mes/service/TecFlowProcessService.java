package com.example.production_mes.service;

import com.example.production_mes.entity.TecFlowProcess;

import java.util.List;

/**
 * 工艺路由与工序关系(TecFlowProcess)表服务接口
 *
 * @author makejava
 * @since 2020-09-16 09:09:54
 */
public interface TecFlowProcessService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TecFlowProcess queryById(String id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TecFlowProcess> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tecFlowProcess 实例对象
     * @return 实例对象
     */
    TecFlowProcess insert(TecFlowProcess tecFlowProcess);

    /**
     * 修改数据
     *
     * @param tecFlowProcess 实例对象
     * @return 实例对象
     */
    TecFlowProcess update(TecFlowProcess tecFlowProcess);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(String id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @param flowname 所属流程名
     * @return 对象列表
     */
    List<TecFlowProcess> queryByName(int offset, int limit, String flowname);

    /**
     * 通过id删除指定数据
     * @param id
     * @return
     */
    void updateById(String id);
}