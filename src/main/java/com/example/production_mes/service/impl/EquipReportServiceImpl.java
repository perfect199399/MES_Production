package com.example.production_mes.service.impl;


import com.example.production_mes.dao.EquipRepairDao;
import com.example.production_mes.dao.EquipReportDao;
import com.example.production_mes.entity.EquipRepair;
import com.example.production_mes.entity.EquipReport;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("equipReportService")
public class EquipReportServiceImpl implements com.example.production_mes.service.EquipReportService {

    @Resource
    private EquipReportDao equipReportDao;



    @Override
    public List<EquipReport> queryAllByLimit(int offset, int limit) {
        return this.equipReportDao.queryAllByLimit(offset, limit);
    }

    @Override
    public List<EquipReport> query(String type,String spec,String id) {
        return this.equipReportDao.query(type,spec,id);
    }

    @Override
    public List<EquipReport> selectBy(String by) {
        return this.equipReportDao.selectBy(by);
    }

}
