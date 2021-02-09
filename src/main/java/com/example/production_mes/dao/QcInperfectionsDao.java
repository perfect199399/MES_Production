package com.example.production_mes.dao;

import com.example.production_mes.entity.QcInperfections;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (QcInperfections)表数据库访问层
 *
 * @author makejava
 * @since 2020-09-16 09:09:44
 */
public interface QcInperfectionsDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    QcInperfections queryById(String id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<QcInperfections> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param qcInperfections 实例对象
     * @return 对象列表
     */
    List<QcInperfections> queryAll(QcInperfections qcInperfections);

    /**
     * 新增数据
     *
     * @param qcInperfections 实例对象
     * @return 影响行数
     */
    int insert(QcInperfections qcInperfections);

    /**
     * 修改数据
     *
     * @param qcInperfections 实例对象
     * @return 影响行数
     */
    int update(QcInperfections qcInperfections);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(String id);

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