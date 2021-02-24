package com.mt.controller;

import com.mt.model.User;


import com.mt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 111
 */
@RestController
@RequestMapping("provider")
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("{id}")
    public User show(@PathVariable("id") String id){

        return userService.findUserById(id);

    }
}
