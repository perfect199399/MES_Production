package com.example.production_mes.service.impl;

import com.example.production_mes.dao.BasEnterpriseDao;
import com.example.production_mes.entity.BasEnterprise;
import com.example.production_mes.service.BasEnterpriseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (BasEnterprise)表服务实现类
 *
 * @author makejava
 * @since 2020-09-16 09:08:18
 */
@Service("basEnterpriseService")
public class BasEnterpriseServiceImpl implements BasEnterpriseService {
    @Resource
    private BasEnterpriseDao basEnterpriseDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BasEnterprise queryById(String id) {
        return this.basEnterpriseDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<BasEnterprise> queryAllByLimit(int offset, int limit) {
        return this.basEnterpriseDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param basEnterprise 实例对象
     * @return 实例对象
     */
    @Override
    public BasEnterprise insert(BasEnterprise basEnterprise) {
        this.basEnterpriseDao.insert(basEnterprise);
        return basEnterprise;
    }

    /**
     * 修改数据
     *
     * @param basEnterprise 实例对象
     * @return 实例对象
     */
    @Override
    public BasEnterprise update(BasEnterprise basEnterprise) {
        this.basEnterpriseDao.update(basEnterprise);
        return this.queryById(basEnterprise.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.basEnterpriseDao.deleteById(id) > 0;
    }

    @Override
    public List<BasEnterprise> queryByName(int i, int i1, String stationname) {
        return this.basEnterpriseDao.queryByName(i, i1,stationname);
    }
}