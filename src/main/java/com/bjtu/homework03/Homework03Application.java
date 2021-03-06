package com.bjtu.homework03;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@MapperScan("com.bjtu.homework03.mapper")
@SpringBootApplication
@EnableCaching
public class Homework03Application {
    public static void main(String[] args) {
        SpringApplication.run(Homework03Application.class, args);
    }

}
