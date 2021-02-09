package com.example.production_mes.dao;

import com.example.production_mes.entity.BasElectronsteelyard;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (BasElectronsteelyard)表数据库访问层
 *
 * @author makejava
 * @since 2020-09-16 09:08:16
 */
public interface BasElectronsteelyardDao {

    /**
     * 通过ID查询单条数据
     *
     * @param qrcode 主键
     * @return 实例对象
     */
    BasElectronsteelyard queryById(String qrcode);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<BasElectronsteelyard> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param basElectronsteelyard 实例对象
     * @return 对象列表
     */
    List<BasElectronsteelyard> queryAll(BasElectronsteelyard basElectronsteelyard);

    /**
     * 新增数据
     *
     * @param basElectronsteelyard 实例对象
     * @return 影响行数
     */
    int insert(BasElectronsteelyard basElectronsteelyard);

    /**
     * 修改数据
     *
     * @param basElectronsteelyard 实例对象
     * @return 影响行数
     */
    int update(BasElectronsteelyard basElectronsteelyard);

    /**
     * 通过主键删除数据
     *
     * @param qrcode 主键
     * @return 影响行数
     */
    int deleteById(String qrcode);

}