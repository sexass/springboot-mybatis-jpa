package com.example.springbootmybatis.service;

import com.example.springbootmybatis.dao.UserRepository;
import com.example.springbootmybatis.mapper.UserModelMapper;
import com.example.springbootmybatis.model.UserModel;
import com.example.springbootmybatis.model.UserWithDepartmentInfoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author:郭友文
 * @Data:2018/10/15 15:10
 * @Description:
 */
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserModelMapper userModelMapper;
    @Autowired
    private UserRepository userRepository;


    @Override
    @Transactional(rollbackFor = Exception.class)
    public void add(UserModel user) {
        userModelMapper.insert(user);
    }

    @Override
    public UserModel get(Long id) {
//        UserModel userModel=userModelMapper.selectByPrimaryKey(id);
        UserModel userModel=userRepository.findOne(id);
        return userModel;
    }

    @Override
    public UserWithDepartmentInfoDto getInfo(Long id) {
        UserWithDepartmentInfoDto info=userModelMapper.findOne(id);
        return info;
    }
}
