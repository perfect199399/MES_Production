package com.example.production_mes.service.impl;

import com.example.production_mes.dao.KpiPerformtypeDao;
import com.example.production_mes.entity.KpiPerformtype;
import com.example.production_mes.service.KpiPerformtypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 绩效方式表(KpiPerformtype)表服务实现类
 *
 * @author makejava
 * @since 2020-09-16 09:09:36
 */
@Service("kpiPerformtypeService")
public class KpiPerformtypeServiceImpl implements KpiPerformtypeService {
    @Resource
    private KpiPerformtypeDao kpiPerformtypeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public KpiPerformtype queryById(String id) {
        return this.kpiPerformtypeDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<KpiPerformtype> queryAllByLimit(int offset, int limit) {
        return this.kpiPerformtypeDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param kpiPerformtype 实例对象
     * @return 实例对象
     */
    @Override
    public KpiPerformtype insert(KpiPerformtype kpiPerformtype) {
        this.kpiPerformtypeDao.insert(kpiPerformtype);
        return kpiPerformtype;
    }

    /**
     * 修改数据
     *
     * @param kpiPerformtype 实例对象
     * @return 实例对象
     */
    @Override
    public KpiPerformtype update(KpiPerformtype kpiPerformtype) {
        this.kpiPerformtypeDao.update(kpiPerformtype);
        return this.queryById(kpiPerformtype.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.kpiPerformtypeDao.deleteById(id) > 0;
    }

    @Override
    public List<KpiPerformtype> search(String desc) {
        return  this.kpiPerformtypeDao.search(desc);
    }
}