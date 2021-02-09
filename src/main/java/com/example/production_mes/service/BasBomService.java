package com.example.production_mes.service;

import com.example.production_mes.entity.BasBom;
import com.example.production_mes.entity.BasBomList;

import java.util.List;

/**
 * 物料清单(BasBom)表服务接口
 *
 * @author makejava
 * @since 2020-09-16 09:08:12
 */
public interface BasBomService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BasBom queryById(String id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<BasBom> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param basBom 实例对象
     * @return 实例对象
     */
    BasBom insert(BasBom basBom);

    /**
     * 修改数据
     *
     * @param basBom 实例对象
     * @return 实例对象
     */
    BasBom update(BasBom basBom);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(String id);

    List<BasBom> queryname(String name);

    /**

    * create by weizhipeng
    * Time at 2020/10/6
    * description: 查询所需数据
    * @return
    * @param

    */
    List<BasBomList> queryAll();

}