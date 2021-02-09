package com.example.production_mes.service.impl;

import com.example.production_mes.dao.BasCodeprinterDao;
import com.example.production_mes.entity.BasCodeprinter;
import com.example.production_mes.service.BasCodeprinterService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (BasCodeprinter)表服务实现类
 *
 * @author makejava
 * @since 2020-09-16 09:08:16
 */
@Service("basCodeprinterService")
public class BasCodeprinterServiceImpl implements BasCodeprinterService {
    @Resource
    private BasCodeprinterDao basCodeprinterDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BasCodeprinter queryById(String id) {
        return this.basCodeprinterDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<BasCodeprinter> queryAllByLimit(int offset, int limit) {
        return this.basCodeprinterDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param basCodeprinter 实例对象
     * @return 实例对象
     */
    @Override
    public BasCodeprinter insert(BasCodeprinter basCodeprinter) {
        this.basCodeprinterDao.insert(basCodeprinter);
        return basCodeprinter;
    }

    /**
     * 修改数据
     *
     * @param basCodeprinter 实例对象
     * @return 实例对象
     */
    @Override
    public BasCodeprinter update(BasCodeprinter basCodeprinter) {
        this.basCodeprinterDao.update(basCodeprinter);
        return this.queryById(basCodeprinter.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.basCodeprinterDao.deleteById(id) > 0;
    }
}