package com.example.production_mes.service.impl;

import com.example.production_mes.dao.BasWorkcellDao;
import com.example.production_mes.entity.BasWorkcell;
import com.example.production_mes.service.BasWorkcellService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (BasWorkcell)表服务实现类
 *
 * @author makejava
 * @since 2020-09-16 09:09:30
 */
@Service("basWorkcellService")
public class BasWorkcellServiceImpl implements BasWorkcellService {
    @Resource
    private BasWorkcellDao basWorkcellDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BasWorkcell queryById(String id) {
        return this.basWorkcellDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<BasWorkcell> queryAllByLimit(int offset, int limit) {
        return this.basWorkcellDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param basWorkcell 实例对象
     * @return 实例对象
     */
    @Override
    public BasWorkcell insert(BasWorkcell basWorkcell) {
        this.basWorkcellDao.insert(basWorkcell);
        return basWorkcell;
    }

    /**
     * 修改数据
     *
     * @param basWorkcell 实例对象
     * @return 实例对象
     */
    @Override
    public BasWorkcell update(BasWorkcell basWorkcell) {
        this.basWorkcellDao.update(basWorkcell);
        return this.queryById(basWorkcell.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.basWorkcellDao.deleteById(id) > 0;
    }

    @Override
    public List<BasWorkcell> queryByName(int i, int i1, String cellname) {
        return this.basWorkcellDao.queryByName(i, i1,cellname);
    }
}