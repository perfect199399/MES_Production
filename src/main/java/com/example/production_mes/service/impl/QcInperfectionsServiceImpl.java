package com.example.production_mes.service.impl;

import com.example.production_mes.dao.QcInperfectionsDao;
import com.example.production_mes.entity.QcInperfections;
import com.example.production_mes.service.QcInperfectionsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (QcInperfections)表服务实现类
 *
 * @author makejava
 * @since 2020-09-16 09:09:44
 */
@Service("qcInperfectionsService")
public class QcInperfectionsServiceImpl implements QcInperfectionsService {
    @Resource
    private QcInperfectionsDao qcInperfectionsDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public QcInperfections queryById(String id) {
        return this.qcInperfectionsDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<QcInperfections> queryAllByLimit(int offset, int limit) {
        return this.qcInperfectionsDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param qcInperfections 实例对象
     * @return 实例对象
     */
    @Override
    public QcInperfections insert(QcInperfections qcInperfections) {
        this.qcInperfectionsDao.insert(qcInperfections);
        return qcInperfections;
    }

    /**
     * 修改数据
     *
     * @param qcInperfections 实例对象
     * @return 实例对象
     */
    @Override
    public QcInperfections update(QcInperfections qcInperfections) {
        this.qcInperfectionsDao.update(qcInperfections);
        return this.queryById(qcInperfections.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.qcInperfectionsDao.deleteById(id) > 0;
    }

    /**
     * 通过产品名查询所有数据
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @param pname 对象列表
     * @return
     */
    @Override
    public List<QcInperfections> queryByName(int offset, int limit, String pname) {
        return this.qcInperfectionsDao.queryByName(offset, limit,pname);
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean updateById(String id) {
        return this.qcInperfectionsDao.updateById(id);
    }
}