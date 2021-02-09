package com.example.production_mes.service;

import com.example.production_mes.entity.BasBomDetail;

import java.util.List;

/**
 * (BasBomDetail)表服务接口
 *
 * @author makejava
 * @since 2020-09-16 09:08:12
 */
public interface BasBomDetailService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BasBomDetail queryById(String id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<BasBomDetail> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param basBomDetail 实例对象
     * @return 实例对象
     */
    BasBomDetail insert(BasBomDetail basBomDetail);

    /**
     * 修改数据
     *
     * @param basBomDetail 实例对象
     * @return 实例对象
     */
    BasBomDetail update(BasBomDetail basBomDetail);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(String id);

}