package com.example.production_mes.service;

import com.example.production_mes.entity.BasIphoto;

import java.util.List;

/**
 * (BasIphoto)表服务接口
 *
 * @author makejava
 * @since 2020-09-16 09:09:26
 */
public interface BasIphotoService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BasIphoto queryById(String id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<BasIphoto> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param basIphoto 实例对象
     * @return 实例对象
     */
    BasIphoto insert(BasIphoto basIphoto);

    /**
     * 修改数据
     *
     * @param basIphoto 实例对象
     * @return 实例对象
     */
    BasIphoto update(BasIphoto basIphoto);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(String id);

}