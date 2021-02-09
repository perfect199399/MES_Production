package com.example.production_mes.utils;

import javax.servlet.http.HttpServletRequest;
import java.net.Inet4Address;
import java.net.InetAddress;

public class getUserIp {
    public getUserIp() {
    }

    /**
     * 获取客户端真实ip地址
     * @param request
     * @return
     */
    public String getIp(HttpServletRequest request){
        /**
         * 获取距离服务器最远的那个ip
         */
        String ip = request.getHeader("x-forwarded-for");
        if (ipIsNullOrEmpty(ip)){
            /**
             * apache http服务代理加上的ip
             */
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ipIsNullOrEmpty(ip)){
            /**
             * weblogic插件加上的头
             */
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ipIsNullOrEmpty(ip)){
            /**
             * 真实ip
             */
            ip = request.getHeader("X-Real-IP");
        }
        if (ipIsNullOrEmpty(ip)){
            /**
             * 最后真实的ip
             */
            ip = request.getRemoteAddr();
        }
        return ip;
    }

    /**
     * 当前ip是否为空
     * @param ip
     * @return
     */
    public boolean ipIsNullOrEmpty(String ip){
        if(ip == null || ip.length()==0 || "unknown".equalsIgnoreCase(ip)){
            return true;
        }
        return false;
    }

    /**
     * 获取局域网内Ip
     * @return
     */
    public String getLocalIp()
    {
        try {
            InetAddress ip4 = Inet4Address.getLocalHost();
            return ip4.getHostAddress();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "0.0.0.0";
    }

}
