package com.example.production_mes.controller;

import com.example.production_mes.dto.Result;
import com.example.production_mes.entity.BasEnterprise;
import com.example.production_mes.entity.BasFactory;
import com.example.production_mes.entity.BasWorkshop;
import com.example.production_mes.service.BasWorkshopService;
import com.example.production_mes.utils.IDGenerator;
import com.example.production_mes.utils.TimeUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

/**
 * (BasWorkshop)表控制层
 *
 * @author makejava
 * @since 2020-09-16 09:09:31
 */
@RestController
@RequestMapping("basWorkshop")
public class BasWorkshopController {
    /**
     * 服务对象
     */
    @Resource
    private BasWorkshopService basWorkshopService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public BasWorkshop selectOne(String id) {
        return this.basWorkshopService.queryById(id);
    }
    @GetMapping("selectAll")
    public List<BasWorkshop> selectAll() {
        return this.basWorkshopService.queryAllByLimit(0,1000);
    }


    @GetMapping("deleteById")
    public Result deleteById(String id) {
        System.out.println(id);
        basWorkshopService.deleteById(id);
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
    public List<BasWorkshop> all(@Param("name") String name, @Param("address") String address, @Param("pageIndex") int pageIndex, @Param("pageSize")  int pageSize, Model model){
        List<BasWorkshop> BasWorkshopList = basWorkshopService.queryAllByLimit(pageIndex,pageSize);

        if(!name.equals(""))
        {

        }
        return BasWorkshopList;
    }

    @RequestMapping(value="/edit")
    public Result edit(@RequestBody HashMap<String, String> map
    ) {
        BasWorkshop BasWorkshop = new BasWorkshop();
        BasWorkshop.setId(map.get("id"));
        BasWorkshop.setFactoryId(map.get("factoryid"));
        BasWorkshop.setShopname(map.get("shopname"));
        BasWorkshop.setShopno(map.get("shopno"));
        BasWorkshop.setMaster(map.get("master"));
        BasWorkshop.setDescription(map.get("description"));
//        BasWorkshop.setRemarks(map.get("remarks"));
        BasWorkshop.setUpdateDate(TimeUtils.StringToDate(TimeUtils.NowTime()));
        BasWorkshop = basWorkshopService.update(BasWorkshop);
        return Result.success("修改成功");
    }
    @RequestMapping(value="/add")
    public Result add(@RequestBody HashMap<String, String> map
    ) {
        BasWorkshop BasWorkshop = new BasWorkshop();
        BasWorkshop.setId(IDGenerator.generateIDByDateStr());
        System.out.println(BasWorkshop.getId());
        BasWorkshop.setFactoryId(map.get("factoryid"));
        BasWorkshop.setShopname(map.get("shopName"));
        BasWorkshop.setShopno(map.get("shopNo"));
        BasWorkshop.setMaster(map.get("master"));
        BasWorkshop.setDescription(map.get("description"));
        BasWorkshop.setCreateBy(map.get("create_by"));
        BasWorkshop.setUpdateBy(map.get("updateBy"));
        BasWorkshop.setRemarks(map.get("remarks"));
        BasWorkshop.setDelFlag("0");
        BasWorkshop.setCreateDate(TimeUtils.StringToDate(TimeUtils.NowTime()));
        BasWorkshop.setUpdateDate(TimeUtils.StringToDate(TimeUtils.NowTime()));
        BasWorkshop.setCreateBy(map.get("createBy"));
        BasWorkshop.setUpdateBy(map.get("createBy"));
        basWorkshopService.insert(BasWorkshop);
        return Result.success("添加成功");
    }
    @RequestMapping(value="/edit2",method= RequestMethod.POST)
    public Result edit2(@ModelAttribute BasWorkshop BasWorkshop) {
        System.out.println(BasWorkshop.toString());
        basWorkshopService.update(BasWorkshop);
        return Result.success("修改成功");
    }
    @GetMapping("selectByName")
    public List<BasWorkshop>  selectByName(String shopname) {
        return this.basWorkshopService.queryByName(0,1000,shopname);
    }


}