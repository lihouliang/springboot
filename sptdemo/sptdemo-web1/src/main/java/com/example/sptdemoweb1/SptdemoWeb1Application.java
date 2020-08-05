package com.example.sptdemoweb1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.sptdemoweb1.dao")
public class SptdemoWeb1Application {

    public static void main(String[] args) {
        SpringApplication.run(SptdemoWeb1Application.class, args);
    }

}
