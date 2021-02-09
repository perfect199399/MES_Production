package com.example.production_mes.controller;

import com.example.production_mes.dto.Result;
import com.example.production_mes.entity.BasCardreader;
import com.example.production_mes.entity.BasPad;
import com.example.production_mes.service.BasCardreaderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

import static com.example.production_mes.utils.IDGenerator.generateIDByDateStr;
import static com.example.production_mes.utils.TimeUtils.NowTimeN;

/**
 * (BasCardreader)表控制层
 *
 * @author makejava
 * @since 2020-09-16 09:08:13
 */
@RestController
@RequestMapping("basCardreader")
public class BasCardreaderController {
    /**
     * 服务对象
     */
    @Resource
    private BasCardreaderService basCardreaderService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public BasCardreader selectOne(String id) {
        return this.basCardreaderService.queryById(id);
    }

    /**
     * 查找全部
     * @return
     */
    @GetMapping("selectAll")
    public List<BasCardreader> selectAll() {
        return this.basCardreaderService.queryAllByLimit(0,1000);
    }

    /**
     * 添加
     * @param map
     * @return
     */
    @RequestMapping(value="/add")
    public Result add(@RequestBody HashMap<String, String> map
    ) {
        BasCardreader bcr = new BasCardreader();
        bcr.setId(map.get("id"));
        bcr.setCellId(map.get("cellId"));
        bcr.setQrcode(map.get("qrcode"));
        bcr.setType(map.get("type"));
        bcr.setSpec(map.get("spec"));
        bcr.setStationId(map.get("stationId"));
        bcr.setReaderspeed(map.get("readerspeed"));
        bcr.setReadertype(map.get("readtype"));
        bcr.setTimeinterval(map.get("timeinterval"));
        bcr.setDistance(map.get("distance"));
        bcr.setFrequency(map.get("frequency"));
        bcr.setSupplier(map.get("supplier"));
        bcr.setManufacturer(map.get("manufacturer"));
        bcr.setFactorynumber(map.get("factorynumber"));
        bcr.setPurpose(map.get("purpose"));
        bcr.setBuydate(NowTimeN());
        bcr.setPerson(map.get("person"));
        bcr.setOrganization(map.get("organization"));
        bcr.setCreateDate(NowTimeN());
        bcr.setUpdateBy("wyh");
        bcr.setUpdateDate(NowTimeN());
        bcr.setCreateBy("wyh");
        bcr.setDelFlag("0");

        bcr = basCardreaderService.insert(bcr);

        return Result.success("添加成功");
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @GetMapping("delete")
    public Result delete(String id) {
        basCardreaderService.deleteById(id);
        return Result.success("删除成功");
    }
}