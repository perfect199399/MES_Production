package com.example.production_mes.service.impl;

import com.example.production_mes.dao.BasFactoryDao;
import com.example.production_mes.entity.BasFactory;
import com.example.production_mes.service.BasFactoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (BasFactory)表服务实现类
 *
 * @author makejava
 * @since 2020-09-16 09:09:25
 */
@Service("basFactoryService")
public class BasFactoryServiceImpl implements BasFactoryService {
    @Resource
    private BasFactoryDao basFactoryDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BasFactory queryById(String id) {
        return this.basFactoryDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<BasFactory> queryAllByLimit(int offset, int limit) {
        return this.basFactoryDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param basFactory 实例对象
     * @return 实例对象
     */
    @Override
    public BasFactory insert(BasFactory basFactory) {
        this.basFactoryDao.insert(basFactory);
        return basFactory;
    }

    /**
     * 修改数据
     *
     * @param basFactory 实例对象
     * @return 实例对象
     */
    @Override
    public BasFactory update(BasFactory basFactory) {
        this.basFactoryDao.update(basFactory);
        return this.queryById(basFactory.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.basFactoryDao.deleteById(id) > 0;
    }

    @Override
    public List<BasFactory> queryByName(int i, int i1, String factoryname) {
        return this.basFactoryDao.queryByName(i, i1,factoryname);
    }
}