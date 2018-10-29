package com.example.springbootmybatis.mapper;

import com.example.springbootmybatis.model.UserModel;
import com.example.springbootmybatis.model.UserWithDepartmentInfoDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author:郭友文
 * @Data:2018/10/29 11:47
 * @Description:
 */

public interface UserModelXmlMapper {

    int deleteByPrimaryKey(Long id);

    int insert(UserModel record);

    int insertSelective(UserModel record);

    UserModel selectByPrimaryKey(Long id);

    UserWithDepartmentInfoDto findOne(Long id);

    List<UserModel> findByDepartment(Long id);
}
