package com.example.springbootmybatis.service;

import com.example.springbootmybatis.model.UserModel;
import com.example.springbootmybatis.model.UserWithDepartmentInfoDto;

/**
 * @Author:郭友文
 * @Data:2018/10/15 15:10
 * @Description:
 */

public interface IUserService {
    void add(UserModel user);
    UserModel get(Long id);
    UserWithDepartmentInfoDto getInfo(Long id);
    UserWithDepartmentInfoDto getInfoByXmlMapper(Long id);
}