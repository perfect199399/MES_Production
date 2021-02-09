package com.example.production_mes.service;

import com.example.production_mes.entity.BasCodeprinter;

import java.util.List;

/**
 * (BasCodeprinter)表服务接口
 *
 * @author makejava
 * @since 2020-09-16 09:08:15
 */
public interface BasCodeprinterService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BasCodeprinter queryById(String id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<BasCodeprinter> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param basCodeprinter 实例对象
     * @return 实例对象
     */
    BasCodeprinter insert(BasCodeprinter basCodeprinter);

    /**
     * 修改数据
     *
     * @param basCodeprinter 实例对象
     * @return 实例对象
     */
    BasCodeprinter update(BasCodeprinter basCodeprinter);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(String id);

}