package com.example.springbootmybatis.controller;

import com.example.springbootmybatis.model.UserModel;
import com.example.springbootmybatis.model.UserWithDepartmentInfoDto;
import com.example.springbootmybatis.service.IUserService;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:郭友文
 * @Data:2018/10/15 15:00
 * @Description:
 */
@RestController
@RequestMapping("/mybatis/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String insert(@RequestBody UserModel user){
        userService.add(user);
        return "保存成功";
    }

    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public String get(Long id){
        UserModel user=userService.get(id);
        return "userName:"+user.getName()+"\nsex:"+user.getSex()+"\nage:"+user.getAge();
    }
    @RequestMapping(value = "/getInfo",method = RequestMethod.GET)
    public String getWithDepartmentInfo(Long id){
        UserWithDepartmentInfoDto info=userService.getInfo(id);
        return "userName:"+info.getUserName()+"\nsex:"+info.getSex()+"\ndepartment:"+info.getDepartmentName();
    }
}
