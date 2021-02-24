package com.mt.controller;

import com.mt.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author 111
 */
@RestController
@RequestMapping("consumer")
public class UserController {

    @Autowired()
    private RestTemplate restTemplate;


    @RequestMapping("{id}")
    public User show(){
        String url = "http://localhost:8081/provider/3";
        return restTemplate.getForObject(url,User.class);
    }
}
