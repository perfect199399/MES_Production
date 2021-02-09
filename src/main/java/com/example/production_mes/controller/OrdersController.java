package com.example.production_mes.controller;

import com.example.production_mes.dto.Result;
import com.example.production_mes.entity.EquipRepair;
import com.example.production_mes.entity.Orders;
import com.example.production_mes.service.OrdersService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Orders)表控制层
 *
 * @author makejava
 * @since 2020-09-16 09:09:42
 */
@RestController
@RequestMapping("orders")
public class OrdersController {
    /**
     * 服务对象
     */
    @Resource
    private OrdersService ordersService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Orders selectOne(String id) {
        return this.ordersService.queryById(id);
    }

    @GetMapping("doingNum")
    public Result doingNum() {
        return Result.success("进行订单",this.ordersService.doingNum());
    }

    @GetMapping("doneNum")
    public Result doneNum() {
        return Result.success("结束订单",this.ordersService.doneNum());
    }

    @GetMapping("selectAll")
    public List<Orders> selectAll() {
        return this.ordersService.queryAllByLimit(0,10);
    }
}