package com.example.production_mes.service;

import com.example.production_mes.entity.SysUserCell;

import java.util.List;

/**
 * (SysUserCell)表服务接口
 *
 * @author makejava
 * @since 2020-09-16 09:09:52
 */
public interface SysUserCellService {

    /**
     * 通过ID查询单条数据
     *
     * @param userId 主键
     * @return 实例对象
     */
    SysUserCell queryById(String userId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<SysUserCell> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param sysUserCell 实例对象
     * @return 实例对象
     */
    SysUserCell insert(SysUserCell sysUserCell);

    /**
     * 修改数据
     *
     * @param sysUserCell 实例对象
     * @return 实例对象
     */
    SysUserCell update(SysUserCell sysUserCell);

    /**
     * 通过主键删除数据
     *
     * @param userId 主键
     * @return 是否成功
     */
    boolean deleteById(String userId);

}