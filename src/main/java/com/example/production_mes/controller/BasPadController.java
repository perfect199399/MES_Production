package com.example.production_mes.controller;

import com.example.production_mes.dto.Result;
import com.example.production_mes.entity.BasPad;
import com.example.production_mes.entity.EquipMaintenancePlan;
import com.example.production_mes.entity.EquipReport;
import com.example.production_mes.service.BasPadService;
import org.apache.ibatis.annotations.Param;
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
 * (BasPad)表控制层
 *
 * @author makejava
 * @since 2020-09-16 09:09:28
 */
@RestController
@RequestMapping("basPad")
public class BasPadController {
    /**
     * 服务对象
     */
    @Resource
    private BasPadService basPadService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public BasPad selectOne(String id) {
        return this.basPadService.queryById(id);
    }

    /**
     * 查找全部
     * @return
     */
    @GetMapping("selectAll")
    public List<BasPad> selectAll() {
        return this.basPadService.queryAllByLimit(0,1000);
    }

    /**
     * 修改
     * @param map
     * @return
     */
    @RequestMapping(value="/edit")
    public Result edit(@RequestBody HashMap<String, String> map
    ) {
        BasPad basPad = new BasPad();
        basPad.setId(map.get("id"));
        basPad.setQrcode(map.get("qrcode"));
        basPad.setType(map.get("type"));
        basPad.setSpec(map.get("spec"));
        basPad.setCellId(map.get("cellId"));
        basPad.setPadnucleus(map.get("padnucleus"));
        basPad.setPadmemory(map.get("padmemory"));
        basPad.setCapacity(map.get("capacity"));
        basPad.setSupplier(map.get("supplier"));
        basPad.setManufacturer(map.get("manufacturer"));
        basPad.setFactorynumber(map.get("factorynumber"));
        basPad.setPurpose(map.get("purpose"));
        basPad.setBuydate(map.get("buydate"));
        basPad.setPerson(map.get("person"));
        basPad.setOrganization(map.get("organization"));
        basPad = basPadService.update(basPad);
        return Result.success("修改成功");
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @GetMapping("delete")
    public Result delete(String id) {
        basPadService.delete(id);
        return Result.success("删除成功");
    }

    /**
     * 添加
     * @param map
     * @return
     */
    @RequestMapping(value="/add")
    public Result add(@RequestBody HashMap<String, String> map
    ) {
        BasPad basPad = new BasPad();
        basPad.setId(generateIDByDateStr());
        basPad.setCreateBy("1");
        basPad.setQrcode(map.get("qrcode"));
        basPad.setType(map.get("type"));
        basPad.setSpec(map.get("spec"));
        basPad.setStationId(map.get("stationId"));
        basPad.setCellId(map.get("cellId"));
        basPad.setPadnucleus(map.get("padnucleus"));
        basPad.setPadmemory(map.get("padmemory"));
        basPad.setCapacity(map.get("capacity"));
        basPad.setSupplier(map.get("supplier"));
        basPad.setManufacturer(map.get("manufacturer"));
        basPad.setFactorynumber(map.get("factorynumber"));
        basPad.setPurpose(map.get("purpose"));
        basPad.setBuydate(map.get("buydate"));
        basPad.setPerson(map.get("person"));
        basPad.setPadsc(map.get("padsc"));
        basPad.setCreateDate(NowTimeN());
        basPad.setUpdateBy("wyh");
        basPad.setUpdateDate(NowTimeN());
        basPad.setDelFlag("0");

        basPad = basPadService.insert(basPad);

        return Result.success("添加成功");
    }

    /**
     * 按条件查找
     * @param type
     * @param spec
     * @param id
     * @return
     */
    @GetMapping("select")
    public List<BasPad> select(@Param("type")String type, @Param("spec")String spec, @Param("id")String id) {
        return this.basPadService.query(type,spec,id);
    }
}