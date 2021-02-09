package com.example.production_mes.service.impl;

import com.example.production_mes.dao.BasIphotoDao;
import com.example.production_mes.entity.BasIphoto;
import com.example.production_mes.service.BasIphotoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (BasIphoto)表服务实现类
 *
 * @author makejava
 * @since 2020-09-16 09:09:26
 */
@Service("basIphotoService")
public class BasIphotoServiceImpl implements BasIphotoService {
    @Resource
    private BasIphotoDao basIphotoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BasIphoto queryById(String id) {
        return this.basIphotoDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<BasIphoto> queryAllByLimit(int offset, int limit) {
        return this.basIphotoDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param basIphoto 实例对象
     * @return 实例对象
     */
    @Override
    public BasIphoto insert(BasIphoto basIphoto) {
        this.basIphotoDao.insert(basIphoto);
        return basIphoto;
    }

    /**
     * 修改数据
     *
     * @param basIphoto 实例对象
     * @return 实例对象
     */
    @Override
    public BasIphoto update(BasIphoto basIphoto) {
        this.basIphotoDao.update(basIphoto);
        return this.queryById(basIphoto.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.basIphotoDao.deleteById(id) > 0;
    }
}