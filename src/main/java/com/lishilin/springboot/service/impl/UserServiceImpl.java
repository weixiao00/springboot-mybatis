package com.lishilin.springboot.service.impl;

import com.lishilin.springboot.dao.UsersMapper;
import com.lishilin.springboot.pojo.Users;
import com.lishilin.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UsersMapper usersMapper;
    @Override
    public void insertSelective(Users users){
       usersMapper.insert(users);
    }
}
