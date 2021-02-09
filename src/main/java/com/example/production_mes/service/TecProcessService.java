package com.example.production_mes.service;

import com.example.production_mes.entity.TecProcess;

import java.util.List;

/**
 * 工艺基础数据维护（工序）(TecProcess)表服务接口
 *
 * @author makejava
 * @since 2020-09-16 09:09:55
 */
public interface TecProcessService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TecProcess queryById(String id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TecProcess> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tecProcess 实例对象
     * @return 实例对象
     */
    TecProcess insert(TecProcess tecProcess);

    /**
     * 修改数据
     *
     * @param tecProcess 实例对象
     * @return 实例对象
     */
    TecProcess update(TecProcess tecProcess);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(String id);

    void updateById(String id);

    List<TecProcess> select(String procode);
}