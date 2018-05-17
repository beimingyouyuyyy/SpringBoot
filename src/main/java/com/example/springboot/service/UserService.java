package com.example.springboot.service;

import com.example.springboot.modal.User;

import java.util.List;

public interface UserService {
    List<User> selectUserByName(String username);

    List<User> selectUserAll();
}
