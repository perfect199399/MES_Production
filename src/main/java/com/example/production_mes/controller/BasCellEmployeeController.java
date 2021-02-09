package com.example.production_mes.controller;

import com.example.production_mes.dto.Result;
import com.example.production_mes.entity.BasCellEmployee;
import com.example.production_mes.entity.BasEnterprise;
import com.example.production_mes.entity.BasFactory;
import com.example.production_mes.service.BasCellEmployeeService;
import com.example.production_mes.utils.IDGenerator;
import com.example.production_mes.utils.TimeUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

/**
 * (BasCellEmployee)表控制层
 *
 * @author makejava
 * @since 2020-09-16 09:08:14
 */
@RestController
@RequestMapping("basCellEmployee")
public class BasCellEmployeeController {
    /**
     * 服务对象
     */
    @Resource
    private BasCellEmployeeService basCellEmployeeService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public BasCellEmployee selectOne(String id) {
        return this.basCellEmployeeService.queryById(id);
    }
    @GetMapping("selectAll")
    public List<BasCellEmployee> selectAll() {
        return this.basCellEmployeeService.queryAllByLimit(0,1000);
    }
    @GetMapping("selectByName")
    public List<BasCellEmployee>  selectByName(String employeename) {
        return this.basCellEmployeeService.queryByName(0,1000,employeename);
    }
    @GetMapping("deleteById")
    public Result deleteById(String id) {
        System.out.println(id);
        basCellEmployeeService.deleteById(id);
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
    public List<BasCellEmployee> all(@Param("name") String name, @Param("address") String address, @Param("pageIndex") int pageIndex, @Param("pageSize")  int pageSize, Model model){
        List<BasCellEmployee> BasCellEmployeeList = basCellEmployeeService.queryAllByLimit(pageIndex,pageSize);
//        System.out.println(pageIndex);
//        System.out.println(pageSize);
//        model.addAttribute("EquipFaultReport", EquipFaultReportList);
        if(!name.equals(""))
        {
//            System.out.println(name);
//            System.out.println(address);
//            List<BasEnterprise> BasCellEmployeeList2 = basEnterpriseService.queryByAddress(address,name);
//            return BasCellEmployeeList2;
        }
        return BasCellEmployeeList;
    }

    @RequestMapping(value="/edit")
    public Result edit(@RequestBody HashMap<String, String> map
    ) {
        BasCellEmployee BasCellEmployee = new BasCellEmployee();
        BasCellEmployee.setId(map.get("id"));
        BasCellEmployee.setEmployeeId(map.get("employee_id"));
        BasCellEmployee.setCellId(map.get("cell_id"));
        BasCellEmployee.setRemarks(map.get("remarks"));
        BasCellEmployee.setUpdateDate(TimeUtils.StringToDate(TimeUtils.NowTime()));
        BasCellEmployee = basCellEmployeeService.update(BasCellEmployee);
        return Result.success("修改成功");
    }
    @RequestMapping(value="/add")
    public Result add(@RequestBody HashMap<String, String> map
    ) {
        BasCellEmployee BasCellEmployee = new BasCellEmployee();
        BasCellEmployee.setId(IDGenerator.generateIDByDateStr());
        System.out.println(BasCellEmployee.getId());
        BasCellEmployee.setEmployeeId(map.get("employee_id"));
        BasCellEmployee.setCellId(map.get("cell_id"));
        BasCellEmployee.setDelFlag("0");
        BasCellEmployee.setRemarks(map.get("remarks"));
        BasCellEmployee.setUpdateDate(TimeUtils.StringToDate(TimeUtils.NowTime()));
        BasCellEmployee.setCreateDate(TimeUtils.StringToDate(TimeUtils.NowTime()));
        BasCellEmployee.setCreateBy(map.get("createBy"));
        basCellEmployeeService.insert(BasCellEmployee);
        return Result.success("添加成功");
    }
    @RequestMapping(value="/edit2",method= RequestMethod.POST)
    public Result edit2(@ModelAttribute BasCellEmployee BasCellEmployee) {
        System.out.println(BasCellEmployee.toString());
        basCellEmployeeService.update(BasCellEmployee);
        return Result.success("修改成功");
    }



}