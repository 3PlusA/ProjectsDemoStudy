package com.example.demo.controller;

import com.example.demo.common.Result;
import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController//定义其返回json类型
@RequestMapping("/user")//接口统一路由
public class UserController {

    @Resource
    UserMapper userMapper;

    @PostMapping//post接口,
    public Result save(@RequestBody User user){//RequestBody：json对象转化成转换成JAVA实体
        userMapper.insert(user);
        return Result.success();
    }
}
