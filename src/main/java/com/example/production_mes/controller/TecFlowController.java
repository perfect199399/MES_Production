package com.example.production_mes.controller;

import com.example.production_mes.dto.Result;
import com.example.production_mes.entity.EquipRepair;
import com.example.production_mes.entity.TecFlow;
import com.example.production_mes.entity.TecProcess;
import com.example.production_mes.service.TecFlowService;
import com.example.production_mes.utils.TimeUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

import static com.example.production_mes.utils.IDGenerator.generateIDByDateStr;

/**
 * 工艺路由维护（流程）(TecFlow)表控制层
 *
 * @author makejava
 * @since 2020-09-16 09:09:54
 */
@RestController
@RequestMapping("tecFlow")
public class TecFlowController {
    /**
     * 服务对象
     */
    @Resource
    private TecFlowService tecFlowService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TecFlow selectOne(String id) {
        return this.tecFlowService.queryById(id);
    }



    @GetMapping("selectAll")
    public List<TecFlow> selectAll() {
        return this.tecFlowService.queryAllByLimit(0,1000);
    }

    /**
     * 条件查询
     * @return
     */
    @GetMapping("select")
    public List<TecFlow> select(String procode) {
        return this.tecFlowService.select(procode);
    }


    @GetMapping("deleteById")
    public Result deleteById(String id) {
        tecFlowService.updateById(id);
        return Result.success("删除成功");
    }

    @RequestMapping(value="/edit")
    public Result edit(@RequestBody HashMap<String, String> map
    ) {
        TecFlow tecFlow = new TecFlow();
        tecFlow.setFlowcode(map.get("flowcode"));
        tecFlow.setFlowname(map.get("flowname"));
        tecFlow.setId(map.get("id"));
        tecFlow.setFlowdesc(map.get("flowdesc"));
        tecFlow.setVersion(map.get("version"));
        tecFlow.setUpdateBy(map.get("updatePerson"));
        tecFlow.setUpdateDate(TimeUtils.StringToDate(TimeUtils.NowTime()));
        tecFlow = tecFlowService.update(tecFlow);
        return Result.success("修改成功");
    }

    @RequestMapping(value="/add")
    public Result add(@RequestBody HashMap<String, String> map
    ) {
        TecFlow tecFlow = new TecFlow();
        tecFlow.setFlowcode(map.get("flowcode"));
        tecFlow.setFlowname(map.get("flowname"));
        tecFlow.setId(generateIDByDateStr());
        tecFlow.setFlowdesc(map.get("flowdesc"));
        tecFlow.setVersion(map.get("version"));
        tecFlow.setCreateBy(map.get("addPerson"));
        tecFlow.setUpdateBy(map.get("addPerson"));
        tecFlow.setUpdateDate(TimeUtils.StringToDate(TimeUtils.NowTime()));
        tecFlow.setCreateDate(TimeUtils.StringToDate(TimeUtils.NowTime()));
        tecFlow.setDelFlag("1");
        tecFlow = tecFlowService.insert(tecFlow);
        return Result.success("修改成功");
    }

}