package com.example.production_mes.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class MyMvcConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/index.html").setViewName("index");
        registry.addViewController("/login.html").setViewName("login");
        registry.addViewController("/equip_maintenance_plan.html").setViewName("equip_maintenance_plan");
        registry.addViewController("/equip_repair.html").setViewName("equip_repair");
        registry.addViewController("/equip_fault_report.html").setViewName("equip_fault_report");
        registry.addViewController("/bas.html").setViewName("bas");

    }
}
