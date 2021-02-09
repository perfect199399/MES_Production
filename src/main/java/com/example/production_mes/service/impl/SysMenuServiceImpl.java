package com.example.production_mes.service.impl;

import com.example.production_mes.dao.SysMenuDao;
import com.example.production_mes.entity.SysMenu;
import com.example.production_mes.service.SysMenuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 菜单表(SysMenu)表服务实现类
 *
 * @author makejava
 * @since 2020-09-16 09:09:48
 */
@Service("sysMenuService")
public class SysMenuServiceImpl implements SysMenuService {
    @Resource
    private SysMenuDao sysMenuDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SysMenu queryById(String id) {
        return this.sysMenuDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<SysMenu> queryAllByLimit(int offset, int limit) {
        return this.sysMenuDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param sysMenu 实例对象
     * @return 实例对象
     */
    @Override
    public SysMenu insert(SysMenu sysMenu) {
        this.sysMenuDao.insert(sysMenu);
        return sysMenu;
    }

    /**
     * 修改数据
     *
     * @param sysMenu 实例对象
     * @return 实例对象
     */
    @Override
    public SysMenu update(SysMenu sysMenu) {
        this.sysMenuDao.update(sysMenu);
        return this.queryById(sysMenu.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.sysMenuDao.deleteById(id) > 0;
    }
}