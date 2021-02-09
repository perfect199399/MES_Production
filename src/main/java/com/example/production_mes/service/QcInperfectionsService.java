package com.example.production_mes.service;

import com.example.production_mes.entity.QcInperfections;

import java.util.List;

/**
 * (QcInperfections)表服务接口
 *
 * @author makejava
 * @since 2020-09-16 09:09:44
 */
public interface QcInperfectionsService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    QcInperfections queryById(String id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<QcInperfections> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param qcInperfections 实例对象
     * @return 实例对象
     */
    QcInperfections insert(QcInperfections qcInperfections);

    /**
     * 修改数据
     *
     * @param qcInperfections 实例对象
     * @return 实例对象
     */
    QcInperfections update(QcInperfections qcInperfections);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(String id);

    /**
     * 通过产品名查询所有数据
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @param pname 对象列表
     * @return
     */
    List<QcInperfections> queryByName(int offset, int limit, String pname);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean updateById(String id);
}