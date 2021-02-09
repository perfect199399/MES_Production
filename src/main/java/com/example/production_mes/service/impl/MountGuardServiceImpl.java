package com.example.production_mes.service.impl;

import com.example.production_mes.dao.MountGuardDao;
import com.example.production_mes.entity.EquipReport;
import com.example.production_mes.entity.MountGuard;
import com.example.production_mes.service.MountGuardService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 员工上岗表(MountGuard)表服务实现类
 *
 * @author makejava
 * @since 2020-09-16 09:09:41
 */
@Service("mountGuardService")
public class MountGuardServiceImpl implements MountGuardService {
    @Resource
    private MountGuardDao mountGuardDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public MountGuard queryById(String id) {
        return this.mountGuardDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<MountGuard> queryAllByLimit(int offset, int limit) {
        return this.mountGuardDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param mountGuard 实例对象
     * @return 实例对象
     */
    @Override
    public MountGuard insert(MountGuard mountGuard) {
        this.mountGuardDao.insert(mountGuard);
        return mountGuard;
    }

    /**
     * 修改数据
     *
     * @param mountGuard 实例对象
     * @return 实例对象
     */
    @Override
    public MountGuard update(MountGuard mountGuard) {
        this.mountGuardDao.update(mountGuard);
        return this.queryById(mountGuard.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.mountGuardDao.deleteById(id) > 0;
    }
    @Override
    public List<MountGuard> query(String type, String spec, String id) {
        return this.mountGuardDao.query(type,spec,id);
    }

    @Override
    public List<MountGuard> queryByName(int i, int i1, String employeename) {
        return this.mountGuardDao.queryByName(i, i1,employeename);
    }

}