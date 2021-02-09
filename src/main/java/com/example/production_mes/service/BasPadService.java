package com.example.production_mes.service;

import com.example.production_mes.entity.BasPad;

import java.util.List;

/**
 * (BasPad)表服务接口
 *
 * @author makejava
 * @since 2020-09-16 09:09:27
 */
public interface BasPadService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BasPad queryById(String id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<BasPad> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param basPad 实例对象
     * @return 实例对象
     */
    BasPad insert(BasPad basPad);

    /**
     * 修改数据
     *
     * @param basPad 实例对象
     * @return 实例对象
     */
    BasPad update(BasPad basPad);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(String id);


    void delete(String id);

    List<BasPad> query(String type, String spec, String id);
}