package com.example.production_mes.controller;

import com.example.production_mes.dto.Result;
import com.example.production_mes.entity.EquipFaultReport;
import com.example.production_mes.entity.EquipMaintenancePlan;
import com.example.production_mes.entity.EquipReport;
import com.example.production_mes.service.EquipMaintenancePlanService;
import com.example.production_mes.utils.IDGenerator;
import com.example.production_mes.utils.TimeUtils;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

import static com.example.production_mes.utils.IDGenerator.generateIDByDateStr;
import static com.example.production_mes.utils.TimeUtils.NowTimeN;

/**
 * (EquipMaintenancePlan)表控制层
 *
 * @author makejava
 * @since 2020-09-16 09:09:34
 */
@RestController
@RequestMapping("equipMaintenancePlan")
public class EquipMaintenancePlanController {
    /**
     * 服务对象
     */
    @Resource
    private EquipMaintenancePlanService equipMaintenancePlanService;

    /**
     * 查找全部
     * @return
     */
    @GetMapping("selectAll")
    public List<EquipMaintenancePlan> selectAll() {
        return this.equipMaintenancePlanService.queryAllByLimit(0,1000);
    }

    /**
     * 条件查询
     * @return
     */
    @GetMapping("selectByType")
    public List<EquipMaintenancePlan> selectByType(String equip_type) {
        return this.equipMaintenancePlanService.selectByType(equip_type);
    }
    /**
     * 条件查询2
     * @return
     */
    @GetMapping("selectBy")
    public List<EquipMaintenancePlan> selectBy(String by) {
        return this.equipMaintenancePlanService.selectBy(by);
    }
    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public EquipMaintenancePlan selectOne(String id) {
        return this.equipMaintenancePlanService.queryById(id);
    }

    /**
     * 修改
      * @param map
     * @return
     */
    @RequestMapping(value="/edit")
    public Result edit(@RequestBody HashMap<String, String> map
    ) {
        EquipMaintenancePlan equipMaintenancePlan = new EquipMaintenancePlan();

        equipMaintenancePlan.setId(map.get("id"));
        equipMaintenancePlan.setEquipType(map.get("equipType"));
        equipMaintenancePlan.setCycle(map.get("cycle"));
        equipMaintenancePlan.setWarnTime(Integer.valueOf(map.get("warnTime")));
        equipMaintenancePlan.setUserName(map.get("userName"));
        equipMaintenancePlan.setMaintenance(map.get("maintenance"));
        equipMaintenancePlan = equipMaintenancePlanService.update(equipMaintenancePlan);
        return Result.success("修改成功");
    }

    /**
     * 添加
     * @param map
     * @return
     */
    @RequestMapping(value="/add")
    public Result add(@RequestBody HashMap<String, String> map
    ) {
        EquipMaintenancePlan equipMaintenancePlan = new EquipMaintenancePlan();
        equipMaintenancePlan.setId(generateIDByDateStr());
        equipMaintenancePlan.setEquipType(map.get("equipType"));
        equipMaintenancePlan.setCycle(map.get("cycle"));
        equipMaintenancePlan.setWarnTime(Integer.valueOf(map.get("warnTime")));
        equipMaintenancePlan.setUserName(map.get("userName"));
        equipMaintenancePlan.setMaintenance(map.get("maintenance"));
        equipMaintenancePlan.setCreateDate(NowTimeN());
        equipMaintenancePlan.setUpdateDate(NowTimeN());
        equipMaintenancePlan.setUpdateBy(map.get("userName"));
        equipMaintenancePlan.setDelFlag("0");
        equipMaintenancePlan = equipMaintenancePlanService.insert(equipMaintenancePlan);
        return Result.success("添加成功");
    }

    @GetMapping("delete")
    public Result delete(String id) {
        equipMaintenancePlanService.delete(id);
        return Result.success("删除成功");
    }


}