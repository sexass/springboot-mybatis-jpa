package com.example.springbootmybatis.dao;

import com.example.springbootmybatis.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author:郭友文
 * @Data:2018/10/29 10:49
 * @Description:
 */
@Repository
public interface UserRepository extends JpaRepository<UserModel,Long> {
}