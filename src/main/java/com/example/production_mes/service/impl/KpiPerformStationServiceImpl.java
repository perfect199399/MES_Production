package com.example.production_mes.service.impl;

import com.example.production_mes.dao.KpiPerformStationDao;
import com.example.production_mes.entity.KpiPerformStation;
import com.example.production_mes.service.KpiPerformStationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 绩效参数与工站关系表(KpiPerformStation)表服务实现类
 *
 * @author makejava
 * @since 2020-09-16 09:09:35
 */
@Service("kpiPerformStationService")
public class KpiPerformStationServiceImpl implements KpiPerformStationService {
    @Resource
    private KpiPerformStationDao kpiPerformStationDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public KpiPerformStation queryById(String id) {
        return this.kpiPerformStationDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<KpiPerformStation> queryAllByLimit(int offset, int limit) {
        return this.kpiPerformStationDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param kpiPerformStation 实例对象
     * @return 实例对象
     */
    @Override
    public KpiPerformStation insert(KpiPerformStation kpiPerformStation) {
        this.kpiPerformStationDao.insert(kpiPerformStation);
        return kpiPerformStation;
    }

    /**
     * 修改数据
     *
     * @param kpiPerformStation 实例对象
     * @return 实例对象
     */
    @Override
    public KpiPerformStation update(KpiPerformStation kpiPerformStation) {
        this.kpiPerformStationDao.update(kpiPerformStation);
        return this.queryById(kpiPerformStation.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.kpiPerformStationDao.deleteById(id) > 0;
    }
}