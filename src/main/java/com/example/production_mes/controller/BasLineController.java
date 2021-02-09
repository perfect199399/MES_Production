package com.example.production_mes.controller;

import com.example.production_mes.dto.Result;
import com.example.production_mes.entity.BasFactory;
import com.example.production_mes.entity.BasLine;
import com.example.production_mes.entity.BasWorkshop;
import com.example.production_mes.service.BasLineService;
import com.example.production_mes.utils.IDGenerator;
import com.example.production_mes.utils.TimeUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

/**
 * (BasLine)表控制层
 *
 * @author makejava
 * @since 2020-09-16 09:09:27
 */
@RestController
@RequestMapping("basLine")
public class BasLineController {
    /**
     * 服务对象
     */
    @Resource
    private BasLineService basLineService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public BasLine selectOne(String id) {
        return this.basLineService.queryById(id);
    }
    @GetMapping("selectAll")
    public List<BasLine> selectAll() {
        return this.basLineService.queryAllByLimit(0,1000);
    }
    @GetMapping("deleteById")
    public Result deleteById(String id) {
        System.out.println(id);
        basLineService.deleteById(id);
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
    public List<BasLine> all(@Param("name") String name, @Param("address") String address, @Param("pageIndex") int pageIndex, @Param("pageSize")  int pageSize, Model model){
        List<BasLine> BasLineList = basLineService.queryAllByLimit(pageIndex,pageSize);
//        System.out.println(pageIndex);
//        System.out.println(pageSize);
//        model.addAttribute("EquipFaultReport", EquipFaultReportList);
        if(!name.equals(""))
        {
//            System.out.println(name);
//            System.out.println(address);
//            List<BasEnterprise> BasLineList2 = basEnterpriseService.queryByAddress(address,name);
//            return BasLineList2;
        }
        return BasLineList;
    }

    @RequestMapping(value="/edit")
    public Result edit(@RequestBody HashMap<String, String> map
    ) {
        BasLine basLine = new BasLine();
        basLine.setId(map.get("id"));
        basLine.setWorkshopId(map.get("workshopid"));
        basLine.setLinename(map.get("linename"));
        basLine.setLinenumber(map.get("linenumber"));
        basLine.setLinemaster(map.get("linemaster"));
        basLine.setLinedescription(map.get("linedescription"));
        basLine.setRemarks(map.get("remarks"));
//        System.out.println(basLine.getLinename()+"************");
        basLine.setUpdateDate(TimeUtils.StringToDate(TimeUtils.NowTime()));
        basLine = basLineService.update(basLine);
//        System.out.println(map.get("linename")+"************");
        return Result.success("修改成功");
    }
    @RequestMapping(value="/add")
    public Result add(@RequestBody HashMap<String, String> map
    ) {
        BasLine BasLine = new BasLine();
        BasLine.setId(IDGenerator.generateIDByDateStr());
        System.out.println(BasLine.getId());
        BasLine.setWorkshopId(map.get("workshopid"));
        BasLine.setLinename(map.get("lineName"));
        BasLine.setLinenumber(map.get("lineNumber"));
        BasLine.setLinemaster(map.get("lineMaster"));
        BasLine.setLinedescription(map.get("lineDescription"));
        BasLine.setCreateBy("createBy");
        BasLine.setUpdateBy("createBy");
        BasLine.setDelFlag("1");
        BasLine.setRemarks(map.get("remarks"));
        BasLine.setUpdateDate(TimeUtils.StringToDate(TimeUtils.NowTime()));
        BasLine.setCreateDate(TimeUtils.NowTimeN());
        basLineService.insert(BasLine);
        return Result.success("添加成功");
    }
    @RequestMapping(value="/edit2",method= RequestMethod.POST)
    public Result edit2(@ModelAttribute BasLine BasLine) {
        System.out.println(BasLine.toString());
        basLineService.update(BasLine);
        return Result.success("修改成功");
    }
    @GetMapping("selectByName")
    public List<BasLine>  selectByName(String linename) {
        return this.basLineService.queryByName(0,1000,linename);
    }

}