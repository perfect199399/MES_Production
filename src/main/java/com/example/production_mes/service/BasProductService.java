package com.example.production_mes.service;

import com.example.production_mes.entity.BasProduct;

import java.util.List;

/**
 * (BasProduct)表服务接口
 *
 * @author makejava
 * @since 2020-09-16 09:09:28
 */
public interface BasProductService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BasProduct queryById(String id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<BasProduct> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param basProduct 实例对象
     * @return 实例对象
     */
    BasProduct insert(BasProduct basProduct);

    /**
     * 修改数据
     *
     * @param basProduct 实例对象
     * @return 实例对象
     */
    BasProduct update(BasProduct basProduct);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(String id);

    List<BasProduct> search_qrcode(String qrcode);
    List<BasProduct> search_name(String name);

}