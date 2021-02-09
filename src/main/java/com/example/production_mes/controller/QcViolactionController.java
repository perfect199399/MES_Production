package com.example.production_mes.controller;

import com.example.production_mes.dto.Result;
import com.example.production_mes.entity.QcViolaction;
import com.example.production_mes.entity.TecProcess;
import com.example.production_mes.service.QcViolactionService;
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
 * (QcViolaction)表控制层
 *
 * @author makejava
 * @since 2020-09-16 09:09:44
 */
@RestController
@RequestMapping("qcViolaction")
public class QcViolactionController {
    /**
     * 服务对象
     */
    @Resource
    private QcViolactionService qcViolactionService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public QcViolaction selectOne(String id) {
        return this.qcViolactionService.queryById(id);
    }

    /**
     * 查询所有数据
     */
    @GetMapping("selectAll")
    public List<QcViolaction>  selectAll() {
        return this.qcViolactionService.queryAllByLimit(0,1000);
    }

    /**
     * 通过工站名查询所有数据
     */
    @GetMapping("selectByName")
    public List<QcViolaction>  selectByName(String stationname) {
        return this.qcViolactionService.queryByName(0,1000,stationname);
    }

    /**
     * 通过id删除指定数据
     * @param id
     * @return
     */
    @GetMapping("deleteById")
    public Result deleteById(String id) {
        qcViolactionService.updateById(id);
        return Result.success("删除成功");
    }

    /**
     * 添加
     * @param map
     * @return
     */
    @RequestMapping(value="/add")
    public Result add(@RequestBody HashMap<String, String> map) throws ParseException {
        QcViolaction qcViolaction = new QcViolaction();
        qcViolaction.setId(generateIDByDateStr());
        qcViolaction.setCreateBy(map.get("addPerson"));
        qcViolaction.setUpdateBy(map.get("addPerson"));
        qcViolaction.setUpdateDate(TimeUtils.StringToDate(TimeUtils.NowTime()));
        qcViolaction.setCreateDate(TimeUtils.StringToDate(TimeUtils.NowTime()));
        qcViolaction.setDelFlag("1");
        qcViolaction.setStationId(map.get("stationid"));
        qcViolaction.setProId(map.get("proid"));
        qcViolaction.setUsername(map.get("username"));
        qcViolaction.setViolationDes(map.get("violationDes"));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        qcViolaction.setViolationTime(sdf.parse(map.get("violationTime")));
        qcViolaction = qcViolactionService.insert(qcViolaction);
        return Result.success("添加成功");
    }
    /**
     * 修改
     * @param map
     * @return
     */
    @RequestMapping(value="/edit")
    public Result edit(@RequestBody HashMap<String, String> map) throws ParseException {
        QcViolaction qcViolaction = new QcViolaction();
        qcViolaction.setId(map.get("id"));
        qcViolaction.setUpdateBy(map.get("updatePerson"));
        qcViolaction.setUpdateDate(TimeUtils.StringToDate(TimeUtils.NowTime()));
        qcViolaction.setDelFlag("1");
        qcViolaction.setStationId(map.get("stationid"));
        qcViolaction.setProId(map.get("proid"));
        qcViolaction.setUsername(map.get("username"));
        qcViolaction.setViolationDes(map.get("violationDes"));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        qcViolaction.setViolationTime(sdf.parse(map.get("violationTime")));
        qcViolaction = qcViolactionService.update(qcViolaction);
        return Result.success("修改成功");
    }



}