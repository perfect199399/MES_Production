package com.example.production_mes.dao;

import com.example.production_mes.entity.EquipRepair;
import com.example.production_mes.entity.EquipReport;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EquipReportDao {



    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<EquipReport> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);

    List<EquipReport> query(@Param("type")String type,@Param("spec")String spec,@Param("id")String id);

    List<EquipReport> selectBy(String by);
}
