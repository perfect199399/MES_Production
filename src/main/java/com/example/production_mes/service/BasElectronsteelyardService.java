package com.example.production_mes.service;

import com.example.production_mes.entity.BasElectronsteelyard;

import java.util.List;

/**
 * (BasElectronsteelyard)表服务接口
 *
 * @author makejava
 * @since 2020-09-16 09:08:16
 */
public interface BasElectronsteelyardService {

    /**
     * 通过ID查询单条数据
     *
     * @param qrcode 主键
     * @return 实例对象
     */
    BasElectronsteelyard queryById(String qrcode);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<BasElectronsteelyard> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param basElectronsteelyard 实例对象
     * @return 实例对象
     */
    BasElectronsteelyard insert(BasElectronsteelyard basElectronsteelyard);

    /**
     * 修改数据
     *
     * @param basElectronsteelyard 实例对象
     * @return 实例对象
     */
    BasElectronsteelyard update(BasElectronsteelyard basElectronsteelyard);

    /**
     * 通过主键删除数据
     *
     * @param qrcode 主键
     * @return 是否成功
     */
    boolean deleteById(String qrcode);

}