package com.example.production_mes.service.impl;

import com.example.production_mes.dao.BasEmployeesDao;
import com.example.production_mes.entity.BasEmployees;
import com.example.production_mes.service.BasEmployeesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (BasEmployees)表服务实现类
 *
 * @author makejava
 * @since 2020-09-16 09:08:17
 */
@Service("basEmployeesService")
public class BasEmployeesServiceImpl implements BasEmployeesService {
    @Resource
    private BasEmployeesDao basEmployeesDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BasEmployees queryById(String id) {
        return this.basEmployeesDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<BasEmployees> queryAllByLimit(int offset, int limit) {
        return this.basEmployeesDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param basEmployees 实例对象
     * @return 实例对象
     */
    @Override
    public BasEmployees insert(BasEmployees basEmployees) {
        this.basEmployeesDao.insert(basEmployees);
        return basEmployees;
    }

    /**
     * 修改数据
     *
     * @param basEmployees 实例对象
     * @return 实例对象
     */
    @Override
    public BasEmployees update(BasEmployees basEmployees) {
        this.basEmployeesDao.update(basEmployees);
        return this.queryById(basEmployees.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.basEmployeesDao.deleteById(id) > 0;
    }

    @Override
    public List<BasEmployees> queryByName(int i, int i1, String employeename) {
        return this.basEmployeesDao.queryByName(i, i1,employeename);
    }
}