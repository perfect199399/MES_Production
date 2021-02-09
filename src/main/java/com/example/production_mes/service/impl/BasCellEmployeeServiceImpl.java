package com.example.production_mes.service.impl;

import com.example.production_mes.dao.BasCellEmployeeDao;
import com.example.production_mes.entity.BasCellEmployee;
import com.example.production_mes.service.BasCellEmployeeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (BasCellEmployee)表服务实现类
 *
 * @author makejava
 * @since 2020-09-16 09:08:14
 */
@Service("basCellEmployeeService")
public class BasCellEmployeeServiceImpl implements BasCellEmployeeService {
    @Resource
    private BasCellEmployeeDao basCellEmployeeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BasCellEmployee queryById(String id) {
        return this.basCellEmployeeDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<BasCellEmployee> queryAllByLimit(int offset, int limit) {
        return this.basCellEmployeeDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param basCellEmployee 实例对象
     * @return 实例对象
     */
    @Override
    public BasCellEmployee insert(BasCellEmployee basCellEmployee) {
        this.basCellEmployeeDao.insert(basCellEmployee);
        return basCellEmployee;
    }

    /**
     * 修改数据
     *
     * @param basCellEmployee 实例对象
     * @return 实例对象
     */
    @Override
    public BasCellEmployee update(BasCellEmployee basCellEmployee) {
        this.basCellEmployeeDao.update(basCellEmployee);
        return this.queryById(basCellEmployee.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.basCellEmployeeDao.deleteById(id) > 0;
    }

    @Override
    public List<BasCellEmployee> queryByName(int i, int i1, String employeename) {
        return this.basCellEmployeeDao.queryByName(i, i1,employeename);
    }
}