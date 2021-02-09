package com.example.production_mes.service;

import com.example.production_mes.entity.BasWorkcell;

import java.util.List;

/**
 * (BasWorkcell)表服务接口
 *
 * @author makejava
 * @since 2020-09-16 09:09:30
 */
public interface BasWorkcellService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BasWorkcell queryById(String id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<BasWorkcell> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param basWorkcell 实例对象
     * @return 实例对象
     */
    BasWorkcell insert(BasWorkcell basWorkcell);

    /**
     * 修改数据
     *
     * @param basWorkcell 实例对象
     * @return 实例对象
     */
    BasWorkcell update(BasWorkcell basWorkcell);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(String id);

    List<BasWorkcell> queryByName(int i, int i1, String cellname);
}