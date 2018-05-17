package com.example.springboot.service.Impl;

import com.example.springboot.mapper.UserMapper;
import com.example.springboot.modal.User;
import com.example.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectUserByName(String username) {
        return userMapper.selectUserByName(username);
    }

    @Override
    public List<User> selectUserAll() {
        return userMapper.selectAll();
    }
}
