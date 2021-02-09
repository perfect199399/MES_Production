package com.example.production_mes.controller;

import com.example.production_mes.dto.Result;
import com.example.production_mes.service.BasBomService;
import com.example.production_mes.utils.RedisUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("radis")
public class RadisController {


    @Resource
    private RedisUtil redisUtil;

    @RequestMapping("get")
    public Object redisget(String key){
        return Result.success("系统访问量",redisUtil.get(key));
    }
}