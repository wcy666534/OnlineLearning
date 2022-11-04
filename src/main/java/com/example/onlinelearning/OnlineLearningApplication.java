package com.example.onlinelearning;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(basePackages = {"com.example.onlinelearning.dao"})
/*@ComponentScan(basePackages = { "com.example.onlinelearning" })*/
public class OnlineLearningApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnlineLearningApplication.class, args);
    }

}
