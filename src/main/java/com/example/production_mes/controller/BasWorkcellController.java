package com.example.production_mes.controller;

import com.example.production_mes.dto.Result;
import com.example.production_mes.entity.BasFactory;
import com.example.production_mes.entity.BasLine;
import com.example.production_mes.entity.BasWorkcell;
import com.example.production_mes.entity.BasWorkshop;
import com.example.production_mes.service.BasWorkcellService;
import com.example.production_mes.utils.IDGenerator;
import com.example.production_mes.utils.TimeUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

/**
 * (BasWorkcell)表控制层
 *
 * @author makejava
 * @since 2020-09-16 09:09:30
 */
@RestController
@RequestMapping("basWorkcell")
public class BasWorkcellController {
    /**
     * 服务对象
     */
    @Resource
    private BasWorkcellService basWorkcellService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public BasWorkcell selectOne(String id) {
        return this.basWorkcellService.queryById(id);
    }

    @GetMapping("selectAll")
    public List<BasWorkcell> selectAll() {
        return this.basWorkcellService.queryAllByLimit(0,1000);
    }


    @GetMapping("deleteById")
    public Result deleteById(String id) {
        System.out.println(id);
        basWorkcellService.deleteById(id);
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
    public List<BasWorkcell> all(@Param("name") String name, @Param("address") String address, @Param("pageIndex") int pageIndex, @Param("pageSize")  int pageSize, Model model){
        List<BasWorkcell> BasWorkcellList = basWorkcellService.queryAllByLimit(pageIndex,pageSize);
//        System.out.println(pageIndex);
//        System.out.println(pageSize);
//        model.addAttribute("EquipFaultReport", EquipFaultReportList);
        if(!name.equals(""))
        {
//            System.out.println(name);
//            System.out.println(address);
//            List<BasEnterprise> BasWorkcellList2 = basEnterpriseService.queryByAddress(address,name);
//            return BasWorkcellList2;
        }
        return BasWorkcellList;
    }

    @RequestMapping(value="/edit")
    public Result edit(@RequestBody HashMap<String, String> map
    ) {
        BasWorkcell BasWorkcell = new BasWorkcell();
        BasWorkcell.setId(map.get("id"));
        BasWorkcell.setStationId(map.get("station_id"));
        BasWorkcell.setCellname(map.get("cellname"));
        BasWorkcell.setCellnumber(map.get("cellnumber"));
        BasWorkcell.setCellmaster(map.get("cellmaster"));
        BasWorkcell.setCelldescription(map.get("celldescription"));
        BasWorkcell.setRemarks(map.get("remarks"));
        BasWorkcell.setUpdateDate(TimeUtils.StringToDate(TimeUtils.NowTime()));
        BasWorkcell = basWorkcellService.update(BasWorkcell);
        return Result.success("修改成功");
    }
    @RequestMapping(value="/add")
    public Result add(@RequestBody HashMap<String, String> map
    ) {
        BasWorkcell BasWorkcell = new BasWorkcell();
        BasWorkcell.setId(IDGenerator.generateIDByDateStr());
        System.out.println(BasWorkcell.getId());
        BasWorkcell.setStationId(map.get("station_id"));
        BasWorkcell.setCellname(map.get("cellName"));
        BasWorkcell.setCellnumber(map.get("cellNumber"));
        BasWorkcell.setCellmaster(map.get("cellMaster"));
        BasWorkcell.setCelldescription(map.get("cellDescription"));
        BasWorkcell.setRemarks(map.get("remarks"));
        BasWorkcell.setDelFlag("0");
        BasWorkcell.setCreateBy(map.get("createBy"));
        BasWorkcell.setUpdateBy(map.get("createBy"));
        BasWorkcell.setUpdateDate(TimeUtils.StringToDate(TimeUtils.NowTime()));
        BasWorkcell.setCreateDate(TimeUtils.StringToDate(TimeUtils.NowTime()));
        basWorkcellService.insert(BasWorkcell);
        return Result.success("添加成功");
    }
    @RequestMapping(value="/edit2",method= RequestMethod.POST)
    public Result edit2(@ModelAttribute BasWorkcell BasWorkcell) {
        System.out.println(BasWorkcell.toString());
        basWorkcellService.update(BasWorkcell);
        return Result.success("修改成功");
    }

    @GetMapping("selectByName")
    public List<BasWorkcell>  selectByName(String cellname) {
        return this.basWorkcellService.queryByName(0,1000,cellname);
    }
}