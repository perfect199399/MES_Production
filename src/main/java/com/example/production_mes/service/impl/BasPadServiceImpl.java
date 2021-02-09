package com.example.production_mes.service.impl;

import com.example.production_mes.dao.BasPadDao;
import com.example.production_mes.entity.BasPad;
import com.example.production_mes.service.BasPadService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (BasPad)表服务实现类
 *
 * @author makejava
 * @since 2020-09-16 09:09:28
 */
@Service("basPadService")
public class BasPadServiceImpl implements BasPadService {
    @Resource
    private BasPadDao basPadDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BasPad queryById(String id) {
        return this.basPadDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<BasPad> queryAllByLimit(int offset, int limit) {
        return this.basPadDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param basPad 实例对象
     * @return 实例对象
     */
    @Override
    public BasPad insert(BasPad basPad) {
        this.basPadDao.insert(basPad);
        return basPad;
    }

    /**
     * 修改数据
     *
     * @param basPad 实例对象
     * @return 实例对象
     */
    @Override
    public BasPad update(BasPad basPad) {
        this.basPadDao.update(basPad);
        return this.queryById(basPad.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.basPadDao.deleteById(id) > 0;
    }

    @Override
    public void delete(String id) {
        this.basPadDao.delete(id);
    }

    @Override
    public List<BasPad> query(String type, String spec, String id) {
        return basPadDao.query(type,spec,id);
    }
}