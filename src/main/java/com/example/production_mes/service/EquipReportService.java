package com.example.production_mes.service;

import com.example.production_mes.entity.EquipReport;

import java.util.List;

public interface EquipReportService {
    List<EquipReport> queryAllByLimit(int offset, int limit);

    List<EquipReport> query(String type,String spec,String id);

    List<EquipReport> selectBy(String by);
}
