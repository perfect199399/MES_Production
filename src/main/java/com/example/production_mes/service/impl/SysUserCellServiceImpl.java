package com.example.production_mes.service.impl;

import com.example.production_mes.dao.SysUserCellDao;
import com.example.production_mes.entity.SysUserCell;
import com.example.production_mes.service.SysUserCellService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (SysUserCell)表服务实现类
 *
 * @author makejava
 * @since 2020-09-16 09:09:52
 */
@Service("sysUserCellService")
public class SysUserCellServiceImpl implements SysUserCellService {
    @Resource
    private SysUserCellDao sysUserCellDao;

    /**
     * 通过ID查询单条数据
     *
     * @param userId 主键
     * @return 实例对象
     */
    @Override
    public SysUserCell queryById(String userId) {
        return this.sysUserCellDao.queryById(userId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<SysUserCell> queryAllByLimit(int offset, int limit) {
        return this.sysUserCellDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param sysUserCell 实例对象
     * @return 实例对象
     */
    @Override
    public SysUserCell insert(SysUserCell sysUserCell) {
        this.sysUserCellDao.insert(sysUserCell);
        return sysUserCell;
    }

    /**
     * 修改数据
     *
     * @param sysUserCell 实例对象
     * @return 实例对象
     */
    @Override
    public SysUserCell update(SysUserCell sysUserCell) {
        this.sysUserCellDao.update(sysUserCell);
        return this.queryById(sysUserCell.getUserId());
    }

    /**
     * 通过主键删除数据
     *
     * @param userId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String userId) {
        return this.sysUserCellDao.deleteById(userId) > 0;
    }
}