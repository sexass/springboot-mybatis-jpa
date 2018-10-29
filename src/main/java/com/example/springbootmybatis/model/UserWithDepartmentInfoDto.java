package com.example.springbootmybatis.model;

/**
 * @Author:郭友文
 * @Data:2018/10/29 10:39
 * @Description:
 */

public class UserWithDepartmentInfoDto {
    private String userName;
    private String sex;
    private String departmentName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
