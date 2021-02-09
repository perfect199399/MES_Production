package com.example.production_mes;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@MapperScan("com.example.production_mes.dao")
//@SpringBootApplication(scanBasePackages = {"com.example.production_mes.pojo"})
@SpringBootApplication
public class ProductionMesApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductionMesApplication.class, args);
    }

}
