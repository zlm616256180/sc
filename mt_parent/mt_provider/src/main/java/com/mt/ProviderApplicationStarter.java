package com.mt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author 111
 */
@SpringBootApplication
@MapperScan("com.mt.mapper")

public class ProviderApplicationStarter {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplicationStarter.class, args);
    }
}