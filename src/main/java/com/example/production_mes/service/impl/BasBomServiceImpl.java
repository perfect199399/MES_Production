package com.example.production_mes.service.impl;

import com.example.production_mes.dao.BasBomDao;
import com.example.production_mes.entity.BasBom;
import com.example.production_mes.entity.BasBomList;
import com.example.production_mes.service.BasBomService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 物料清单(BasBom)表服务实现类
 *
 * @author makejava
 * @since 2020-09-16 09:08:12
 */
@Service("basBomService")
public class BasBomServiceImpl implements BasBomService {
    @Resource
    private BasBomDao basBomDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BasBom queryById(String id) {
        return this.basBomDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<BasBom> queryAllByLimit(int offset, int limit) {
        return this.basBomDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param basBom 实例对象
     * @return 实例对象
     */
    @Override
    public BasBom insert(BasBom basBom) {
        this.basBomDao.insert(basBom);
        return basBom;
    }

    /**
     * 修改数据
     *
     * @param basBom 实例对象
     * @return 实例对象
     */
    @Override
    public BasBom update(BasBom basBom) {
        this.basBomDao.update(basBom);
        return this.queryById(basBom.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.basBomDao.deleteById(id) > 0;
    }

    @Override
    public List<BasBom> queryname(String name) {
        return basBomDao.queryname(name);
    }

    @Override
    public List<BasBomList> queryAll() {
        return this.basBomDao.queryAll();
    }





}