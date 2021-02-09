package com.example.production_mes.controller;

import com.example.production_mes.entity.EquipFaultReport;
import com.example.production_mes.entity.EquipMaintenancePlan;
import com.example.production_mes.entity.EquipReport;
import com.example.production_mes.service.EquipFaultReportService;
import com.example.production_mes.utils.IDGenerator;
import com.example.production_mes.utils.TimeUtils;
import org.apache.ibatis.annotations.Param;
import com.example.production_mes.dto.Result;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * (EquipFaultReport)表控制层
 *
 * @author makejava
 * @since 2020-09-16 09:09:33
 */
@RestController
@RequestMapping("equipFaultReport")
public class EquipFaultReportController {
    /**
     * 服务对象
     */
    @Resource
    private EquipFaultReportService equipFaultReportService;
    /**
     * 查找全部
     * @return
     */
    @GetMapping("selectAll")
    public List<EquipFaultReport> selectAll() {
        return this.equipFaultReportService.queryAllByLimit(0,1000);
    }

    /**
     * 首页图表
     * @return
     */

    @GetMapping("ChartData2")
    public List<List<Integer>> ChartData2() {
        List<EquipFaultReport> list = this.equipFaultReportService.queryAllByLimit(0,1000);
        Integer a1=0,a2=0,a3=0,a4=0;
        Integer b1=0,b2=0,b3=0,b4=0;
        Integer c1=0,c2=0,c3=0,c4=0;
        Integer d1=0,d2=0,d3=0,d4=0;
        Integer e1=0,e2=0,e3=0,e4=0;
        for (EquipFaultReport equipFaultReport:list) {
            String EquipTypee = equipFaultReport.getEquipType();
            String EquipLocc = equipFaultReport.getEquipLoc();
            System.out.print(EquipTypee);
            System.out.println(EquipLocc);
            if(EquipTypee==null||EquipLocc==null)
                continue;
            if(EquipTypee.equals("0001")&&EquipLocc.equals("0001")){a1++;}
            else if(EquipTypee.equals("0001")&&EquipLocc.equals("0002")){a2++;}
            else if(EquipTypee.equals("0001")&&EquipLocc.equals("0003")){a3++;}
            else if(EquipTypee.equals("0001")&&EquipLocc.equals("0004")){a4++;}
            else if(EquipTypee.equals("0002")&&EquipLocc.equals("0001")){b1++;}
            else if(EquipTypee.equals("0002")&&EquipLocc.equals("0002")){b2++;}
            else if(EquipTypee.equals("0002")&&EquipLocc.equals("0003")){b3++;}
            else if(EquipTypee.equals("0002")&&EquipLocc.equals("0004")){b4++;}
            else if(EquipTypee.equals("0003")&&EquipLocc.equals("0001")){c1++;}
            else if(EquipTypee.equals("0003")&&EquipLocc.equals("0002")){c2++;}
            else if(EquipTypee.equals("0003")&&EquipLocc.equals("0003")){c3++;}
            else if(EquipTypee.equals("0003")&&EquipLocc.equals("0004")){c4++;}
            else if(EquipTypee.equals("0004")&&EquipLocc.equals("0001")){d1++;}
            else if(EquipTypee.equals("0004")&&EquipLocc.equals("0002")){d2++;}
            else if(EquipTypee.equals("0004")&&EquipLocc.equals("0003")){d3++;}
            else if(EquipTypee.equals("0004")&&EquipLocc.equals("0004")){d4++;}
            else if(EquipTypee.equals("0005")&&EquipLocc.equals("0001")){e1++;}
            else if(EquipTypee.equals("0005")&&EquipLocc.equals("0002")){e2++;}
            else if(EquipTypee.equals("0005")&&EquipLocc.equals("0003")){e3++;}
            else if(EquipTypee.equals("0005")&&EquipLocc.equals("0004")){e4++;}

        }
        List<List<Integer>> result = new LinkedList<>();
        result.add(new LinkedList<>(Arrays.asList(a1, a2, a3, a4)));
        result.add(new LinkedList<>(Arrays.asList(b1, b2, b3, b4)));
        result.add(new LinkedList<>(Arrays.asList(c1, c2, c3, c4)));
        result.add(new LinkedList<>(Arrays.asList(d1, d2, d3, d4)));
        result.add(new LinkedList<>(Arrays.asList(e1, e2, e3, e4)));
        return result;
    }



    /**
     * 条件查询2
     * @return
     */
    @GetMapping("selectBy")
    public List<EquipFaultReport> selectBy(String by) {
        return this.equipFaultReportService.selectBy(by);
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public EquipFaultReport selectOne(String id) {
        return this.equipFaultReportService.queryById(id);
    }

    @GetMapping("deleteById")
    public Result deleteById(String id) {
        System.out.println(id);
        equipFaultReportService.deleteById(id);
        return Result.success("删除成功");
    }

    /**
     * 查询
     * 搜索时时使用了动态sql
     * @param name
     * @param address
     * @param pageIndex
     * @param pageSize
     * @param model
     * @return
     */
    @RequestMapping("/all")
    public List<EquipFaultReport> all(@Param("name") String name,@Param("address") String address, @Param("pageIndex") int pageIndex,@Param("pageSize")  int pageSize, Model model){
        List<EquipFaultReport> EquipFaultReportList = equipFaultReportService.queryAllByLimit(pageIndex,pageSize);
//        System.out.println(pageIndex);
//        System.out.println(pageSize);
//        model.addAttribute("EquipFaultReport", EquipFaultReportList);
        if(!name.equals(""))
        {
//            System.out.println(name);
//            System.out.println(address);
            List<EquipFaultReport> EquipFaultReportList2 = equipFaultReportService.queryByAddress(address,name);
            return EquipFaultReportList2;
        }
        return EquipFaultReportList;
    }

    /**
     * 条件查询
     * @param equip_type
     * @param equip_loc
     * @param status
     * @return
     */
    @GetMapping("select")
    public List<EquipFaultReport> select(@Param("equip_type")String equip_type, @Param("equip_loc")String equip_loc, @Param("status")String status) {
        return this.equipFaultReportService.query(equip_type,equip_loc,status);
    }

    /**
     * 派工
     * @param map
     * @return
     */
    @RequestMapping(value="/edit")
    public Result edit(@RequestBody HashMap<String, String> map
    ) {
        EquipFaultReport equipFaultReport = new EquipFaultReport();
        equipFaultReport.setId(map.get("id"));
        equipFaultReport.setEquipId(map.get("equipId"));
        equipFaultReport.setEquipNo(map.get("equipNo"));
        equipFaultReport.setEquipType(map.get("equipType"));
        equipFaultReport.setEquipLoc(map.get("equipLoc"));
        equipFaultReport.setFaultDesc(map.get("faultDesc"));
        equipFaultReport.setReportPerson(map.get("reportPerson"));
        equipFaultReport.setMaintenanceWorker(map.get("maintenanceWorker"));
        equipFaultReport.setStatus("0002");
        equipFaultReport.setAssignTime(TimeUtils.StringToDate(TimeUtils.NowTime()));
        equipFaultReport.setUpdateBy(map.get("reportPerson"));
        equipFaultReport.setRemarks(map.get("remarks"));
        equipFaultReport.setCreateBy(map.get("createBy"));
        equipFaultReport.setUpdateBy(map.get("updateBy"));
        equipFaultReport.setUpdateDate(TimeUtils.StringToDate(TimeUtils.NowTime()));
        equipFaultReport = equipFaultReportService.update(equipFaultReport);
        return Result.success("派工成功");
    }

    /**
     * 报修
     * @param map
     * @return
     */
    @RequestMapping(value="/add")
    public Result add(@RequestBody HashMap<String, String> map
    ) {
        EquipFaultReport equipFaultReport = new EquipFaultReport();
        equipFaultReport.setId(IDGenerator.generateIDByDateStr());
        System.out.println(equipFaultReport.getId());
        equipFaultReport.setEquipId(map.get("equipId"));
        equipFaultReport.setEquipNo(map.get("equipNo"));
        equipFaultReport.setEquipType(map.get("equipType"));
        equipFaultReport.setEquipLoc(map.get("equipLoc"));
        equipFaultReport.setFaultDesc(map.get("faultDesc"));
        equipFaultReport.setStatus("0001");
        equipFaultReport.setDelFlag("0");
        equipFaultReport.setReportPerson(map.get("reportPerson"));
        equipFaultReport.setCreateBy(map.get("reportPerson"));
        equipFaultReport.setCreateDate(TimeUtils.StringToDate(TimeUtils.NowTime()));
        equipFaultReport.setMaintenanceWorker(map.get("maintenanceWorker"));
        equipFaultReport.setRemarks(map.get("remarks"));
        equipFaultReport.setCreateBy(map.get("createBy"));
        equipFaultReport.setUpdateBy(map.get("updateBy"));
        equipFaultReport.setUpdateDate(TimeUtils.StringToDate(TimeUtils.NowTime()));
        equipFaultReportService.insert(equipFaultReport);
        return Result.success("添加成功");
    }

    @RequestMapping(value="/edit2",method= RequestMethod.POST)
    public Result edit2(@ModelAttribute EquipFaultReport equipFaultReport) {
        System.out.println(equipFaultReport.toString());
        equipFaultReportService.update(equipFaultReport);
        return Result.success("修改成功");
    }



}
