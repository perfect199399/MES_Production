package com.example.production_mes.service.impl;

import com.example.production_mes.dao.BasWorkstationinfosDao;
import com.example.production_mes.entity.BasWorkstationinfos;
import com.example.production_mes.service.BasWorkstationinfosService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (BasWorkstationinfos)表服务实现类
 *
 * @author makejava
 * @since 2020-09-16 09:09:32
 */
@Service("basWorkstationinfosService")
public class BasWorkstationinfosServiceImpl implements BasWorkstationinfosService {
    @Resource
    private BasWorkstationinfosDao basWorkstationinfosDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BasWorkstationinfos queryById(String id) {
        return this.basWorkstationinfosDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<BasWorkstationinfos> queryAllByLimit(int offset, int limit) {
        return this.basWorkstationinfosDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param basWorkstationinfos 实例对象
     * @return 实例对象
     */
    @Override
    public BasWorkstationinfos insert(BasWorkstationinfos basWorkstationinfos) {
        this.basWorkstationinfosDao.insert(basWorkstationinfos);
        return basWorkstationinfos;
    }

    /**
     * 修改数据
     *
     * @param basWorkstationinfos 实例对象
     * @return 实例对象
     */
    @Override
    public BasWorkstationinfos update(BasWorkstationinfos basWorkstationinfos) {
        this.basWorkstationinfosDao.update(basWorkstationinfos);
        return this.queryById(basWorkstationinfos.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.basWorkstationinfosDao.deleteById(id) > 0;
    }

    @Override
    public List<BasWorkstationinfos> queryByName(int i, int i1, String stationname) {
        return this.basWorkstationinfosDao.queryByName(i, i1,stationname);
    }
}