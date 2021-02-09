package com.example.production_mes.service;

import com.example.production_mes.entity.QcViolaction;

import java.util.List;

/**
 * (QcViolaction)表服务接口
 *
 * @author makejava
 * @since 2020-09-16 09:09:44
 */
public interface QcViolactionService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    QcViolaction queryById(String id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<QcViolaction> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param qcViolaction 实例对象
     * @return 实例对象
     */
    QcViolaction insert(QcViolaction qcViolaction);

    /**
     * 修改数据
     *
     * @param qcViolaction 实例对象
     * @return 实例对象
     */
    QcViolaction update(QcViolaction qcViolaction);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(String id);

    /**
     * 通过工站名查询数据
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @param stationname 工站名
     * @return 对象列表
     */
    List<QcViolaction> queryByName(int offset, int limit, String stationname);

    /**
     * 通过id删除指定数据
     * @param id
     */
    void updateById(String id);
}