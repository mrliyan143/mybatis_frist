package com.itheima.service.impl;

import com.itheima.dao.UserMapper;
import com.itheima.pojo.Users;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    public Users findIdByUser(Integer id) {
        return userMapper.findIdByUser(id);
    }
}
