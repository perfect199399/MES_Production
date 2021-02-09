package com.example.production_mes.service.impl;

import com.example.production_mes.dao.TecFlowProcessDao;
import com.example.production_mes.entity.TecFlowProcess;
import com.example.production_mes.service.TecFlowProcessService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 工艺路由与工序关系(TecFlowProcess)表服务实现类
 *
 * @author makejava
 * @since 2020-09-16 09:09:54
 */
@Service("tecFlowProcessService")
public class TecFlowProcessServiceImpl implements TecFlowProcessService {
    @Resource
    private TecFlowProcessDao tecFlowProcessDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TecFlowProcess queryById(String id) {
        return this.tecFlowProcessDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<TecFlowProcess> queryAllByLimit(int offset, int limit) {
        return this.tecFlowProcessDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tecFlowProcess 实例对象
     * @return 实例对象
     */
    @Override
    public TecFlowProcess insert(TecFlowProcess tecFlowProcess) {
        this.tecFlowProcessDao.insert(tecFlowProcess);
        return tecFlowProcess;
    }

    /**
     * 修改数据
     *
     * @param tecFlowProcess 实例对象
     * @return 实例对象
     */
    @Override
    public TecFlowProcess update(TecFlowProcess tecFlowProcess) {
        this.tecFlowProcessDao.update(tecFlowProcess);
        return this.queryById(tecFlowProcess.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.tecFlowProcessDao.deleteById(id) > 0;
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @param flowname 所属流程名
     * @return 对象列表
     */
    @Override
    public List<TecFlowProcess> queryByName(int offset, int limit, String flowname) {
        return this.tecFlowProcessDao.queryByName(offset, limit,flowname);
    }

    /**
     * 通过id删除指定数据
     * @param id
     * @return
     */
    @Override
    public void updateById(String id) {
        this.tecFlowProcessDao.updateById(id);
        return ;
    }
}