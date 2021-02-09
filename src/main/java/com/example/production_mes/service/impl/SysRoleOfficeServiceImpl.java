package com.example.production_mes.service.impl;

import com.example.production_mes.dao.SysRoleOfficeDao;
import com.example.production_mes.entity.SysRoleOffice;
import com.example.production_mes.service.SysRoleOfficeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 角色-机构(SysRoleOffice)表服务实现类
 *
 * @author makejava
 * @since 2020-09-16 09:09:51
 */
@Service("sysRoleOfficeService")
public class SysRoleOfficeServiceImpl implements SysRoleOfficeService {
    @Resource
    private SysRoleOfficeDao sysRoleOfficeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param roleId 主键
     * @return 实例对象
     */
    @Override
    public SysRoleOffice queryById(String roleId) {
        return this.sysRoleOfficeDao.queryById(roleId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<SysRoleOffice> queryAllByLimit(int offset, int limit) {
        return this.sysRoleOfficeDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param sysRoleOffice 实例对象
     * @return 实例对象
     */
    @Override
    public SysRoleOffice insert(SysRoleOffice sysRoleOffice) {
        this.sysRoleOfficeDao.insert(sysRoleOffice);
        return sysRoleOffice;
    }

    /**
     * 修改数据
     *
     * @param sysRoleOffice 实例对象
     * @return 实例对象
     */
    @Override
    public SysRoleOffice update(SysRoleOffice sysRoleOffice) {
        this.sysRoleOfficeDao.update(sysRoleOffice);
        return this.queryById(sysRoleOffice.getRoleId());
    }

    /**
     * 通过主键删除数据
     *
     * @param roleId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String roleId) {
        return this.sysRoleOfficeDao.deleteById(roleId) > 0;
    }
}