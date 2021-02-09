package com.example.production_mes.service.impl;

import com.example.production_mes.dao.MaterialDao;
import com.example.production_mes.entity.Material;
import com.example.production_mes.service.MaterialService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Material)表服务实现类
 *
 * @author makejava
 * @since 2020-09-16 09:09:41
 */
@Service("materialService")
public class MaterialServiceImpl implements MaterialService {
    @Resource
    private MaterialDao materialDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Material queryById(String id) {
        return this.materialDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Material> queryAllByLimit(int offset, int limit) {
        return this.materialDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param material 实例对象
     * @return 实例对象
     */
    @Override
    public Material insert(Material material) {
        this.materialDao.insert(material);
        return material;
    }

    /**
     * 修改数据
     *
     * @param material 实例对象
     * @return 实例对象
     */
    @Override
    public Material update(Material material) {
        this.materialDao.update(material);
        return this.queryById(material.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.materialDao.deleteById(id) > 0;
    }
}