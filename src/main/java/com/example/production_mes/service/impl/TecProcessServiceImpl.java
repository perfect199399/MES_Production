package com.example.production_mes.service.impl;

import com.example.production_mes.dao.TecProcessDao;
import com.example.production_mes.entity.TecProcess;
import com.example.production_mes.service.TecProcessService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 工艺基础数据维护（工序）(TecProcess)表服务实现类
 *
 * @author makejava
 * @since 2020-09-16 09:09:55
 */
@Service("tecProcessService")
public class TecProcessServiceImpl implements TecProcessService {
    @Resource
    private TecProcessDao tecProcessDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TecProcess queryById(String id) {
        return this.tecProcessDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<TecProcess> queryAllByLimit(int offset, int limit) {
        return this.tecProcessDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tecProcess 实例对象
     * @return 实例对象
     */
    @Override
    public TecProcess insert(TecProcess tecProcess) {
        this.tecProcessDao.insert(tecProcess);
        return tecProcess;
    }

    /**
     * 修改数据
     *
     * @param tecProcess 实例对象
     * @return 实例对象
     */
    @Override
    public TecProcess update(TecProcess tecProcess) {
        this.tecProcessDao.update(tecProcess);
        return this.queryById(tecProcess.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.tecProcessDao.deleteById(id) > 0;
    }

    /**
     * 通过修改flag删除数据
     * @param id
     */
    @Override
    public void updateById(String id) {
        this.tecProcessDao.updateById(id);
        return ;
    }


    /**
     * 条件查询
     * @param procode
     * @return
     */
    @Override
    public List<TecProcess> select(String procode) {
        return this.tecProcessDao.select(procode);
    }
}