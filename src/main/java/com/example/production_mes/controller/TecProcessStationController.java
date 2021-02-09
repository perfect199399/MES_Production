package com.example.production_mes.controller;

import com.example.production_mes.dto.Result;
import com.example.production_mes.entity.EquipRepair;
import com.example.production_mes.entity.TecFlowProcess;
import com.example.production_mes.entity.TecProcessStation;
import com.example.production_mes.service.TecProcessStationService;
import com.example.production_mes.utils.TimeUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.text.ParseException;
import java.util.HashMap;
import java.util.List;

import static com.example.production_mes.utils.IDGenerator.generateIDByDateStr;

/**
 * 工序与工站关系(TecProcessStation)表控制层
 *
 * @author makejava
 * @since 2020-09-16 09:09:56
 */
@RestController
@RequestMapping("tecProcessStation")
public class TecProcessStationController {
    /**
     * 服务对象
     */
    @Resource
    private TecProcessStationService tecProcessStationService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TecProcessStation selectOne(String id) {
        return this.tecProcessStationService.queryById(id);
    }


    /**
     * 查询所有数据
     * @return
     */
    @GetMapping("selectAll")
    public List<TecProcessStation> selectAll() {
        return this.tecProcessStationService.queryAllByLimit(0,100);
    }


    /**
     * 通过工序查询所有数据
     */
    @GetMapping("selectByName")
    public List<TecProcessStation> selectByName(String proname) {
        return this.tecProcessStationService.queryByName(0,1000,proname);
    }
    /**
     * 通过id删除指定数据
     * @param id
     * @return
     */
    @GetMapping("deleteById")
    public Result deleteById(String id) {
        tecProcessStationService.updateById(id);
        return Result.success("删除成功");
    }
    /**
     * 添加
     * @param map
     * @return
     */
    @RequestMapping(value="/add")
    public Result add(@RequestBody HashMap<String, String> map) throws ParseException {
        TecProcessStation tecProcessStation = new TecProcessStation();
        tecProcessStation.setId(generateIDByDateStr());
        tecProcessStation.setCreateBy(map.get("addPerson"));
        tecProcessStation.setUpdateBy(map.get("addPerson"));
        tecProcessStation.setUpdateDate(TimeUtils.StringToDate(TimeUtils.NowTime()));
        tecProcessStation.setCreateDate(TimeUtils.StringToDate(TimeUtils.NowTime()));
        tecProcessStation.setDelFlag("1");
        tecProcessStation.setStationId(map.get("stationid"));
        tecProcessStation.setLineId("689b1cde6dd243538c735e08b954acda");
        tecProcessStation.setProId(map.get("proid"));
        tecProcessStation = tecProcessStationService.insert(tecProcessStation);
        return Result.success("添加成功");
    }
    /**
     * 修改
     * @param map
     * @return
     */
    @RequestMapping(value="/edit")
    public Result edit(@RequestBody HashMap<String, String> map) throws ParseException {
        TecProcessStation tecProcessStation = new TecProcessStation();
        tecProcessStation.setId(map.get("id"));
        tecProcessStation.setUpdateBy(map.get("updatePerson"));
        tecProcessStation.setUpdateDate(TimeUtils.StringToDate(TimeUtils.NowTime()));
        tecProcessStation.setDelFlag("1");
        tecProcessStation.setStationId(map.get("stationid"));
        tecProcessStation.setLineId(map.get("lineid"));
        tecProcessStation.setProId(map.get("proid"));
        tecProcessStation = tecProcessStationService.update(tecProcessStation);
        return Result.success("修改成功");
    }

}