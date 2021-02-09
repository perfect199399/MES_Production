package com.example.production_mes.dao;

import com.example.production_mes.entity.QcViolaction;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (QcViolaction)表数据库访问层
 *
 * @author makejava
 * @since 2020-09-16 09:09:44
 */
public interface QcViolactionDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    QcViolaction queryById(String id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<QcViolaction> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param qcViolaction 实例对象
     * @return 对象列表
     */
    List<QcViolaction> queryAll(QcViolaction qcViolaction);

    /**
     * 新增数据
     *
     * @param qcViolaction 实例对象
     * @return 影响行数
     */
    int insert(QcViolaction qcViolaction);

    /**
     * 修改数据
     *
     * @param qcViolaction 实例对象
     * @return 影响行数
     */
    int update(QcViolaction qcViolaction);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(String id);

    /**
     * 通过工站名查询数据
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @param stationname 工站名
     * @return 对象列表
     */
    List<QcViolaction> queryByName(int offset, int limit,String stationname);

    /**
     * 通过id删除指定数据
     * @param id
     */
    void updateById(String id);
}