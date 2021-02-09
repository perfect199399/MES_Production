package com.example.production_mes.service.impl;

import com.example.production_mes.dao.QcAbnormalProcessDao;
import com.example.production_mes.entity.QcAbnormalProcess;
import com.example.production_mes.service.QcAbnormalProcessService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 异常工序检测(QcAbnormalProcess)表服务实现类
 *
 * @author makejava
 * @since 2020-09-16 09:09:43
 */
@Service("qcAbnormalProcessService")
public class QcAbnormalProcessServiceImpl implements QcAbnormalProcessService {
    @Resource
    private QcAbnormalProcessDao qcAbnormalProcessDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public QcAbnormalProcess queryById(String id) {
        return this.qcAbnormalProcessDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<QcAbnormalProcess> queryAllByLimit(int offset, int limit) {
        return this.qcAbnormalProcessDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param qcAbnormalProcess 实例对象
     * @return 实例对象
     */
    @Override
    public QcAbnormalProcess insert(QcAbnormalProcess qcAbnormalProcess) {
        this.qcAbnormalProcessDao.insert(qcAbnormalProcess);
        return qcAbnormalProcess;
    }

    /**
     * 修改数据
     *
     * @param qcAbnormalProcess 实例对象
     * @return 实例对象
     */
    @Override
    public QcAbnormalProcess update(QcAbnormalProcess qcAbnormalProcess) {
        this.qcAbnormalProcessDao.update(qcAbnormalProcess);
        return this.queryById(qcAbnormalProcess.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.qcAbnormalProcessDao.deleteById(id) > 0;
    }

    /**
     * 通过工序名查询所有数据
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @param proname 工序名
     * @return
     */
    @Override
    public List<QcAbnormalProcess> queryByName(int offset, int limit, String proname) {
        return this.qcAbnormalProcessDao.queryByName(offset, limit,proname);
    }
}