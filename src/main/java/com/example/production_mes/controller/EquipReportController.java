package com.example.production_mes.controller;


import com.example.production_mes.entity.EquipRepair;
import com.example.production_mes.entity.EquipReport;
import com.example.production_mes.service.EquipRepairService;
import com.example.production_mes.service.EquipReportService;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping("equipReport")
public class EquipReportController {

    @Resource
    private EquipReportService equipReportService;

    @GetMapping("selectAll")
    public List<EquipReport> selectAll() {
        return this.equipReportService.queryAllByLimit(0,1000);
    }

    @GetMapping("selectBy")
    public List<EquipReport> selectBy(String by) {
        return this.equipReportService.selectBy(by);
    }


    @RequestMapping(value="/ChartData1")
    @ResponseBody
    public List<List<Integer>> ChartData1() {
        List<EquipReport> list = this.equipReportService.queryAllByLimit(0,1000);
        Integer a1=0,a2=0,a3=0,a4=0,a5=0;
        Integer b1=0,b2=0,b3=0,b4=0,b5=0;
        Integer c1=0,c2=0,c3=0,c4=0,c5=0;
        for (EquipReport equipReport:list) {
            String specc = equipReport.getSpec();
            String typee = equipReport.getType();
            if(specc==null||typee==null)
                continue;
            if(specc.equals("0001")&&typee.equals("0001")){a1++;}
            else if(specc.equals("0001")&&typee.equals("0002")){a2++;}
            else if(specc.equals("0001")&&typee.equals("0003")){a3++;}
            else if(specc.equals("0001")&&typee.equals("0004")){a4++;}
            else if(specc.equals("0001")&&typee.equals("0005")){a5++;}
            else if(specc.equals("0002")&&typee.equals("0001")){b1++;}
            else if(specc.equals("0002")&&typee.equals("0002")){b2++;}
            else if(specc.equals("0002")&&typee.equals("0003")){b3++;}
            else if(specc.equals("0002")&&typee.equals("0004")){b4++;}
            else if(specc.equals("0002")&&typee.equals("0005")){b5++;}
            else if(specc.equals("0003")&&typee.equals("0001")){c1++;}
            else if(specc.equals("0003")&&typee.equals("0002")){c2++;}
            else if(specc.equals("0003")&&typee.equals("0003")){c3++;}
            else if(specc.equals("0003")&&typee.equals("0004")){c4++;}
            else if(specc.equals("0003")&&typee.equals("0005")){c5++;}
        }
        List<List<Integer>> result = new LinkedList<>();
        result.add(new LinkedList<>(Arrays.asList(a1, a2, a3, a4, a5)));
        result.add(new LinkedList<>(Arrays.asList(b1, b2, b3, b4, b5)));
        result.add(new LinkedList<>(Arrays.asList(c1, c2, c3, c4, c5)));
        return result;
    }



    @GetMapping("select")
    public List<EquipReport> select(@Param("type")String type, @Param("spec")String spec, @Param("id")String id) {
        return this.equipReportService.query(type,spec,id);
    }
}
