package com.example.production_mes.dao;

import com.example.production_mes.entity.SysUserCell;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (SysUserCell)表数据库访问层
 *
 * @author makejava
 * @since 2020-09-16 09:09:52
 */
public interface SysUserCellDao {

    /**
     * 通过ID查询单条数据
     *
     * @param userId 主键
     * @return 实例对象
     */
    SysUserCell queryById(String userId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<SysUserCell> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param sysUserCell 实例对象
     * @return 对象列表
     */
    List<SysUserCell> queryAll(SysUserCell sysUserCell);

    /**
     * 新增数据
     *
     * @param sysUserCell 实例对象
     * @return 影响行数
     */
    int insert(SysUserCell sysUserCell);

    /**
     * 修改数据
     *
     * @param sysUserCell 实例对象
     * @return 影响行数
     */
    int update(SysUserCell sysUserCell);

    /**
     * 通过主键删除数据
     *
     * @param userId 主键
     * @return 影响行数
     */
    int deleteById(String userId);

}