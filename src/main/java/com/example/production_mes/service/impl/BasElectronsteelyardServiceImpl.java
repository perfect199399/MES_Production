package com.example.production_mes.service.impl;

import com.example.production_mes.dao.BasElectronsteelyardDao;
import com.example.production_mes.entity.BasElectronsteelyard;
import com.example.production_mes.service.BasElectronsteelyardService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (BasElectronsteelyard)表服务实现类
 *
 * @author makejava
 * @since 2020-09-16 09:08:16
 */
@Service("basElectronsteelyardService")
public class BasElectronsteelyardServiceImpl implements BasElectronsteelyardService {
    @Resource
    private BasElectronsteelyardDao basElectronsteelyardDao;

    /**
     * 通过ID查询单条数据
     *
     * @param qrcode 主键
     * @return 实例对象
     */
    @Override
    public BasElectronsteelyard queryById(String qrcode) {
        return this.basElectronsteelyardDao.queryById(qrcode);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<BasElectronsteelyard> queryAllByLimit(int offset, int limit) {
        return this.basElectronsteelyardDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param basElectronsteelyard 实例对象
     * @return 实例对象
     */
    @Override
    public BasElectronsteelyard insert(BasElectronsteelyard basElectronsteelyard) {
        this.basElectronsteelyardDao.insert(basElectronsteelyard);
        return basElectronsteelyard;
    }

    /**
     * 修改数据
     *
     * @param basElectronsteelyard 实例对象
     * @return 实例对象
     */
    @Override
    public BasElectronsteelyard update(BasElectronsteelyard basElectronsteelyard) {
        this.basElectronsteelyardDao.update(basElectronsteelyard);
        return this.queryById(basElectronsteelyard.getQrcode());
    }

    /**
     * 通过主键删除数据
     *
     * @param qrcode 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String qrcode) {
        return this.basElectronsteelyardDao.deleteById(qrcode) > 0;
    }
}