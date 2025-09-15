package com.haust_acm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @FileName RunApplication
 * @Description
 * @Author ouyu
 * @Date 2025-09-13
 **/
@SpringBootApplication
@MapperScan("com.haust_acm.mapper")
public class RunApplication {
    public static void main(String[] args) {
        SpringApplication.run(RunApplication.class) ;
    }
}
