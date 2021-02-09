package com.example.production_mes.service;

import com.example.production_mes.entity.SysUser;

import java.util.List;

/**
 * 用户表(SysUser)表服务接口
 *
 * @author makejava
 * @since 2020-09-16 09:09:52
 */
public interface SysUserService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysUser queryById(String id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<SysUser> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param sysUser 实例对象
     * @return 实例对象
     */
    SysUser insert(SysUser sysUser);

    /**
     * 修改数据
     *
     * @param sysUser 实例对象
     * @return 实例对象
     */
    SysUser update(SysUser sysUser);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(String id);

    SysUser login(String login_name, String password);

    SysUser queryByLoginName(String login_name);
}