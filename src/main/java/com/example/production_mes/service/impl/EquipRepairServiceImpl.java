package com.example.production_mes.service.impl;

import com.example.production_mes.dao.EquipRepairDao;
import com.example.production_mes.entity.EquipRepair;
import com.example.production_mes.service.EquipRepairService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (EquipRepair)表服务实现类
 *
 * @author makejava
 * @since 2020-09-16 09:09:34
 */
@Service("equipRepairService")
public class EquipRepairServiceImpl implements EquipRepairService {
    @Resource
    private EquipRepairDao equipRepairDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public EquipRepair queryById(String id) {
        return this.equipRepairDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<EquipRepair> queryAllByLimit(int offset, int limit) {
        return this.equipRepairDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param equipRepair 实例对象
     * @return 实例对象
     */
    @Override
    public EquipRepair insert(EquipRepair equipRepair) {
        this.equipRepairDao.insert(equipRepair);
        this.equipRepairDao.updateStatus(equipRepair);
        return equipRepair;
    }

    /**
     * 修改数据
     *
     * @param equipRepair 实例对象
     * @return 实例对象
     */
    @Override
    public EquipRepair update(EquipRepair equipRepair) {
        this.equipRepairDao.update(equipRepair);
        return this.queryById(equipRepair.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.equipRepairDao.deleteById(id) > 0;
    }

    /**
     * 查找维修报告
     * @param mid
     * @return
     */

    public EquipRepair selectByMid(String mid) {
        return this.equipRepairDao.selectByMid(mid);
    }
}