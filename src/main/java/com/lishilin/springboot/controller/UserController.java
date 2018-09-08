package com.lishilin.springboot.controller;

import com.lishilin.springboot.pojo.Users;
import com.lishilin.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/user")
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/{page}")
    public String demo(@PathVariable(value = "page") String page){
        return page;
    }
    @RequestMapping(value = "insertUser")
    public String insertUser(Users users){
        userService.insertSelective(users);
        return "Ok.html";
    }

}
