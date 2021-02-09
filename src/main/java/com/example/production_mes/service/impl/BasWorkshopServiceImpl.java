package com.example.production_mes.service.impl;

import com.example.production_mes.dao.BasWorkshopDao;
import com.example.production_mes.entity.BasWorkshop;
import com.example.production_mes.service.BasWorkshopService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (BasWorkshop)表服务实现类
 *
 * @author makejava
 * @since 2020-09-16 09:09:31
 */
@Service("basWorkshopService")
public class BasWorkshopServiceImpl implements BasWorkshopService {
    @Resource
    private BasWorkshopDao basWorkshopDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BasWorkshop queryById(String id) {
        return this.basWorkshopDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<BasWorkshop> queryAllByLimit(int offset, int limit) {
        return this.basWorkshopDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param basWorkshop 实例对象
     * @return 实例对象
     */
    @Override
    public BasWorkshop insert(BasWorkshop basWorkshop) {
        this.basWorkshopDao.insert(basWorkshop);
        return basWorkshop;
    }

    /**
     * 修改数据
     *
     * @param basWorkshop 实例对象
     * @return 实例对象
     */
    @Override
    public BasWorkshop update(BasWorkshop basWorkshop) {
        this.basWorkshopDao.update(basWorkshop);
        return this.queryById(basWorkshop.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.basWorkshopDao.deleteById(id) > 0;
    }

    @Override
    public List<BasWorkshop> queryByName(int i, int i1, String shopname) {
        return this.basWorkshopDao.queryByName(i, i1,shopname);
    }
}