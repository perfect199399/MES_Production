package com.example.production_mes.service.impl;

import com.example.production_mes.dao.OrdersDao;
import com.example.production_mes.entity.Orders;
import com.example.production_mes.service.OrdersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Orders)表服务实现类
 *
 * @author makejava
 * @since 2020-09-16 09:09:42
 */
@Service("ordersService")
public class OrdersServiceImpl implements OrdersService {
    @Resource
    private OrdersDao ordersDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Orders queryById(String id) {
        return this.ordersDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Orders> queryAllByLimit(int offset, int limit) {
        return this.ordersDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param orders 实例对象
     * @return 实例对象
     */
    @Override
    public Orders insert(Orders orders) {
        this.ordersDao.insert(orders);
        return orders;
    }

    /**
     * 修改数据
     *
     * @param orders 实例对象
     * @return 实例对象
     */
    @Override
    public Orders update(Orders orders) {
        this.ordersDao.update(orders);
        return this.queryById(orders.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.ordersDao.deleteById(id) > 0;
    }


    /**
     * 首页查询订单
     * @return
     */
    @Override
    public int doingNum() {
        return this.ordersDao.doingNum();
    }

    @Override
    public int doneNum() {
        return this.ordersDao.doneNum();
    }
}