package com.example.demo.controller;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.common.Result;
import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController//定义其返回json类型
@RequestMapping("/user")//接口统一路由
public class UserController {

    @Resource
    UserMapper userMapper;

    @PostMapping//post接口,新增
    public Result<?> save(@RequestBody User user){//RequestBody：json对象转化成转换成JAVA实体
        if(user.getPassword()==null){
            user.setPassword("123456");
        }
        userMapper.insert(user);
        return Result.success();
    }

    @GetMapping//get接口,获取数据库数据
    public Result<?> findPage(@RequestParam(defaultValue = "1") Integer pageNum,
                              @RequestParam(defaultValue = "10") Integer pageSize,
                              @RequestParam(defaultValue = "") String search){//RequestBody：json对象转化成转换成JAVA实体
        //mybatis提供的插件
        LambdaQueryWrapper<User> wrapper = Wrappers.<User>lambdaQuery();
        //防止昵称为空时查不出来
        if(StrUtil.isNotBlank(search)){
            wrapper.like(User::getNickName,search);
        }
        Page<User> userPage = userMapper.selectPage(new Page<>(pageNum,pageSize), wrapper);
        return Result.success(userPage);
    }

}
