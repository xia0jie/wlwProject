package com.example.wlw;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan("com.example.wlw.mapper")
@EnableSwagger2
public class WlwApplication {
    public static void main(String[] args) {
        SpringApplication.run(WlwApplication.class, args);
    }

}
