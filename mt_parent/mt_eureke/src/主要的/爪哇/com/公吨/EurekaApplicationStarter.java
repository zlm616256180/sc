package com.mt;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author 111
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplicationStarter {
    public static void main(String[] agrs){
        SpringApplication.run(EurekaApplicationStarter.class,agrs);
        
        System.out.println(23434);System.out.println(34324334);
    }
}
