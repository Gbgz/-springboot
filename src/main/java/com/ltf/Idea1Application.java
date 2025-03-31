package com.ltf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ltf.mapper")
public class Idea1Application {

    public static void main(String[] args) {
        SpringApplication.run(Idea1Application.class, args);
    }

}
