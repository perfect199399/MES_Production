package com.example.production_mes.service.impl;

import com.example.production_mes.dao.SysUserDao;
import com.example.production_mes.entity.SysUser;
import com.example.production_mes.service.SysUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户表(SysUser)表服务实现类
 *
 * @author makejava
 * @since 2020-09-16 09:09:52
 */
@Service("sysUserService")
public class SysUserServiceImpl implements SysUserService {
    @Resource
    private SysUserDao sysUserDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SysUser queryById(String id) {
        return this.sysUserDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<SysUser> queryAllByLimit(int offset, int limit) {
        return this.sysUserDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param sysUser 实例对象
     * @return 实例对象
     */
    @Override
    public SysUser insert(SysUser sysUser) {
        this.sysUserDao.insert(sysUser);
        return sysUser;
    }

    /**
     * 修改数据
     *
     * @param sysUser 实例对象
     * @return 实例对象
     */
    @Override
    public SysUser update(SysUser sysUser) {
        this.sysUserDao.update(sysUser);
        return this.queryById(sysUser.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.sysUserDao.deleteById(id) > 0;
    }

    @Override
    public SysUser login(String login_name, String password) {
        return sysUserDao.login(login_name, password);
    }

    @Override
    public SysUser queryByLoginName(String login_name) {
        return this.sysUserDao.queryByLoginName(login_name);
    }
}