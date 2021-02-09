package com.example.production_mes.service.impl;

import com.example.production_mes.dao.LogDecaptitatingbizrecordsDao;
import com.example.production_mes.entity.LogDecaptitatingbizrecords;
import com.example.production_mes.service.LogDecaptitatingbizrecordsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (LogDecaptitatingbizrecords)表服务实现类
 *
 * @author makejava
 * @since 2020-09-16 09:09:39
 */
@Service("logDecaptitatingbizrecordsService")
public class LogDecaptitatingbizrecordsServiceImpl implements LogDecaptitatingbizrecordsService {
    @Resource
    private LogDecaptitatingbizrecordsDao logDecaptitatingbizrecordsDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public LogDecaptitatingbizrecords queryById(String id) {
        return this.logDecaptitatingbizrecordsDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<LogDecaptitatingbizrecords> queryAllByLimit(int offset, int limit) {
        return this.logDecaptitatingbizrecordsDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param logDecaptitatingbizrecords 实例对象
     * @return 实例对象
     */
    @Override
    public LogDecaptitatingbizrecords insert(LogDecaptitatingbizrecords logDecaptitatingbizrecords) {
        this.logDecaptitatingbizrecordsDao.insert(logDecaptitatingbizrecords);
        return logDecaptitatingbizrecords;
    }

    /**
     * 修改数据
     *
     * @param logDecaptitatingbizrecords 实例对象
     * @return 实例对象
     */
    @Override
    public LogDecaptitatingbizrecords update(LogDecaptitatingbizrecords logDecaptitatingbizrecords) {
        this.logDecaptitatingbizrecordsDao.update(logDecaptitatingbizrecords);
        return this.queryById(logDecaptitatingbizrecords.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.logDecaptitatingbizrecordsDao.deleteById(id) > 0;
    }
}