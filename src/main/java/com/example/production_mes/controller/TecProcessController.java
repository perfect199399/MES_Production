package com.example.production_mes.controller;

import com.example.production_mes.dto.Result;
import com.example.production_mes.entity.EquipFaultReport;
import com.example.production_mes.entity.TecFlow;
import com.example.production_mes.entity.TecProcess;
import com.example.production_mes.service.TecProcessService;
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
 * 工艺基础数据维护（工序）(TecProcess)表控制层
 *
 * @author makejava
 * @since 2020-09-16 09:09:55
 */
@RestController
@RequestMapping("tecProcess")
public class TecProcessController {
    /**
     * 服务对象
     */
    @Resource
    private TecProcessService tecProcessService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TecProcess selectOne(String id) {
        return this.tecProcessService.queryById(id);
    }

    @GetMapping("selectAll")
    public List<TecProcess> selectAll() {
        return this.tecProcessService.queryAllByLimit(0,1000);
    }

    /**
     * 条件查询
     * @return
     */
    @GetMapping("select")
    public List<TecProcess> select(String procode) {
        return this.tecProcessService.select(procode);
    }

    @GetMapping("deleteById")
    public Result deleteById(String id) {
        tecProcessService.updateById(id);
        return Result.success("删除成功");
    }

    @RequestMapping(value="/edit")
    public Result edit(@RequestBody HashMap<String, String> map
    ) {
        TecProcess tecProcess = new TecProcess();
        tecProcess.setProcode(map.get("procode"));
        tecProcess.setProname(map.get("proname"));
        tecProcess.setId(map.get("id"));
        tecProcess.setProdesc(map.get("prodesc"));
        tecProcess.setUpdateBy(map.get("updatePerson"));
        tecProcess.setUpdateDate(TimeUtils.StringToDate(TimeUtils.NowTime()));
        tecProcess = tecProcessService.update(tecProcess);
        return Result.success("修改成功");
    }

    @RequestMapping(value="/add")
    public Result add(@RequestBody HashMap<String, String> map
    ) {
        TecProcess tecProcess = new TecProcess();
        tecProcess.setProcode(map.get("procode"));
        tecProcess.setProname(map.get("proname"));
        tecProcess.setProdesc(map.get("prodesc"));
        tecProcess.setCreateBy(map.get("addPerson"));
        tecProcess.setUpdateBy(map.get("addPerson"));
        tecProcess.setUpdateDate(TimeUtils.StringToDate(TimeUtils.NowTime()));
        tecProcess.setCreateDate(TimeUtils.StringToDate(TimeUtils.NowTime()));
        tecProcess.setDelFlag("1");
        tecProcess = tecProcessService.update(tecProcess);
        return Result.success("修改成功");
    }

}