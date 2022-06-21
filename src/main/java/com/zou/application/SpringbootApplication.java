package com.zou.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author: 邹祥发
 * @date: 2022/6/20 20:39
 */
@SpringBootApplication
@ComponentScan(value = "com.zou.controller")
public class SpringbootApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }
}