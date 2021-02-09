package com.example.production_mes.controller;

import com.example.production_mes.dto.Result;
import com.example.production_mes.entity.BasEnterprise;
import com.example.production_mes.entity.EquipFaultReport;
import com.example.production_mes.entity.EquipRepair;
import com.example.production_mes.entity.QcViolaction;
import com.example.production_mes.service.BasEnterpriseService;
import com.example.production_mes.utils.IDGenerator;
import com.example.production_mes.utils.TimeUtils;
import io.netty.handler.codec.base64.Base64Encoder;
import org.apache.ibatis.annotations.Param;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

/**
 * (BasEnterprise)表控制层
 *
 * @author makejava
 * @since 2020-09-16 09:08:18
 */
@RestController
@RequestMapping("basEnterprise")
public class BasEnterpriseController {
    /**
     * 服务对象
     */
    @Resource
    private BasEnterpriseService basEnterpriseService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public BasEnterprise selectOne(String id) {
        return this.basEnterpriseService.queryById(id);
    }


    @GetMapping("deleteById")
    public Result deleteById(String id) {
        System.out.println(id);
        basEnterpriseService.deleteById(id);
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
    public List<BasEnterprise> all(@Param("name") String name, @Param("address") String address, @Param("pageIndex") int pageIndex, @Param("pageSize")  int pageSize, Model model){
        List<BasEnterprise> BasEnterpriseList = basEnterpriseService.queryAllByLimit(pageIndex,pageSize);
//        System.out.println(pageIndex);
//        System.out.println(pageSize);
//        model.addAttribute("EquipFaultReport", EquipFaultReportList);
        if(!name.equals(""))
        {
//            System.out.println(name);
//            System.out.println(address);
//            List<BasEnterprise> BasEnterpriseList2 = basEnterpriseService.queryByAddress(address,name);
//            return BasEnterpriseList2;
        }
        return BasEnterpriseList;
    }

    @RequestMapping(value="/edit")
    public Result edit(@RequestBody HashMap<String, String> map
    ) {
        BasEnterprise basEnterprise = new BasEnterprise();
        basEnterprise.setId(map.get("id"));
        basEnterprise.setEntername(map.get("entername"));
        basEnterprise.setEntercode(map.get("entercode"));
        basEnterprise.setEnterlevel(map.get("enterlevel"));
        basEnterprise.setEnternature(map.get("enternature"));
        basEnterprise.setEntercapital(map.get("entercapital"));
        basEnterprise.setEnterlperson(map.get("enterlperson"));
        basEnterprise.setEnterlpcard(map.get("enterlpcard"));
        basEnterprise.setEnteraddress(map.get("enteradress"));
        basEnterprise.setEmailcode(map.get("emailcode"));
        basEnterprise.setRemarks(map.get("remarks"));
        System.out.println(basEnterprise.getCreateDate());

        basEnterprise.setUpdateDate(TimeUtils.StringToDate(TimeUtils.NowTime()));
        basEnterprise = basEnterpriseService.update(basEnterprise);
        return Result.success("修改成功");
    }
    @RequestMapping(value="/add")
    public Result add(@RequestBody HashMap<String, String> map
    ) {
        BasEnterprise basEnterprise = new BasEnterprise();
        basEnterprise.setId(IDGenerator.generateIDByDateStr());
        System.out.println(basEnterprise.getId());
        basEnterprise.setEntername(map.get("enterName"));
        basEnterprise.setEntercode(map.get("enterCode"));
        basEnterprise.setEnterlevel(map.get("enterLevel"));
        basEnterprise.setEnternature(map.get("enterNature"));
        basEnterprise.setEntercapital(map.get("enterCapital"));
        basEnterprise.setEnterlperson(map.get("enterLperson"));
        basEnterprise.setEnterlpcard(map.get("enterlpCard"));
        basEnterprise.setEnteraddress(map.get("enterAdress"));
        basEnterprise.setEmailcode(map.get("emailCode"));
        basEnterprise.setRemarks(map.get("remarks"));
        basEnterprise.setDelFlag("0");
        basEnterprise.setCreateBy(map.get("createBy"));
        basEnterprise.setUpdateBy(map.get("createBy"));
        basEnterprise.setCreateDate(TimeUtils.StringToDate(TimeUtils.NowTime()));
        basEnterprise.setUpdateDate(TimeUtils.StringToDate(TimeUtils.NowTime()));
        basEnterpriseService.insert(basEnterprise);
        return Result.success("添加成功");
    }
    @RequestMapping(value="/edit2",method= RequestMethod.POST)
    public Result edit2(@ModelAttribute BasEnterprise BasEnterprise) {
        System.out.println(BasEnterprise.toString());
        basEnterpriseService.update(BasEnterprise);
        return Result.success("修改成功");
    }

    @GetMapping("selectAll")
    public List<BasEnterprise> selectAll() {
        return this.basEnterpriseService.queryAllByLimit(0,1000);
    }
    @GetMapping("selectByName")
    public List<BasEnterprise>  selectByName(String stationname) {
        return this.basEnterpriseService.queryByName(0,1000,stationname);
    }
}