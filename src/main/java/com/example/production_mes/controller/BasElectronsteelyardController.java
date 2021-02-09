package com.example.production_mes.controller;

import com.example.production_mes.dto.Result;
import com.example.production_mes.entity.BasElectronsteelyard;
import com.example.production_mes.entity.BasPad;
import com.example.production_mes.service.BasElectronsteelyardService;
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
 * (BasElectronsteelyard)表控制层
 *
 * @author makejava
 * @since 2020-09-16 09:08:16
 */
@RestController
@RequestMapping("basElectronsteelyard")
public class BasElectronsteelyardController {
    /**
     * 服务对象
     */
    @Resource
    private BasElectronsteelyardService basElectronsteelyardService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public BasElectronsteelyard selectOne(String id) {
        return this.basElectronsteelyardService.queryById(id);
    }

    /**
     * 查找全部
     * @return
     */
    @GetMapping("selectAll")
    public List<BasElectronsteelyard> selectAll() {
        return this.basElectronsteelyardService.queryAllByLimit(0,1000);
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @GetMapping("delete")
    public Result delete(String id) {
        basElectronsteelyardService.deleteById(id);
        return Result.success("删除成功");
    }

    /**
     * 修改
     * @param map
     * @return
     */
    @RequestMapping(value="/edit")
    public Result edit(@RequestBody HashMap<String, String> map
    ) {
        BasElectronsteelyard be = new BasElectronsteelyard();
        be.setId(map.get("id"));
        be.setQrcode(map.get("qrcode"));
        be.setType(map.get("type"));
        be.setSpec(map.get("spec"));
        be.setCellId(map.get("cellId"));
        be.setStationId(map.get("stationId"));
        be.setEsname(map.get("esname"));
        be.setEsrange(map.get("esrange"));
        be.setEsweight(map.get("esweight"));
        be.setSupplier(map.get("supplier"));
        be.setManufacturer(map.get("manufacturer"));
        be.setFactorynumber(map.get("factorynumber"));
        be.setPurpose(map.get("purpose"));
        be.setBuydate(map.get("buydate"));
        be.setPerson(map.get("person"));
        be.setOrganization(map.get("organization"));

        be = basElectronsteelyardService.update(be);
        return Result.success("修改成功");
    }

    /**
     * 添加
     * @param map
     * @return
     */
    @RequestMapping(value="/add")
    public Result add(@RequestBody HashMap<String, String> map
    ) {
        BasElectronsteelyard be = new BasElectronsteelyard();
        be.setId("001");
        be.setQrcode(map.get("qrcode"));
        be.setType(map.get("type"));
        be.setSpec(map.get("spec"));
        be.setCellId(map.get("cellId"));
        be.setStationId(map.get("stationId"));
        be.setEsname(map.get("esname"));
        be.setEsrange(map.get("esrange"));
        be.setEsweight(map.get("esweight"));
        be.setSupplier(map.get("supplier"));
        be.setManufacturer(map.get("manufacturer"));
        be.setFactorynumber(map.get("factorynumber"));
        be.setPurpose(map.get("purpose"));
        be.setBuydate(map.get("buydate"));
        be.setPerson(map.get("person"));
        be.setOrganization(map.get("organization"));
        be.setCreateBy(map.get("person"));
        be.setCreateDate(NowTimeN());
        be.setUpdateBy("wyh");
        be.setUpdateDate(NowTimeN());
        be.setDelFlag("0");

        be = basElectronsteelyardService.insert(be);

        return Result.success("添加成功");
    }

}