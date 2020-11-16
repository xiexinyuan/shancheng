package com.amazon.shancheng;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.amazon.shancheng.mapper")
@SpringBootApplication
public class ShanchengApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShanchengApplication.class, args);
    }

}
