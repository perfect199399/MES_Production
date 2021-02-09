package com.example.production_mes.service.impl;

import com.example.production_mes.dao.SysRoleDao;
import com.example.production_mes.entity.SysRole;
import com.example.production_mes.service.SysRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 角色表(SysRole)表服务实现类
 *
 * @author makejava
 * @since 2020-09-16 09:09:49
 */
@Service("sysRoleService")
public class SysRoleServiceImpl implements SysRoleService {
    @Resource
    private SysRoleDao sysRoleDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SysRole queryById(String id) {
        return this.sysRoleDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<SysRole> queryAllByLimit(int offset, int limit) {
        return this.sysRoleDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param sysRole 实例对象
     * @return 实例对象
     */
    @Override
    public SysRole insert(SysRole sysRole) {
        this.sysRoleDao.insert(sysRole);
        return sysRole;
    }

    /**
     * 修改数据
     *
     * @param sysRole 实例对象
     * @return 实例对象
     */
    @Override
    public SysRole update(SysRole sysRole) {
        this.sysRoleDao.update(sysRole);
        return this.queryById(sysRole.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.sysRoleDao.deleteById(id) > 0;
    }
}