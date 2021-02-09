package com.example.production_mes.controller;

import com.example.production_mes.dto.Result;
import com.example.production_mes.entity.BasLine;
import com.example.production_mes.entity.BasWorkcell;
import com.example.production_mes.entity.BasWorkorder;
import com.example.production_mes.service.BasWorkorderService;
import com.example.production_mes.utils.IDGenerator;
import com.example.production_mes.utils.TimeUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

/**
 * (BasWorkorder)表控制层
 *
 * @author makejava
 * @since 2020-09-16 09:09:30
 */
@RestController
@RequestMapping("basWorkorder")
public class BasWorkorderController {
    /**
     * 服务对象
     */
    @Resource

    private  BasWorkorderService basWorkorderService;
    @GetMapping("deleteById")
    public Result deleteById(String id) {
        System.out.println(id);
        basWorkorderService.deleteById(id);
        return Result.success("删除成功");
    }
    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public BasWorkorder selectOne(String id) {
        return this.basWorkorderService.queryById(id);
    }

    @GetMapping("selectAll")
    public List<BasWorkorder> selectAll() {
        return this.basWorkorderService.queryAllByLimit(0,1000);
    }
    @GetMapping("selectByName")
    public List<BasWorkorder>  selectByselectByordercode(String ordercode) {
        return this.basWorkorderService.queryByName(0,1000,ordercode);

    }

    @RequestMapping(value="/add")
    public Result add(@RequestBody HashMap<String, String> map
    ) {
        BasWorkorder basWorkorder= new BasWorkorder();
        basWorkorder.setId(IDGenerator.generateIDByDateStr());
        System.out.println(basWorkorder.getId());
        basWorkorder.setOrderId(map.get("orderno"));
        basWorkorder.setOrdercode(map.get("orderno"));

        basWorkorder.setUnitname(map.get("unitName"));
        basWorkorder.setOrdertype(map.get("value1"));
        basWorkorder.setAmount(map.get("amount"));
        basWorkorder.setEststarttime(map.get("estStartTime"));
        basWorkorder.setEstendtime(map.get("estEndTime"));
        basWorkorder.setActstarttime(map.get("actStartTime"));
        basWorkorder.setEststarttime(map.get("estStartTime"));
        basWorkorder.setAmount(map.get("cellDescription"));
        basWorkorder.setOutamount(map.get("outAmount"));
        basWorkorder.setScrapamount(Integer.valueOf(map.get("scrapAmount")));
        basWorkorder.setState(map.get("value2"));
        basWorkorder.setProductId("1099999923123");
        basWorkorder.setLineId("12321312");
        basWorkorder.setRemarks("12312312");
        basWorkorder.setDelFlag("0");
        basWorkorder.setCreateBy("123123");
        basWorkorder.setUpdateBy("1231231");
        basWorkorder.setUpdateDate(TimeUtils.StringToDate(TimeUtils.NowTime()));
        basWorkorder.setCreateDate(TimeUtils.StringToDate(TimeUtils.NowTime()));
        basWorkorderService.insert(basWorkorder);
        return Result.success("添加成功");
    }
    @RequestMapping(value="/edit")
    public Result edit(@RequestBody HashMap<String, String> map
    ) {
        BasWorkorder basWorkorder = new BasWorkorder();
        basWorkorder.setId(IDGenerator.generateIDByDateStr());
//        System.out.println(basWorkorder.getId());
        basWorkorder.setOrderId(map.get("orderno"));
        basWorkorder.setOrdercode(map.get("orderno"));
        basWorkorder.setUnitname(map.get("unitname"));
        basWorkorder.setOrdertype(map.get("value1"));
        basWorkorder.setAmount(map.get("amount"));
//        basWorkorder.setEststarttime(map.get("eststarttime"));
        basWorkorder.setEstendtime(map.get("estendTime"));
        basWorkorder.setActstarttime(map.get("actstarttime"));
        basWorkorder.setEststarttime(map.get("eststartTime"));
//        basWorkorder.setAmount(map.get("cellDescription"));
        basWorkorder.setOutamount(map.get("outamount"));
//        basWorkorder.setOutamount(map.get("outamount"));
        basWorkorder.setState(map.get("value2"));
        basWorkorder = basWorkorderService.update(basWorkorder);
        return Result.success("修改成功");
    }
    @RequestMapping(value="/edit2",method= RequestMethod.POST)
    public Result edit2(@ModelAttribute BasWorkorder basWorkorder) {
        System.out.println(basWorkorder.toString());
        basWorkorderService.update(basWorkorder);
        return Result.success("修改成功");
    }


}