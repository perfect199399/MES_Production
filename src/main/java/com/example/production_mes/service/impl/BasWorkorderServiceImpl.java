package com.example.production_mes.service.impl;

import com.example.production_mes.dao.BasWorkorderDao;
import com.example.production_mes.entity.BasWorkorder;
import com.example.production_mes.service.BasWorkorderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (BasWorkorder)表服务实现类
 *
 * @author makejava
 * @since 2020-09-16 09:09:30
 */
@Service("basWorkorderService")
public class BasWorkorderServiceImpl implements BasWorkorderService {
    @Resource
    private BasWorkorderDao basWorkorderDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BasWorkorder queryById(String id) {
        return this.basWorkorderDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<BasWorkorder> queryAllByLimit(int offset, int limit) {
        return this.basWorkorderDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param basWorkorder 实例对象
     * @return 实例对象
     */
    @Override
    public BasWorkorder insert(BasWorkorder basWorkorder) {
        this.basWorkorderDao.insert(basWorkorder);
        return basWorkorder;
    }

    /**
     * 修改数据
     *
     * @param basWorkorder 实例对象
     * @return 实例对象
     */
    @Override
    public BasWorkorder update(BasWorkorder basWorkorder) {
        this.basWorkorderDao.update(basWorkorder);
        return this.queryById(basWorkorder.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.basWorkorderDao.deleteById(id) > 0;
    }

    @Override
    public List<BasWorkorder> queryByName(int i, int i1, String ordercode) {
        return this.basWorkorderDao.queryByName(i, i1,ordercode);
    }
}