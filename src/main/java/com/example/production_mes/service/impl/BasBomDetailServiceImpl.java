package com.example.production_mes.service.impl;

import com.example.production_mes.dao.BasBomDetailDao;
import com.example.production_mes.entity.BasBomDetail;
import com.example.production_mes.service.BasBomDetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (BasBomDetail)表服务实现类
 *
 * @author makejava
 * @since 2020-09-16 09:08:12
 */
@Service("basBomDetailService")
public class BasBomDetailServiceImpl implements BasBomDetailService {
    @Resource
    private BasBomDetailDao basBomDetailDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BasBomDetail queryById(String id) {
        return this.basBomDetailDao.queryById(id);
    }


    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<BasBomDetail> queryAllByLimit(int offset, int limit) {
        return this.basBomDetailDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param basBomDetail 实例对象
     * @return 实例对象
     */
    @Override
    public BasBomDetail insert(BasBomDetail basBomDetail) {
        this.basBomDetailDao.insert(basBomDetail);
        return basBomDetail;
    }

    /**
     * 修改数据
     *
     * @param basBomDetail 实例对象
     * @return 实例对象
     */
    @Override
    public BasBomDetail update(BasBomDetail basBomDetail) {
        this.basBomDetailDao.update(basBomDetail);
        return this.queryById(basBomDetail.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.basBomDetailDao.deleteById(id) > 0;
    }


}