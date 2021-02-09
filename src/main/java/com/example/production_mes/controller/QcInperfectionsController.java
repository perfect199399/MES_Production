package com.example.production_mes.controller;

import com.example.production_mes.dto.Result;
import com.example.production_mes.entity.QcInperfections;
import com.example.production_mes.entity.QcViolaction;
import com.example.production_mes.service.QcInperfectionsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * (QcInperfections)表控制层
 *
 * @author makejava
 * @since 2020-09-16 09:09:44
 */
@RestController
@RequestMapping("qcInperfections")
public class QcInperfectionsController {
    /**
     * 服务对象
     */
    @Resource
    private QcInperfectionsService qcInperfectionsService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public QcInperfections selectOne(String id) {
        return this.qcInperfectionsService.queryById(id);
    }

    /**
     * 查询所有数据
     */
    @GetMapping("selectAll")
    public List<QcInperfections> selectAll() {
        return this.qcInperfectionsService.queryAllByLimit(0,1000);
    }
    /**
     * 通过产品名查询所有数据
     */
    @GetMapping("selectByName")
    public List<QcInperfections>  selectByName(String pname) {
        return this.qcInperfectionsService.queryByName(0,1000,pname);
    }
    /**
     * 通过id删除指定数据
     * @param id
     * @return
     */
    @GetMapping("deleteById")
    public Result deleteById(String id) {
        qcInperfectionsService.updateById(id);
        return Result.success("删除成功");
    }
}