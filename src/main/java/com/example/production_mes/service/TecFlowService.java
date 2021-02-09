package com.example.production_mes.service;

import com.example.production_mes.entity.TecFlow;
import com.example.production_mes.entity.TecProcess;

import java.util.List;

/**
 * 工艺路由维护（流程）(TecFlow)表服务接口
 *
 * @author makejava
 * @since 2020-09-16 09:09:54
 */
public interface TecFlowService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TecFlow queryById(String id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TecFlow> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tecFlow 实例对象
     * @return 实例对象
     */
    TecFlow insert(TecFlow tecFlow);

    /**
     * 修改数据
     *
     * @param tecFlow 实例对象
     * @return 实例对象
     */
    TecFlow update(TecFlow tecFlow);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(String id);

    List<TecFlow> select(String procode);

    void updateById(String id);
}