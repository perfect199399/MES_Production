package com.example.production_mes.service.impl;

import com.example.production_mes.dao.QcViolactionDao;
import com.example.production_mes.entity.QcViolaction;
import com.example.production_mes.service.QcViolactionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (QcViolaction)表服务实现类
 *
 * @author makejava
 * @since 2020-09-16 09:09:44
 */
@Service("qcViolactionService")
public class QcViolactionServiceImpl implements QcViolactionService {
    @Resource
    private QcViolactionDao qcViolactionDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public QcViolaction queryById(String id) {
        return this.qcViolactionDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<QcViolaction> queryAllByLimit(int offset, int limit) {
        return this.qcViolactionDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param qcViolaction 实例对象
     * @return 实例对象
     */
    @Override
    public QcViolaction insert(QcViolaction qcViolaction) {
        this.qcViolactionDao.insert(qcViolaction);
        return qcViolaction;
    }

    /**
     * 修改数据
     *
     * @param qcViolaction 实例对象
     * @return 实例对象
     */
    @Override
    public QcViolaction update(QcViolaction qcViolaction) {
        this.qcViolactionDao.update(qcViolaction);
        return this.queryById(qcViolaction.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.qcViolactionDao.deleteById(id) > 0;
    }

    /**
     * 通过工站名查询数据
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @param stationname 工站名
     * @return 对象列表
     */
    @Override
    public List<QcViolaction> queryByName(int offset, int limit,String stationname) {
        return this.qcViolactionDao.queryByName(offset, limit,stationname);
    }

    /**
     * 通过id删除指定数据
     * @param id
     */
    @Override
    public void updateById(String id) {
        this.qcViolactionDao.updateById(id);
        return ;
    }

}