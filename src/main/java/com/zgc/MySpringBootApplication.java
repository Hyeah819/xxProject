package com.zgc;

import lombok.extern.slf4j.Slf4j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication/*标注SpringBoot的启动类*/
@MapperScan("com.zgc.mapper")/*用了通用mapper之后，这个扫描的就要用tk.mybatis包的*/
public class MySpringBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(MySpringBootApplication.class);
    }
}
