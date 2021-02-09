package com.example.production_mes.service.impl;

import com.example.production_mes.dao.SysMdictDao;
import com.example.production_mes.entity.SysMdict;
import com.example.production_mes.service.SysMdictService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 多级字典表(SysMdict)表服务实现类
 *
 * @author makejava
 * @since 2020-09-16 09:09:47
 */
@Service("sysMdictService")
public class SysMdictServiceImpl implements SysMdictService {
    @Resource
    private SysMdictDao sysMdictDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SysMdict queryById(String id) {
        return this.sysMdictDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<SysMdict> queryAllByLimit(int offset, int limit) {
        return this.sysMdictDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param sysMdict 实例对象
     * @return 实例对象
     */
    @Override
    public SysMdict insert(SysMdict sysMdict) {
        this.sysMdictDao.insert(sysMdict);
        return sysMdict;
    }

    /**
     * 修改数据
     *
     * @param sysMdict 实例对象
     * @return 实例对象
     */
    @Override
    public SysMdict update(SysMdict sysMdict) {
        this.sysMdictDao.update(sysMdict);
        return this.queryById(sysMdict.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.sysMdictDao.deleteById(id) > 0;
    }
}