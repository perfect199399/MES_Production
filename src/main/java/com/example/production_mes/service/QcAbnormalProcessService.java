package com.example.production_mes.service;

import com.example.production_mes.entity.QcAbnormalProcess;

import java.util.List;

/**
 * 异常工序检测(QcAbnormalProcess)表服务接口
 *
 * @author makejava
 * @since 2020-09-16 09:09:43
 */
public interface QcAbnormalProcessService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    QcAbnormalProcess queryById(String id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<QcAbnormalProcess> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param qcAbnormalProcess 实例对象
     * @return 实例对象
     */
    QcAbnormalProcess insert(QcAbnormalProcess qcAbnormalProcess);

    /**
     * 修改数据
     *
     * @param qcAbnormalProcess 实例对象
     * @return 实例对象
     */
    QcAbnormalProcess update(QcAbnormalProcess qcAbnormalProcess);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(String id);

    /**
     * 通过工序名查询所有数据
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @param proname 工序名
     * @return
     */
    List<QcAbnormalProcess> queryByName(int offset, int limit, String proname);
}