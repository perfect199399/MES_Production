package com.example.production_mes.service;

import com.example.production_mes.entity.SysDict;

import java.util.List;

/**
 * 字典表(SysDict)表服务接口
 *
 * @author makejava
 * @since 2020-09-16 09:09:45
 */
public interface SysDictService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysDict queryById(String id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<SysDict> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param sysDict 实例对象
     * @return 实例对象
     */
    SysDict insert(SysDict sysDict);

    /**
     * 修改数据
     *
     * @param sysDict 实例对象
     * @return 实例对象
     */
    SysDict update(SysDict sysDict);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(String id);

    /**

    * create by weizhipeng
    * Time at 2020/10/6
    * description:
    * @return
    * @param

    */

    List<SysDict> queryBytype(String type);

}