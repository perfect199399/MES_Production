package com.example.production_mes.service.impl;

import com.example.production_mes.dao.SysOfficeDao;
import com.example.production_mes.entity.SysOffice;
import com.example.production_mes.service.SysOfficeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 机构表(SysOffice)表服务实现类
 *
 * @author makejava
 * @since 2020-09-16 09:09:49
 */
@Service("sysOfficeService")
public class SysOfficeServiceImpl implements SysOfficeService {
    @Resource
    private SysOfficeDao sysOfficeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SysOffice queryById(String id) {
        return this.sysOfficeDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<SysOffice> queryAllByLimit(int offset, int limit) {
        return this.sysOfficeDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param sysOffice 实例对象
     * @return 实例对象
     */
    @Override
    public SysOffice insert(SysOffice sysOffice) {
        this.sysOfficeDao.insert(sysOffice);
        return sysOffice;
    }

    /**
     * 修改数据
     *
     * @param sysOffice 实例对象
     * @return 实例对象
     */
    @Override
    public SysOffice update(SysOffice sysOffice) {
        this.sysOfficeDao.update(sysOffice);
        return this.queryById(sysOffice.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.sysOfficeDao.deleteById(id) > 0;
    }
}