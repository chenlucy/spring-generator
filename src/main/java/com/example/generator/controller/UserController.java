package com.example.generator.controller;

import com.example.generator.entity.User;
import com.example.generator.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2018/7/13.
 */
@RestController
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping(value = "getById")
    public User getById(Integer id){
        return userService.selectByPrimaryKey(id);
    }
}
