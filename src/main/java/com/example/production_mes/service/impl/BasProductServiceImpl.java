package com.example.production_mes.service.impl;

import com.example.production_mes.dao.BasProductDao;
import com.example.production_mes.entity.BasProduct;
import com.example.production_mes.service.BasProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (BasProduct)表服务实现类
 *
 * @author makejava
 * @since 2020-09-16 09:09:29
 */
@Service("basProductService")
public class BasProductServiceImpl implements BasProductService {
    @Resource
    private BasProductDao basProductDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BasProduct queryById(String id) {
        return this.basProductDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<BasProduct> queryAllByLimit(int offset, int limit) {
        return this.basProductDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param basProduct 实例对象
     * @return 实例对象
     */
    @Override
    public BasProduct insert(BasProduct basProduct) {
        System.out.println("PDD");
        System.out.println(basProduct.getCreateBy());
        this.basProductDao.insert(basProduct);
        return basProduct;
    }

    /**
     * 修改数据
     *
     * @param basProduct 实例对象
     * @return 实例对象
     */
    @Override
    public BasProduct update(BasProduct basProduct) {
        this.basProductDao.update(basProduct);
        return this.queryById(basProduct.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {

        return this.basProductDao.deleteById(id) > 0;
    }

    @Override
    public List<BasProduct> search_qrcode(String qrcode) {
        return basProductDao.query_qrcode(qrcode);
    }

    @Override
    public List<BasProduct> search_name(String name) {
        return basProductDao.query_name(name);
    }


}