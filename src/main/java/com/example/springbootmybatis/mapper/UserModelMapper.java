package com.example.springbootmybatis.mapper;

import com.example.springbootmybatis.model.UserModel;
import java.util.List;

import com.example.springbootmybatis.model.UserWithDepartmentInfoDto;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface UserModelMapper {
    @Select("select * from user u where u.id=#{id}")
    UserModel selectByPrimaryKey(Long id);
    @Insert("insert into user(name,age) values(#{name},#{age})")
    int insert(UserModel userModel);
    @Select("select u.name userName,u.sex sex,d.name departmentName from user u,department d where u.department_id=d.id and u.id=#{id}")
    UserWithDepartmentInfoDto findOne(Long id);
}