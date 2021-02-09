package com.example.production_mes.service;

import com.example.production_mes.entity.MountGuard;

import java.util.List;

/**
 * 员工上岗表(MountGuard)表服务接口
 *
 * @author makejava
 * @since 2020-09-16 09:09:41
 */
public interface MountGuardService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    MountGuard queryById(String id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<MountGuard> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param mountGuard 实例对象
     * @return 实例对象
     */
    MountGuard insert(MountGuard mountGuard);

    /**
     * 修改数据
     *
     * @param mountGuard 实例对象
     * @return 实例对象
     */
    MountGuard update(MountGuard mountGuard);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(String id);

    List<MountGuard> query(String type, String spec, String id);

    List<MountGuard> queryByName(int i, int i1, String employeename);
}