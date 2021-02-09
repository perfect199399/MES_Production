package com.example.production_mes.service.impl;

import com.example.production_mes.dao.LogCutpiecequalitytestingrecordsDao;
import com.example.production_mes.entity.LogCutpiecequalitytestingrecords;
import com.example.production_mes.service.LogCutpiecequalitytestingrecordsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (LogCutpiecequalitytestingrecords)表服务实现类
 *
 * @author makejava
 * @since 2020-09-16 09:09:38
 */
@Service("logCutpiecequalitytestingrecordsService")
public class LogCutpiecequalitytestingrecordsServiceImpl implements LogCutpiecequalitytestingrecordsService {
    @Resource
    private LogCutpiecequalitytestingrecordsDao logCutpiecequalitytestingrecordsDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public LogCutpiecequalitytestingrecords queryById(String id) {
        return this.logCutpiecequalitytestingrecordsDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<LogCutpiecequalitytestingrecords> queryAllByLimit(int offset, int limit,String startTime, String endTime) {
        return this.logCutpiecequalitytestingrecordsDao.queryAllByLimit(offset, limit,startTime, endTime);
    }

    /**
     * 新增数据
     *
     * @param logCutpiecequalitytestingrecords 实例对象
     * @return 实例对象
     */
    @Override
    public LogCutpiecequalitytestingrecords insert(LogCutpiecequalitytestingrecords logCutpiecequalitytestingrecords) {
        this.logCutpiecequalitytestingrecordsDao.insert(logCutpiecequalitytestingrecords);
        return logCutpiecequalitytestingrecords;
    }

    /**
     * 修改数据
     *
     * @param logCutpiecequalitytestingrecords 实例对象
     * @return 实例对象
     */
    @Override
    public LogCutpiecequalitytestingrecords update(LogCutpiecequalitytestingrecords logCutpiecequalitytestingrecords) {
        this.logCutpiecequalitytestingrecordsDao.update(logCutpiecequalitytestingrecords);
        return this.queryById(logCutpiecequalitytestingrecords.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.logCutpiecequalitytestingrecordsDao.deleteById(id) > 0;
    }


}