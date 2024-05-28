package org.example.controller;

import org.example.common.ResponseResult;
import org.example.domain.User;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/{id}")
    public ResponseResult findById(@PathVariable("id") Integer id){
        User user = userService.findById(id);
        return new ResponseResult(200,"操作成功",user);
    }
    @GetMapping("/user")
    public ResponseResult insertUser(@RequestBody User user){
        userService.insertUser(user);
        return new ResponseResult(200,"操作成功");
    }
}
