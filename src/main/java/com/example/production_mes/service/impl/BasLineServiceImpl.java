package com.example.production_mes.service.impl;

import com.example.production_mes.dao.BasLineDao;
import com.example.production_mes.entity.BasLine;
import com.example.production_mes.service.BasLineService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (BasLine)表服务实现类
 *
 * @author makejava
 * @since 2020-09-16 09:09:27
 */
@Service("basLineService")
public class BasLineServiceImpl implements BasLineService {
    @Resource
    private BasLineDao basLineDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BasLine queryById(String id) {
        return this.basLineDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<BasLine> queryAllByLimit(int offset, int limit) {
        return this.basLineDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param basLine 实例对象
     * @return 实例对象
     */
    @Override
    public BasLine insert(BasLine basLine) {
        this.basLineDao.insert(basLine);
        return basLine;
    }

    /**
     * 修改数据
     *
     * @param basLine 实例对象
     * @return 实例对象
     */
    @Override
    public BasLine update(BasLine basLine) {
        this.basLineDao.update(basLine);
        return this.queryById(basLine.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.basLineDao.deleteById(id) > 0;
    }

    @Override
    public List<BasLine> queryByName(int i, int i1, String linename) {
        return this.basLineDao.queryByName(i, i1,linename);
    }
}