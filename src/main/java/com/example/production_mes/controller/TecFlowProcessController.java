package com.example.production_mes.controller;

import com.example.production_mes.dto.Result;
import com.example.production_mes.entity.QcViolaction;
import com.example.production_mes.entity.TecFlowProcess;
import com.example.production_mes.service.TecFlowProcessService;
import com.example.production_mes.utils.TimeUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;

import static com.example.production_mes.utils.IDGenerator.generateIDByDateStr;

/**
 * 工艺路由与工序关系(TecFlowProcess)表控制层
 *
 * @author makejava
 * @since 2020-09-16 09:09:55
 */
@RestController
@RequestMapping("tecFlowProcess")
public class TecFlowProcessController {
    /**
     * 服务对象
     */
    @Resource
    private TecFlowProcessService tecFlowProcessService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TecFlowProcess selectOne(String id) {
        return this.tecFlowProcessService.queryById(id);
    }

    /**
     * 查询所有数据
     */
    @GetMapping("selectAll")
    public List<TecFlowProcess>  selectAll() {
        return this.tecFlowProcessService.queryAllByLimit(0,1000);
    }
    /**
     * 通过工站名查询所有数据
     */
    @GetMapping("selectByName")
    public List<TecFlowProcess> selectByName(String flowname) {
        return this.tecFlowProcessService.queryByName(0,1000,flowname);
    }
    /**
     * 通过id删除指定数据
     * @param id
     * @return
     */
    @GetMapping("deleteById")
    public Result deleteById(String id) {
        tecFlowProcessService.updateById(id);
        return Result.success("删除成功");
    }
    /**
     * 添加
     * @param map
     * @return
     */
    @RequestMapping(value="/add")
    public Result add(@RequestBody HashMap<String, String> map) throws ParseException {
        TecFlowProcess tecFlowProcess = new TecFlowProcess();
        tecFlowProcess.setId(generateIDByDateStr());
        tecFlowProcess.setCreateBy(map.get("addPerson"));
        tecFlowProcess.setUpdateBy(map.get("addPerson"));
        tecFlowProcess.setUpdateDate(TimeUtils.StringToDate(TimeUtils.NowTime()));
        tecFlowProcess.setCreateDate(TimeUtils.StringToDate(TimeUtils.NowTime()));
        tecFlowProcess.setDelFlag("1");
        tecFlowProcess.setFlowId(map.get("flowid"));
        tecFlowProcess.setProId(map.get("proid"));
        tecFlowProcess.setSort(Integer.valueOf(map.get("sort")));
        tecFlowProcess = tecFlowProcessService.insert(tecFlowProcess);
        return Result.success("添加成功");
    }
    /**
     * 修改
     * @param map
     * @return
     */
    @RequestMapping(value="/edit")
    public Result edit(@RequestBody HashMap<String, String> map) throws ParseException {
        TecFlowProcess tecFlowProcess = new TecFlowProcess();
        tecFlowProcess.setId(map.get("id"));
        tecFlowProcess.setUpdateBy(map.get("updatePerson"));
        tecFlowProcess.setUpdateDate(TimeUtils.StringToDate(TimeUtils.NowTime()));
        tecFlowProcess.setDelFlag("1");
        tecFlowProcess.setFlowId(map.get("flowid"));
        tecFlowProcess.setProId(map.get("proid"));
        tecFlowProcess.setSort(Integer.valueOf(map.get("sort")));
        tecFlowProcess = tecFlowProcessService.update(tecFlowProcess);
        return Result.success("修改成功");
    }
}