package com.mt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author 111
 */
@SpringBootApplication
public class ConsumerApplicationStarter {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplicationStarter.class,args);
    }
    @Bean

    public RestTemplate createRestTemplate(){
        return new RestTemplate();
    }

}
