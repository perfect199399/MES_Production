package com.example.production_mes.controller;

import com.example.production_mes.dto.Result;
import com.example.production_mes.entity.BasEmployees;
import com.example.production_mes.entity.BasEnterprise;
import com.example.production_mes.entity.BasFactory;
import com.example.production_mes.service.BasEmployeesService;
import com.example.production_mes.utils.IDGenerator;
import com.example.production_mes.utils.TimeUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

/**
 * (BasEmployees)表控制层
 *
 * @author makejava
 * @since 2020-09-16 09:08:17
 */
@RestController
@RequestMapping("basEmployees")
public class BasEmployeesController {
    /**
     * 服务对象
     */
    @Resource
    private BasEmployeesService basEmployeesService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public BasEmployees selectOne(String id) {
        return this.basEmployeesService.queryById(id);
    }
    @GetMapping("selectAll")
    public List<BasEmployees> selectAll() {
        return this.basEmployeesService.queryAllByLimit(0,1000);
    }


    @GetMapping("deleteById")
    public Result deleteById(String id) {
        System.out.println(id);
        basEmployeesService.deleteById(id);
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
    public List<BasEmployees> all(@Param("name") String name, @Param("address") String address, @Param("pageIndex") int pageIndex, @Param("pageSize")  int pageSize, Model model){
        List<BasEmployees> BasEmployeesList = basEmployeesService.queryAllByLimit(pageIndex,pageSize);
//        System.out.println(pageIndex);
//        System.out.println(pageSize);
//        model.addAttribute("EquipFaultReport", EquipFaultReportList);
        if(!name.equals(""))
        {
//            System.out.println(name);
//            System.out.println(address);
//            List<BasEnterprise> BasEmployeesList2 = BasEmployeesService.queryByAddress(address,name);
//            return BasEmployeesList2;
        }
        return BasEmployeesList;
    }

    @RequestMapping(value="/edit")
    public Result edit(@RequestBody HashMap<String, String> map
    ) {

        BasEmployees basEmployees = new BasEmployees();
        basEmployees.setId(map.get("id"));
        basEmployees.setEmployeeno(map.get("employeeno"));
        basEmployees.setEmployeename(map.get("employeename"));
        basEmployees.setWorkdate(map.get("workdate"));
        basEmployees.setSex(map.get("sex"));
        basEmployees.setAge(Integer.valueOf(map.get("age")));
        basEmployees.setTelnum(map.get("telnum"));
        basEmployees.setAddress(map.get("address"));
        basEmployees.setEmail(map.get("email"));
        basEmployees.setIdcard(map.get("idcard"));
        basEmployees.setOfficeid(map.get("officeId"));
        basEmployees.setRemarks(map.get("remarks"));
        basEmployees = basEmployeesService.update(basEmployees);
        return Result.success("修改成功");
    }
    @RequestMapping(value="/add")
    public Result add(@RequestBody HashMap<String, String> map
    ) {
        BasEmployees BasEmployees = new BasEmployees();
        BasEmployees.setId(IDGenerator.generateIDByDateStr());
        System.out.println(BasEmployees.getId());
        BasEmployees.setEmployeeno(map.get("employeeNo"));
        BasEmployees.setEmployeename(map.get("employeeName"));
        BasEmployees.setWorkdate(map.get("workDate"));
        BasEmployees.setSex(map.get("sex"));
        BasEmployees.setAge(Integer.valueOf(map.get("age")));
        BasEmployees.setTelnum(map.get("telNum"));
        BasEmployees.setAddress(map.get("address"));
        BasEmployees.setEmail(map.get("email"));
        BasEmployees.setIdcard(map.get("idCard"));
        BasEmployees.setOfficeid(map.get("officeId"));
        BasEmployees.setRemarks(map.get("remarks"));
        BasEmployees.setDelFlag("0");
        BasEmployees.setCreateBy(map.get("createBy"));
        BasEmployees.setUpdateBy(map.get("createBy"));
        BasEmployees.setCreateDate(TimeUtils.StringToDate(TimeUtils.NowTime()));
        BasEmployees.setUpdateDate(TimeUtils.StringToDate(TimeUtils.NowTime()));
        basEmployeesService.insert(BasEmployees);
        return Result.success("添加成功");
    }
    @RequestMapping(value="/edit2",method= RequestMethod.POST)
    public Result edit2(@ModelAttribute BasEmployees BasEmployees) {
        System.out.println(BasEmployees.toString());
        basEmployeesService.update(BasEmployees);
        return Result.success("修改成功");
    }
    @GetMapping("selectByName")
    public List<BasEmployees>  selectByName(String employeename) {
        return this.basEmployeesService.queryByName(0,1000,employeename);
    }

}