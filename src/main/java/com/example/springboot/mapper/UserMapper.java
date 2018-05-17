package com.example.springboot.mapper;

import com.example.springboot.modal.User;
import tk.mybatis.mapper.common.BaseMapper;

import java.util.List;

public interface UserMapper extends BaseMapper<User> {
    List<User> selectUserByName(String username);
}
