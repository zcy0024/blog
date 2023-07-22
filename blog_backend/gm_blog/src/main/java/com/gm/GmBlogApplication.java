package com.gm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.gm.mapper")
public class GmBlogApplication {
    public static void main(String[] args) {
        SpringApplication.run(GmBlogApplication.class, args);
    }
}
