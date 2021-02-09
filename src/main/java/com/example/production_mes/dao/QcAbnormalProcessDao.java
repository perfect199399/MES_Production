package com.example.production_mes.dao;

import com.example.production_mes.entity.QcAbnormalProcess;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 异常工序检测(QcAbnormalProcess)表数据库访问层
 *
 * @author makejava
 * @since 2020-09-16 09:09:43
 */
public interface QcAbnormalProcessDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    QcAbnormalProcess queryById(String id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<QcAbnormalProcess> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param qcAbnormalProcess 实例对象
     * @return 对象列表
     */
    List<QcAbnormalProcess> queryAll(QcAbnormalProcess qcAbnormalProcess);

    /**
     * 新增数据
     *
     * @param qcAbnormalProcess 实例对象
     * @return 影响行数
     */
    int insert(QcAbnormalProcess qcAbnormalProcess);

    /**
     * 修改数据
     *
     * @param qcAbnormalProcess 实例对象
     * @return 影响行数
     */
    int update(QcAbnormalProcess qcAbnormalProcess);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(String id);

    /**
     * 通过工序名查询所有数据
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @param proname 工序名
     * @return
     */
    List<QcAbnormalProcess> queryByName(int offset, int limit, String proname);
}