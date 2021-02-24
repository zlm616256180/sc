package com.mt.service.impl;

import com.mt.mapper.UserMapper;
import com.mt.model.User;
import com.mt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 111
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired(required = false)
    private UserMapper userMapper;

    @Override
    public User findUserById(String id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
