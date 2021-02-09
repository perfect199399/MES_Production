package com.example.production_mes.service.impl;

import com.example.production_mes.dao.LogRemovefishbonebizrecordsDao;
import com.example.production_mes.entity.LogRemovefishbonebizrecords;
import com.example.production_mes.service.LogRemovefishbonebizrecordsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (LogRemovefishbonebizrecords)表服务实现类
 *
 * @author makejava
 * @since 2020-09-16 09:09:40
 */
@Service("logRemovefishbonebizrecordsService")
public class LogRemovefishbonebizrecordsServiceImpl implements LogRemovefishbonebizrecordsService {
    @Resource
    private LogRemovefishbonebizrecordsDao logRemovefishbonebizrecordsDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public LogRemovefishbonebizrecords queryById(String id) {
        return this.logRemovefishbonebizrecordsDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<LogRemovefishbonebizrecords> queryAllByLimit(int offset, int limit) {
        return this.logRemovefishbonebizrecordsDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param logRemovefishbonebizrecords 实例对象
     * @return 实例对象
     */
    @Override
    public LogRemovefishbonebizrecords insert(LogRemovefishbonebizrecords logRemovefishbonebizrecords) {
        this.logRemovefishbonebizrecordsDao.insert(logRemovefishbonebizrecords);
        return logRemovefishbonebizrecords;
    }

    /**
     * 修改数据
     *
     * @param logRemovefishbonebizrecords 实例对象
     * @return 实例对象
     */
    @Override
    public LogRemovefishbonebizrecords update(LogRemovefishbonebizrecords logRemovefishbonebizrecords) {
        this.logRemovefishbonebizrecordsDao.update(logRemovefishbonebizrecords);
        return this.queryById(logRemovefishbonebizrecords.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.logRemovefishbonebizrecordsDao.deleteById(id) > 0;
    }
}