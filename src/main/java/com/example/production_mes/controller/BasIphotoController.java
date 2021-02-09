package com.example.production_mes.controller;

import com.example.production_mes.dto.Result;
import com.example.production_mes.entity.BasIphoto;
import com.example.production_mes.entity.BasPad;
import com.example.production_mes.service.BasIphotoService;
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
 * (BasIphoto)表控制层
 *
 * @author makejava
 * @since 2020-09-16 09:09:26
 */
@RestController
@RequestMapping("basIphoto")
public class BasIphotoController {
    /**
     * 服务对象
     */
    @Resource
    private BasIphotoService basIphotoService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public BasIphoto selectOne(String id) {
        return this.basIphotoService.queryById(id);
    }

    /**
     * 查找全部
     * @return
     */
    @GetMapping("selectAll")
    public List<BasIphoto> selectAll() {
        return this.basIphotoService.queryAllByLimit(0,1000);
    }

    /**
     * 修改
     * @param map
     * @return
     */
    @RequestMapping(value="/edit")
    public Result edit(@RequestBody HashMap<String, String> map
    ) {
        BasIphoto bi = new BasIphoto();
        bi.setId(map.get("id"));
        bi.setQrcode(map.get("qrcode"));
        bi.setType(map.get("type"));
        bi.setSpec(map.get("spec"));
        bi.setCellId(map.get("cellId"));
        bi.setStationId(map.get("stationId"));
        bi.setIphotodistance(map.get("iphotodistance"));
        bi.setIphotoway(map.get("iphotoway"));
        bi.setFactorynumber(map.get("factorynumber"));
        bi.setPurpose(map.get("purpose"));
        bi.setBuydate(map.get("buydate"));
        bi.setPerson(map.get("person"));
        bi.setOrganization(map.get("organization"));
        bi.setCreateBy(map.get("createBy"));

        bi = basIphotoService.update(bi);
        return Result.success("修改成功");
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @GetMapping("delete")
    public Result delete(String id) {
        basIphotoService.deleteById(id);
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
        BasIphoto bi = new BasIphoto();
        bi.setId(generateIDByDateStr());
        bi.setQrcode(map.get("qrcode"));
        bi.setType(map.get("type"));
        bi.setSpec(map.get("spec"));
        bi.setCellId(map.get("cellId"));
        bi.setStationId(map.get("stationId"));
        bi.setIphotodistance(map.get("iphotodistance"));
        bi.setIphotoway(map.get("iphotoway"));
        bi.setFactorynumber(map.get("factorynumber"));
        bi.setPurpose(map.get("purpose"));
        bi.setBuydate(map.get("buydate"));
        bi.setPerson(map.get("person"));
        bi.setOrganization(map.get("organization"));
        bi.setCreateBy(map.get("createBy"));

        bi.setCreateDate(NowTimeN());
        bi.setUpdateBy("wyh");
        bi.setUpdateDate(NowTimeN());
        bi.setDelFlag("0");

        bi = basIphotoService.insert(bi);

        return Result.success("添加成功");
    }
}