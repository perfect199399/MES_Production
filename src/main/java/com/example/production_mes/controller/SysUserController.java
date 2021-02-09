package com.example.production_mes.controller;

import com.example.production_mes.dto.LoginDto;
import com.example.production_mes.dto.Result;
import com.example.production_mes.entity.SysUser;
import com.example.production_mes.service.SysUserService;
import com.example.production_mes.utils.RedisUtil;
import com.example.production_mes.utils.TimeUtils;
import com.example.production_mes.utils.getUserIp;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.Date;

import static com.example.production_mes.utils.Md5Utils.getMd5Code;
import static com.example.production_mes.utils.TimeUtils.NowTimeN;

/**
 * 用户表(SysUser)表控制层
 *
 * @author makejava
 * @since 2020-09-16 09:09:52
 */
@RestController
@RequestMapping("sysUser")
public class SysUserController {
    /**
     * 服务对象
     */
    @Resource
    private SysUserService sysUserService;


    @Resource
    private RedisUtil redisUtil;
    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SysUser selectOne(String id) {
        return this.sysUserService.queryById(id);
    }

    /**
     * 登陆
     * @param loginDto
     * @param response
     * @return
     */
    @PostMapping("login")
    public Result login(@RequestBody LoginDto loginDto, HttpServletResponse response,HttpServletRequest request){

        SysUser sysUser = sysUserService.queryByLoginName(loginDto.getLogin_name());
        if (sysUser == null || !sysUser.getPassword().equals(getMd5Code(loginDto.getPassword()))) {
            return Result.error("账号或密码错误");
        }
        String LoginIp = sysUser.getLoginIp();
        Date LoginDate = sysUser.getLoginDate();    
        updataTimeIp(sysUser,request);
        sysUser.setLoginIp(LoginIp);
        sysUser.setLoginDate(LoginDate);
        /**
         * radis操作,系统登陆数量+1
         */
        int lognums = Integer.parseInt(redisUtil.get("lognums").toString());
        lognums = lognums+1;
        redisUtil.set("lognums",lognums);
        return Result.success("登录成功",sysUser);
    }
    /**
     * 更新用户登录时间和登录地点
     * @param sysUser
     * @param request
     * @return
     */
    public String updataTimeIp(SysUser sysUser, HttpServletRequest request) {
        SysUser sysUser2 = sysUser;
        getUserIp getUserip = new getUserIp();
        sysUser2.setLoginIp(getUserip.getIp(request));
        sysUser2.setLoginDate(NowTimeN());
        updata(sysUser2);
        return "success";
    }

    /**
     * 用户更新
     * @param sysUser
     * @return
     */
    public String updata(SysUser sysUser) {
        sysUserService.update(sysUser);
        return "success";
    }
}