package com.example.production_mes.service;

import com.example.production_mes.entity.Orders;

import java.util.List;

/**
 * (Orders)表服务接口
 *
 * @author makejava
 * @since 2020-09-16 09:09:42
 */
public interface OrdersService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Orders queryById(String id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Orders> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param orders 实例对象
     * @return 实例对象
     */
    Orders insert(Orders orders);

    /**
     * 修改数据
     *
     * @param orders 实例对象
     * @return 实例对象
     */
    Orders update(Orders orders);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(String id);

    /**
     * 首页查询订单数量
     * @return
     */
    int doingNum();
    int doneNum();

}