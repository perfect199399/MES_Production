package com.example.production_mes.service.impl;

import com.example.production_mes.dao.TecFlowDao;
import com.example.production_mes.entity.TecFlow;
import com.example.production_mes.entity.TecProcess;
import com.example.production_mes.service.TecFlowService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 工艺路由维护（流程）(TecFlow)表服务实现类
 *
 * @author makejava
 * @since 2020-09-16 09:09:54
 */
@Service("tecFlowService")
public class TecFlowServiceImpl implements TecFlowService {
    @Resource
    private TecFlowDao tecFlowDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TecFlow queryById(String id) {
        return this.tecFlowDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<TecFlow> queryAllByLimit(int offset, int limit) {
        return this.tecFlowDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tecFlow 实例对象
     * @return 实例对象
     */
    @Override
    public TecFlow insert(TecFlow tecFlow) {
        this.tecFlowDao.insert(tecFlow);
        return tecFlow;
    }

    /**
     * 修改数据
     *
     * @param tecFlow 实例对象
     * @return 实例对象
     */
    @Override
    public TecFlow update(TecFlow tecFlow) {
        this.tecFlowDao.update(tecFlow);
        return this.queryById(tecFlow.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.tecFlowDao.deleteById(id) > 0;
    }

    @Override
    public List<TecFlow> select(String procode) {
        return this.tecFlowDao.select(procode);
    }

    /**
     * 通过修改flag删除数据
     * @param id
     */
    @Override
    public void updateById(String id) {
        this.tecFlowDao.updateById(id);
        return ;
    }
}