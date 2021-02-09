package com.example.production_mes.service;

import com.example.production_mes.entity.BasEnterprise;

import java.util.List;

/**
 * (BasEnterprise)表服务接口
 *
 * @author makejava
 * @since 2020-09-16 09:08:18
 */
public interface BasEnterpriseService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BasEnterprise queryById(String id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<BasEnterprise> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param basEnterprise 实例对象
     * @return 实例对象
     */
    BasEnterprise insert(BasEnterprise basEnterprise);

    /**
     * 修改数据
     *
     * @param basEnterprise 实例对象
     * @return 实例对象
     */
    BasEnterprise update(BasEnterprise basEnterprise);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(String id);

    List<BasEnterprise> queryByName(int i, int i1, String stationname);
}