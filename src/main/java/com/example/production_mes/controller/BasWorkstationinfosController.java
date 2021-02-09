package com.example.production_mes.controller;

import com.example.production_mes.dto.Result;
import com.example.production_mes.entity.BasWorkshop;
import com.example.production_mes.entity.BasWorkstationinfos;
import com.example.production_mes.service.BasWorkstationinfosService;
import com.example.production_mes.utils.IDGenerator;
import com.example.production_mes.utils.TimeUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

/**
 * (BasWorkstationinfos)表控制层
 *
 * @author makejava
 * @since 2020-09-16 09:09:32
 */
@RestController
@RequestMapping("basWorkstationinfos")
public class BasWorkstationinfosController {
    /**
     * 服务对象
     */
    @Resource
    private BasWorkstationinfosService basWorkstationinfosService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public BasWorkstationinfos selectOne(String id) {
        return this.basWorkstationinfosService.queryById(id);
    }
    @GetMapping("selectAll")
    public List<BasWorkstationinfos> selectAll() {
        return this.basWorkstationinfosService.queryAllByLimit(0,1000);
    }



    @GetMapping("deleteById")
    public Result deleteById(String id) {
        System.out.println(id);
        basWorkstationinfosService.deleteById(id);
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
    public List<BasWorkstationinfos> all(@Param("name") String name, @Param("address") String address, @Param("pageIndex") int pageIndex, @Param("pageSize")  int pageSize, Model model){
        List<BasWorkstationinfos> BasWorkstationinfosList = basWorkstationinfosService.queryAllByLimit(pageIndex,pageSize);
//        System.out.println(pageIndex);
//        System.out.println(pageSize);
//        model.addAttribute("EquipFaultReport", EquipFaultReportList);
        if(!name.equals(""))
        {
//            System.out.println(name);
//            System.out.println(address);
//            List<BasEnterprise> BasWorkstationinfosList2 = basEnterpriseService.queryByAddress(address,name);
//            return BasWorkstationinfosList2;
        }
        return BasWorkstationinfosList;
    }

    @RequestMapping(value="/edit")
    public Result edit(@RequestBody HashMap<String, String> map
    ) {
        BasWorkstationinfos BasWorkstationinfos = new BasWorkstationinfos();
        BasWorkstationinfos.setId(map.get("id"));
        BasWorkstationinfos.setLineId(map.get("line_id"));
        BasWorkstationinfos.setStationname(map.get("stationname"));
        BasWorkstationinfos.setStationno(map.get("stationno"));
        BasWorkstationinfos.setStationmaster(map.get("stationmaster"));
        BasWorkstationinfos.setRemarks(map.get("remarks"));
        BasWorkstationinfos.setUpdateDate(TimeUtils.StringToDate(TimeUtils.NowTime()));
        BasWorkstationinfos = basWorkstationinfosService.update(BasWorkstationinfos);
        return Result.success("修改成功");
    }
    @RequestMapping(value="/add")
    public Result add(@RequestBody HashMap<String, String> map
    ) {
        BasWorkstationinfos BasWorkstationinfos = new BasWorkstationinfos();
        BasWorkstationinfos.setId(IDGenerator.generateIDByDateStr());
        System.out.println(BasWorkstationinfos.getId());
        BasWorkstationinfos.setLineId(map.get("line_id"));
        BasWorkstationinfos.setStationname(map.get("stationName"));
        BasWorkstationinfos.setStationno(map.get("stationNo"));
        BasWorkstationinfos.setStationmaster(map.get("stationMaster"));
        BasWorkstationinfos.setRemarks(map.get("remarks"));
        BasWorkstationinfos.setDelFlag("0");
        BasWorkstationinfos.setCreateBy(map.get("createBy"));
        BasWorkstationinfos.setUpdateBy(map.get("createBy"));
        BasWorkstationinfos.setCreateDate(TimeUtils.StringToDate(TimeUtils.NowTime()));
        BasWorkstationinfos.setUpdateDate(TimeUtils.StringToDate(TimeUtils.NowTime()));
        basWorkstationinfosService.insert(BasWorkstationinfos);
        return Result.success("添加成功");
    }
    @RequestMapping(value="/edit2",method= RequestMethod.POST)
    public Result edit2(@ModelAttribute BasWorkstationinfos BasWorkstationinfos) {
        System.out.println(BasWorkstationinfos.toString());
        basWorkstationinfosService.update(BasWorkstationinfos);
        return Result.success("修改成功");
    }
    @GetMapping("selectByName")
    public List<BasWorkstationinfos>  selectByName(String stationname) {
        return this.basWorkstationinfosService.queryByName(0,1000,stationname);
    }


}