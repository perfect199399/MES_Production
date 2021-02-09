package com.example.production_mes.controller;

import com.example.production_mes.dto.Result;
import com.example.production_mes.entity.EquipFaultReport;
import com.example.production_mes.entity.EquipRepair;
import com.example.production_mes.service.EquipRepairService;
import com.example.production_mes.utils.TimeUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

import static com.example.production_mes.utils.IDGenerator.generateIDByDateStr;

/**
 * (EquipRepair)表控制层
 *
 * @author makejava
 * @since 2020-09-16 09:09:34
 */
@RestController
@RequestMapping("equipRepair")
public class EquipRepairController {
    /**
     * 服务对象
     */
    @Resource
    private EquipRepairService equipRepairService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public EquipRepair selectOne(String id) {
        return this.equipRepairService.queryById(id);
    }

    /**
     * 查询报告
     * @param mid
     * @return
     */
   @GetMapping("selectByMid")
    public EquipRepair selectByMid(String mid) {
        return this.equipRepairService.selectByMid(mid);
    }



    @GetMapping("selectAll")
    public List<EquipRepair> selectAll() {
        return this.equipRepairService.queryAllByLimit(0,1000);
    }
    /**
     * 提交维修报告
     * @param map
     * @return
     */
    @RequestMapping(value="/add")
    public Result editReport(@RequestBody HashMap<String, String> map
    ) {
        EquipRepair equipRepair = new EquipRepair();

        equipRepair.setId(generateIDByDateStr());
        equipRepair.setMid(map.get("id"));
        equipRepair.setFaultType(map.get("faultType"));
        equipRepair.setDelFlag("0");
        equipRepair.setFaultReason(map.get("faultReason"));
        equipRepair.setFaultDesc(map.get("faultDesc"));
        equipRepair.setCreateBy(map.get("reportPerson"));
        equipRepair.setCreateDate(TimeUtils.StringToDate(TimeUtils.NowTime()));
        equipRepair = equipRepairService.insert(equipRepair);
        return Result.success("维修单上传成功");
    }


}