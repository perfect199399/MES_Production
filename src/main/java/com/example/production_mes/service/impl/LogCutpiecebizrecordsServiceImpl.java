package com.example.production_mes.service.impl;

import com.example.production_mes.dao.LogCutpiecebizrecordsDao;
import com.example.production_mes.entity.LogCutpiecebizrecords;
import com.example.production_mes.service.LogCutpiecebizrecordsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (LogCutpiecebizrecords)表服务实现类
 *
 * @author makejava
 * @since 2020-09-16 09:09:37
 */
@Service("logCutpiecebizrecordsService")
public class LogCutpiecebizrecordsServiceImpl implements LogCutpiecebizrecordsService {
    @Resource
    private LogCutpiecebizrecordsDao logCutpiecebizrecordsDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public LogCutpiecebizrecords queryById(String id) {
        return this.logCutpiecebizrecordsDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<LogCutpiecebizrecords> queryAllByLimit(int offset, int limit) {
        return this.logCutpiecebizrecordsDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param logCutpiecebizrecords 实例对象
     * @return 实例对象
     */
    @Override
    public LogCutpiecebizrecords insert(LogCutpiecebizrecords logCutpiecebizrecords) {
        this.logCutpiecebizrecordsDao.insert(logCutpiecebizrecords);
        return logCutpiecebizrecords;
    }

    /**
     * 修改数据
     *
     * @param logCutpiecebizrecords 实例对象
     * @return 实例对象
     */
    @Override
    public LogCutpiecebizrecords update(LogCutpiecebizrecords logCutpiecebizrecords) {
        this.logCutpiecebizrecordsDao.update(logCutpiecebizrecords);
        return this.queryById(logCutpiecebizrecords.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.logCutpiecebizrecordsDao.deleteById(id) > 0;
    }
}