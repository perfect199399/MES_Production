package com.example.production_mes.service.impl;

import com.example.production_mes.dao.TecProcessStationDao;
import com.example.production_mes.entity.TecProcessStation;
import com.example.production_mes.service.TecProcessStationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 工序与工站关系(TecProcessStation)表服务实现类
 *
 * @author makejava
 * @since 2020-09-16 09:09:56
 */
@Service("tecProcessStationService")
public class TecProcessStationServiceImpl implements TecProcessStationService {
    @Resource
    private TecProcessStationDao tecProcessStationDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TecProcessStation queryById(String id) {
        return this.tecProcessStationDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<TecProcessStation> queryAllByLimit(int offset, int limit) {
        return this.tecProcessStationDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tecProcessStation 实例对象
     * @return 实例对象
     */
    @Override
    public TecProcessStation insert(TecProcessStation tecProcessStation) {
        this.tecProcessStationDao.insert(tecProcessStation);
        return tecProcessStation;
    }

    /**
     * 修改数据
     *
     * @param tecProcessStation 实例对象
     * @return 实例对象
     */
    @Override
    public TecProcessStation update(TecProcessStation tecProcessStation) {
        this.tecProcessStationDao.update(tecProcessStation);
        return this.queryById(tecProcessStation.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.tecProcessStationDao.deleteById(id) > 0;
    }

    /**
     * 通过工序查询所有数据
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @param proname 工序
     * @return
     */
    @Override
    public List<TecProcessStation> queryByName(int offset, int limit, String proname) {
        return this.tecProcessStationDao.queryByName(offset, limit,proname);
    }

    /**
     * 通过id删除指定数据
     * @param id
     * @return
     */
    @Override
    public void updateById(String id) {
        this.tecProcessStationDao.updateById(id);
        return ;
    }
}