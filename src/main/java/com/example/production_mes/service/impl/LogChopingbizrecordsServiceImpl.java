package com.example.production_mes.service.impl;

import com.example.production_mes.dao.LogChopingbizrecordsDao;
import com.example.production_mes.entity.LogChopingbizrecords;
import com.example.production_mes.service.LogChopingbizrecordsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (LogChopingbizrecords)表服务实现类
 *
 * @author makejava
 * @since 2020-09-16 09:09:37
 */
@Service("logChopingbizrecordsService")
public class LogChopingbizrecordsServiceImpl implements LogChopingbizrecordsService {
    @Resource
    private LogChopingbizrecordsDao logChopingbizrecordsDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public LogChopingbizrecords queryById(String id) {
        return this.logChopingbizrecordsDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<LogChopingbizrecords> queryAllByLimit(int offset, int limit) {
        return this.logChopingbizrecordsDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param logChopingbizrecords 实例对象
     * @return 实例对象
     */
    @Override
    public LogChopingbizrecords insert(LogChopingbizrecords logChopingbizrecords) {
        this.logChopingbizrecordsDao.insert(logChopingbizrecords);
        return logChopingbizrecords;
    }

    /**
     * 修改数据
     *
     * @param logChopingbizrecords 实例对象
     * @return 实例对象
     */
    @Override
    public LogChopingbizrecords update(LogChopingbizrecords logChopingbizrecords) {
        this.logChopingbizrecordsDao.update(logChopingbizrecords);
        return this.queryById(logChopingbizrecords.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.logChopingbizrecordsDao.deleteById(id) > 0;
    }

    @Override
    public List<LogChopingbizrecords> search(String desc) {
        return logChopingbizrecordsDao.search(desc);
    }
}