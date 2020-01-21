package com.dousl.learn.boot2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.dousl.learn.boot2.dao.mapper")
public class LearnBoot2Application {

    public static void main(String[] args) {
        SpringApplication.run(LearnBoot2Application.class, args);
    }

}
