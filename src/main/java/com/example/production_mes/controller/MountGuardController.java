package com.example.production_mes.controller;

import com.example.production_mes.entity.BasEmployees;
import com.example.production_mes.entity.BasWorkcell;
import com.example.production_mes.entity.EquipReport;
import com.example.production_mes.entity.MountGuard;
import com.example.production_mes.service.MountGuardService;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 员工上岗表(MountGuard)表控制层
 *
 * @author makejava
 * @since 2020-09-16 09:09:41
 */
@RestController
@RequestMapping("mountGuard")
public class MountGuardController {
    /**
     * 服务对象
     */
    @Resource
    private MountGuardService mountGuardService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public MountGuard selectOne(String id) {
        return this.mountGuardService.queryById(id);
    }

    @GetMapping("selectAll")
    public List<MountGuard> selectAll() {
        return this.mountGuardService.queryAllByLimit(0,1000);
    }

    @GetMapping("select")
    public List<MountGuard> select(@Param("type")String type, @Param("spec")String spec, @Param("id")String id) {

//        if(type.equals("电子秤"))
//            ctype="0001";
//        else if(type.equals("读卡器"))
//            ctype="0002";
//        else if(type.equals("条码打印机"))
//            ctype="0003";
//        else if(type.equals("安卓PAD"))
//            ctype="0004";
//        else if(type.equals("红外对射枪"))
//            ctype="0005";
//        if(spec.equals("重量"))
//            cspec="0001";
//        else if(spec.equals("体积"))
//            cspec="0002";
//        else if(spec.equals("长度"))
//            cspec="0003";
//        System.out.println(ctype);
//        System.out.println(cspec);
//        System.out.println(id);
        return this.mountGuardService.query(type,spec,id);
    }


    @GetMapping("selectByName")
    public List<MountGuard>  selectByName(String employeename) {
        return this.mountGuardService.queryByName(0,1000,employeename);
    }
}