package com.example.production_mes.controller;

import com.example.production_mes.dto.Result;
import com.example.production_mes.entity.BasCodeprinter;
import com.example.production_mes.entity.BasPad;
import com.example.production_mes.service.BasCodeprinterService;
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
 * (BasCodeprinter)表控制层
 *
 * @author makejava
 * @since 2020-09-16 09:08:16
 */
@RestController
@RequestMapping("basCodeprinter")
public class BasCodeprinterController {
    /**
     * 服务对象
     */
    @Resource
    private BasCodeprinterService basCodeprinterService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public BasCodeprinter selectOne(String id) {
        return this.basCodeprinterService.queryById(id);
    }

    /**
     * 查找全部
     * @return
     */
    @GetMapping("selectAll")
    public List<BasCodeprinter> selectAll() {
        return this.basCodeprinterService.queryAllByLimit(0,1000);
    }

    /**
     * 修改
     * @param map
     * @return
     */
    @RequestMapping(value="/edit")
    public Result edit(@RequestBody HashMap<String, String> map
    ) {
        BasCodeprinter bcp = new BasCodeprinter();
        bcp.setId(map.get("id"));
        bcp.setQrcode(map.get("qrcode"));
        bcp.setType(map.get("type"));
        bcp.setSpec(map.get("spec"));
        bcp.setCellId(map.get("cellId"));
        bcp.setMode(map.get("mode"));
        bcp.setFactorynumber(map.get("factorynumber"));
        bcp.setResolution(map.get("resolution"));
        //bcp.setCreateDate(map.get("createDate"));
        bcp.setPerson(map.get("person"));
        bcp.setOrganization(map.get("organization"));
        bcp = basCodeprinterService.update(bcp);
        return Result.success("修改成功");
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @GetMapping("delete")
    public Result delete(String id) {
        //basCodeprinterService.delete(id);
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
        BasCodeprinter bcp = new BasCodeprinter();
        bcp.setQrcode(map.get("qrcode"));
        bcp.setCellId(map.get("cellId"));
        bcp.setId(map.get("id"));
        bcp.setSpec(map.get("stationId"));
        bcp.setMode(map.get("mode"));
        bcp.setResolution(map.get("resolution"));
        bcp.setOrganization(map.get("organization"));
        bcp.setPerson(map.get("person"));
        bcp.setCreateDate(NowTimeN());
        bcp.setStationId(map.get("stationId"));
        bcp.setCreateBy("wyh");
        bcp.setUpdateBy("wyh");
        bcp.setUpdateDate(NowTimeN());
        bcp.setDelFlag("0");
        bcp = basCodeprinterService.insert(bcp);

        return Result.success("添加成功");
    }

    /**
     * 按条件查找
     * @param type
     * @param spec
     * @param id
     * @return
     */
//    @GetMapping("select")
//    public List<BasCodeprinter> select(@Param("type")String type, @Param("spec")String spec, @Param("id")String id) {
//        //return this.basCodeprinterService.query(type,spec,id);
//    }
}