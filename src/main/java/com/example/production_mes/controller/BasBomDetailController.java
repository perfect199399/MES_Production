package com.example.production_mes.controller;

import com.example.production_mes.entity.BasBomDetail;
import com.example.production_mes.service.BasBomDetailService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * (BasBomDetail)表控制层
 *
 * @author makejava
 * @since 2020-09-16 09:08:13
 */
@RestController
@RequestMapping("basBomDetail")
public class BasBomDetailController {
    /**
     * 服务对象
     */
    @Resource
    private BasBomDetailService basBomDetailService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public BasBomDetail selectOne(String id) {
        return this.basBomDetailService.queryById(id);
    }

    @GetMapping("selectAll")
    public List<BasBomDetail> selectAll() {
        return basBomDetailService.queryAllByLimit(0,100000);
    }

}