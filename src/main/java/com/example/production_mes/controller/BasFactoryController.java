package com.example.production_mes.controller;

import com.example.production_mes.dto.Result;
import com.example.production_mes.entity.BasEnterprise;
import com.example.production_mes.entity.BasFactory;
import com.example.production_mes.service.BasFactoryService;
import com.example.production_mes.utils.IDGenerator;
import com.example.production_mes.utils.TimeUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

/**
 * (BasFactory)表控制层
 *
 * @author makejava
 * @since 2020-09-16 09:09:26
 */
@RestController
@RequestMapping("basFactory")
public class BasFactoryController {
    /**
     * 服务对象
     */
    @Resource
    private BasFactoryService basFactoryService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public BasFactory selectOne(String id) {
        return this.basFactoryService.queryById(id);
    }
    @GetMapping("selectAll")
    public List<BasFactory> selectAll() {
        return this.basFactoryService.queryAllByLimit(0,1000);
    }


    @GetMapping("deleteById")
    public Result deleteById(String id) {
        System.out.println(id);
        basFactoryService.deleteById(id);
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
    public List<BasFactory> all(@Param("name") String name, @Param("address") String address, @Param("pageIndex") int pageIndex, @Param("pageSize")  int pageSize, Model model){
        List<BasFactory> BasFactoryList = basFactoryService.queryAllByLimit(pageIndex,pageSize);
//        System.out.println(pageIndex);
//        System.out.println(pageSize);
//        model.addAttribute("EquipFaultReport", EquipFaultReportList);
        if(!name.equals(""))
        {
//            System.out.println(name);
//            System.out.println(address);
//            List<BasEnterprise> BasFactoryList2 = basEnterpriseService.queryByAddress(address,name);
//            return BasFactoryList2;
        }
        return BasFactoryList;
    }

    @RequestMapping(value="/edit")
    public Result edit(@RequestBody HashMap<String, String> map
    ) {
        BasFactory basFactory = new BasFactory();
        basFactory.setId(map.get("id"));
        basFactory.setFactoryname(map.get("factoryname"));
        basFactory.setFactorybuilddate(map.get("factorybuildDate"));
        basFactory.setEnterpriseId(map.get("enterpriseid"));
        basFactory.setFactoryaddress(map.get("factoryaddress"));
        basFactory.setFactoryphone(map.get("factoryphone"));
        basFactory.setFactoryecode(map.get("factoryecode"));
        basFactory.setFactorybuildm(map.get("factorybuildm"));
        basFactory.setRemarks(map.get("remarks"));
//        basFactory.setCreateBy(map.get("createBy"));
//        basFactory.setUpdateBy(map.get("updateBy"));
        basFactory.setUpdateDate(TimeUtils.StringToDate(TimeUtils.NowTime()));
        basFactory = basFactoryService.update(basFactory);
        return Result.success("修改成功");
    }
    @RequestMapping(value="/add")
    public Result add(@RequestBody HashMap<String, String> map
    ) {
        BasFactory BasFactory = new BasFactory();
        BasFactory.setId(IDGenerator.generateIDByDateStr());
        System.out.println(BasFactory.getId());
        BasFactory.setEnterpriseId(map.get("enterpriseid"));
        BasFactory.setFactoryname(map.get("factoryName"));
        BasFactory.setFactorybuilddate(map.get("factoryBuildDate"));
        BasFactory.setFactoryaddress(map.get("factoryAddress"));
        BasFactory.setFactoryphone(map.get("factoryAddress"));
        BasFactory.setFactoryecode(map.get("factoryECode"));
        BasFactory.setFactorybuildm(map.get("factoryBuildM"));
        BasFactory.setCreateBy(map.get("create_by"));
        BasFactory.setUpdateBy(map.get("create_by"));
        BasFactory.setRemarks(map.get("remarks"));
        BasFactory.setUpdateDate(TimeUtils.StringToDate(TimeUtils.NowTime()));
        BasFactory.setCreateDate(TimeUtils.StringToDate(TimeUtils.NowTime()));
        BasFactory.setDelFlag("0");
        basFactoryService.insert(BasFactory);
        return Result.success("添加成功");
    }
    @RequestMapping(value="/edit2",method= RequestMethod.POST)
    public Result edit2(@ModelAttribute BasFactory BasFactory) {
        System.out.println(BasFactory.toString());
        basFactoryService.update(BasFactory);
        return Result.success("修改成功");
    }
    @GetMapping("selectByName")
    public List<BasFactory>  selectByName(String factoryname) {
        return this.basFactoryService.queryByName(0,1000,factoryname);
    }

}